package com.lgcns.senior.ssp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class BookThreadIndexLoader {

	private static final String TITLE_TAG = "<dcterms:title>";
	private static final String CREATOR_START_TAG = "<dcterms:creator>";
	private static final String CREATOR_END_TAG = "</dcterms:creator>";
	private static final String NAME_TAG = "<pgterms:name>";
	private static final String BIRTH_TAG = "<pgterms:birthdate";

	private static final int FIND_TAG_NUM = 3;

	private static final int PER_THREAD = 500;
//	private static final int PER_THREAD = 10000;

	protected static AtomicInteger fileCount = new AtomicInteger(0);
	protected static AtomicInteger perfectCount = new AtomicInteger(0);

	protected static Map<String, String[]> contents = new ConcurrentHashMap<String, String[]>();

	public BookThreadIndexLoader(String path) {
		System.out.println("************ Start Indexing ************");
		long startTime = System.currentTimeMillis();
		File[] files = new File(path).listFiles();
		
		int seed = ( files.length / PER_THREAD );
		System.out.println(" - SEED   :" + seed);
		
		ExecutorService executor = Executors.newFixedThreadPool( seed + 1);

		for (int idx = 0; idx <= seed ; idx++) {
			Runnable worker = new EachIndexer(files, idx);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println(" - File/Perfect/Index:" + fileCount.get() + "/" + perfectCount.get() + "/" + contents.size());
		System.out.format(" - Elapsed   : %,d%n", (System.currentTimeMillis() - startTime));
		System.out.println("************ End Indexing ************");
	}

	public List<String[]> findBook(String keyword) {
		System.out.println("************ Start Finding["+ keyword+"] ************");
		long startTime = System.currentTimeMillis();
		List<String[]> rtnList = new ArrayList<String[]>();
		for (String key : contents.keySet()) {
			if( key.contains(keyword)) {
				System.out.println(" --Find : "+ key );
				rtnList.add(contents.get(key));
			}
		}
		System.out.println(" - Find:" + rtnList.size());
		System.out.format(" - Elapsed   : %,d%n", (System.currentTimeMillis() - startTime));
		System.out.println("************ End Finding ************");
		
		return rtnList;
	}

	public static class EachIndexer implements Runnable {
		private final int seed;
		private final File[] files;

		EachIndexer(File[] files, int seed) {
			this.files = files;
			this.seed = seed;
		}

		@Override
		public void run() {
			int limit = (seed + 1) * PER_THREAD;
			//int limit = seed * PER_THREAD +50;

			int idx = seed * PER_THREAD;
			for (; idx < limit && idx < files.length ; idx++) {
				File folder = files[idx];
				File[] list = folder.listFiles();

				if (list != null) {
					for (File file : list) {
						if (!file.isDirectory()) {
							loadIndex(file);
						}
					}		
				}
			}
			System.out.println(" -- THREAD for [ " + seed +" ] end : " + idx );
		}

		private void loadIndex(File inFile) {
			BookThreadIndexLoader.fileCount.incrementAndGet();
			BufferedReader br = null;
			int findCount = 0;

			String titleFirstLine = "";
			String[] content = new String[FIND_TAG_NUM+1];
			boolean creatorStartFg = false;
			boolean creatorEndFg = false;

			try {
				content[3] = inFile.getPath();
				
				if( content[3].contains("\\")) {
					content[3] = content[3].replace("\\","/");
				}

				br = new BufferedReader(new FileReader(inFile));
				String line;
				while ((line = br.readLine()) != null &&
						findCount < FIND_TAG_NUM &&
						( !creatorEndFg || content[0] == null ) ){
					line = line.trim();

					if (creatorStartFg && !creatorEndFg) {
						if (line.startsWith(NAME_TAG)) {
							content[1] = line.substring(NAME_TAG.length(), line.indexOf("</"));
							findCount++;
						} else if (line.startsWith(BIRTH_TAG)) {
							content[2] = line.substring(line.indexOf(">") + 1, line.indexOf("</"));
							findCount++;
						} else if (line.startsWith(CREATOR_END_TAG)) {
							creatorEndFg = true;
						}
					} else if (line.startsWith(CREATOR_START_TAG)) {
						creatorStartFg = true;
					} else if (line.startsWith(TITLE_TAG) || !"".equals(titleFirstLine)) {

						if (line.indexOf("</") > 0) {
							if (!"".equals(titleFirstLine)) {
								line = titleFirstLine + line;
								titleFirstLine = "";
							}
							content[0] = line.substring(TITLE_TAG.length(), line.indexOf("</"));
							findCount++;
						} else {
							titleFirstLine += line;
						}
					}
				}
				if (content[0] != null) {
					if (findCount == FIND_TAG_NUM) {
						perfectCount.incrementAndGet();
					}
					if( content[2] == null)
						content[2] ="";
					
					contents.put(content[0], content);
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null)
					try {
						br.close();
					} catch (IOException e) {}
			}
		}
	}

}

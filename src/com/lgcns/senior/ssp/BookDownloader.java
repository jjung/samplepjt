package com.lgcns.senior.ssp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BookDownloader {

	private static final String BASE_URL = "https://www.gutenberg.org";
	private static final String REDIRECT_URL = "http://www.gutenberg.org/cache/epub/";

	private static final String START_MARKER = "<h2 id=\"books-last1\">";
	private static final String URL_PATTERN = "href";
	private static final String FINISH_MARKER = "</ol>";
	private static final String REDIRECT_MARKER = ".txt.utf-8";

	private static final String DOWNLOAD_PATTERN = "Plain Text UTF-8";

	private static final String SAVE_DIR = "down/simple/";

	public static void main(String[] args) {
		BookDownloader loader = new BookDownloader();

		try {
			loader.sendingGetRequest();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// HTTP GET request
	private void sendingGetRequest() throws Exception {

		
		long startTime = System.currentTimeMillis();

		HttpURLConnection con = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		List<String> urlList = new ArrayList<String>();

		int bookCount = 0;
		int downCount = 0;
		int redirectCount = 0;

		try {
			con = (HttpURLConnection) (new URL(BASE_URL + "/browse/scores/top")).openConnection();
			con.setRequestMethod("GET");
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String output;
			boolean startFg = false;

			while ((output = in.readLine()) != null) {
				if (startFg) {
					if (output.contains(URL_PATTERN)) {
						urlList.add(extractUrl(output));
					} else if (output.contains(FINISH_MARKER)) {
						System.out.println("**********  Finish Read Download link *************");
						break;
					}
				} else if (output.contains(START_MARKER)) {
					System.out.println("**********  Start Read Download link *************");
					startFg = true;
				}
			}
			in.close();
			con.disconnect();
			bookCount = urlList.size();

			for (String eachUrl : urlList) {
				con = (HttpURLConnection) (new URL(BASE_URL + eachUrl)).openConnection();
				con.setRequestMethod("GET");

				String fileURL = null;
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				while ((output = in.readLine()) != null && fileURL == null) {
					if (output.contains(DOWNLOAD_PATTERN)) {
						System.out.println("DOWNLOAD_PATTERN : " + extractUrl(output));
						fileURL = extractUrl(output);
					}
				}
				in.close();
				con.disconnect();
				if (fileURL != null) {
					
					if(fileURL.endsWith(REDIRECT_MARKER)  ) {
						String fileNum = fileURL.substring(fileURL.lastIndexOf("/") + 1, fileURL.length()- REDIRECT_MARKER.length());
						fileURL = REDIRECT_URL + fileNum +"/pg" +fileNum +".txt";
						System.out.println(" -->REDIRECT_URL : " + fileURL);
						redirectCount++;
					} else {
						fileURL = "https:" + fileURL;
					}
					String fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1, fileURL.length());

					con = (HttpURLConnection) (new URL(fileURL)).openConnection();
					con.setRequestMethod("GET");
					in = new BufferedReader(new InputStreamReader(con.getInputStream()));

					out = new BufferedWriter(new FileWriter(SAVE_DIR + fileName));
					while ((output = in.readLine()) != null) {
						out.write(output);
						out.newLine();
					}

					downCount++;

					out.close();
					in.close();
					con.disconnect();
				} else {
					System.out.println("- Cannot find Plain Text UTF-8 : " + eachUrl);
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {

			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
				}
			}
			if (con != null) {
				try {
					con.disconnect();
				} catch (Exception e) {
				}

			}
		}
		System.out.println("******** Download Complete***************** ");
		System.out.println("- Total / Download / Redirect:" + bookCount +" / " + downCount + " / " +redirectCount);
		System.out.println("- Elapsed :" + ( System.currentTimeMillis() - startTime ));
	}

	private String extractUrl(String in) {
		int start = in.indexOf('"', in.indexOf(URL_PATTERN));
		int end = in.indexOf('"', start + 1);
		return in.substring(start + 1, end);

	}

}

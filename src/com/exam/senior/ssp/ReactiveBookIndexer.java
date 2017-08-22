package com.exam.senior.ssp;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReactiveBookIndexer {

	private static Charset charset = Charset.forName("UTF-8");
	private static CharsetDecoder decoder = charset.newDecoder();
	private static Path root = Paths.get("D:/D/cache/epub");
	
	private static final int flags = Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.DOTALL;
	private static final Pattern titlePattern = Pattern.compile(".*dcterms:title>(.*)<\\/dcterms:title.*", flags);
	private static final Pattern creatorPattern = Pattern.compile(".*dcterms:creator>(.*)<\\/dcterms:creator", flags);
	private static final Pattern namePattern = Pattern.compile("pgterms:name>(.*)<\\/pgterms:name", flags);
	private static final Pattern birthPattern = Pattern.compile("pgterms:birthdate>(.*)<\\/pgterms:birthdate", flags);
	
	private static List<Pair<Path,String>> index;
	
	public static void main(String[] args) throws Exception {

		long beginAt = System.currentTimeMillis();
		System.out.format("[Index begin]********************************%n");
		index = Files.find(root, 2, ReactiveBookIndexer::isRdfFile)
			.parallel()
			.map(ReactiveBookIndexer::pathWithContent)
			.map(ReactiveBookIndexer::buildIndex)
			.sorted(ReactiveBookIndexer::compairIndex)
			.collect(Collectors.toList());
		System.out.format("* Index files: %,d(ms)%n", System.currentTimeMillis() - beginAt);
		System.out.format("[Index end  ]********************************%n");
	}

	private static int compairIndex(Pair<Path, String> e1, Pair<Path, String> e2) {
		if (e2 == null && e2.getSecond() == null) {
			return -1;
		}
		return e2.getSecond().compareTo(e1.getSecond());
	}
	
	private static Pair<Path, String> buildIndex(Pair<Path, CharBuffer> p) {
		Pair<Path, String> result = null;
		try {
			Matcher m = getTitleMatcher(p.getSecond());
			if (m != null && m.find()) {
				String title = m.group(1);
				title = title.replaceAll("&#13;", "");
				title = title.replace('\n', ' ');
				result = new Pair(p, title);
			}
		} catch (IOException e) {
			System.err.format("[ERR] %-15s | %s%n", p.toString(), e.getMessage());
		} catch (RuntimeException e) {
			System.err.format("[ERR] %-15s | %s%n", p.toString(), e.getMessage());
		}
		return result;
	}

	private static boolean isRdfFile(Path path, BasicFileAttributes attr) {
		return attr.isRegularFile() && 
		       path.getFileName().endsWith(".rdf");
	}

	public static Matcher getTitleMatcher(CharBuffer contents) throws IOException {
		return (contents == null) ? null : titlePattern.matcher(contents);
	}
	
	public static Matcher getCreatorMatcher(CharBuffer contents) throws IOException {
		return (contents == null) ? null : creatorPattern.matcher(contents);
	}

	public static Pair<Path, CharBuffer> pathWithContent(Path p) {
		Pair<Path, CharBuffer> result = null;
		try {
			result = new Pair(p, getFileContents(p));
		} catch (IOException e) {
			System.err.format("[ERR] %-15s | %s%n", p.toString(), e.getMessage());
		}
		return result;
	}
	
	public static CharBuffer getFileContents(Path p) throws IOException {
		try (FileInputStream fis = new FileInputStream(p.toFile()); FileChannel fc = fis.getChannel();) {
			int sz = (int) fc.size();
			if (sz < 1)
				return null;

			MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, sz);
			CharBuffer indexFile = decoder.decode(bb);

			return indexFile;
		}
	}
	
	static public class Pair<T1, T2> {
		private T1 t1;
		private T2 t2;
		
		public Pair(T1 t1, T2 t2) {
			this.t1 = t1;
			this.t2 = t2;
		}
		
		public T1 getFirst() {
			return t1;
		}
		
		public T2 getSecond() {
			return t2;
		}
	}
}
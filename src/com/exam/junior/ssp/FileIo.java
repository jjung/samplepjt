package com.exam.junior.ssp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIo {

	public static void main(String[] args) {
		// 파일 쓰기
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			String s = "출력 파일에 저장될 이런 저런 문자열입니다.";

			out.write(s);
			out.newLine();

			out.write(s);
			out.newLine();

			out.flush();
			out.close();
		} catch (IOException e) {
			System.err.println(e); // 에러가 있다면 메시지 출력
			System.exit(1);
		}

		// 파일 읽기
		try {
			BufferedReader in = new BufferedReader(new FileReader("out.txt"));
			String s;

			while ((s = in.readLine()) != null) {
				System.out.println(s);
			}

			in.close();
		} catch (IOException e) {
			System.err.println(e); // 에러가 있다면 메시지 출력
			System.exit(1);
		}


		// 디렉토리 생성
		String path = "D:/test/";
		File directory = new File(path);
		if (!directory.isDirectory()) {
			directory.mkdirs();
		}

		// 디렉토리 목록 조회
		try {
			Path rootPath = Paths.get(path);
			DirectoryStream<Path> dirs = Files.newDirectoryStream(rootPath);
			for (Path dir : dirs) {
				System.out.println("dir.getFileName():" + dir.getFileName());// 디렉토리명
			}
		} catch (IOException e) {
			System.err.println(e); // 에러가 있다면 메시지 출력
			System.exit(1);
		}

		// 파일 목록 조회
		File fileDir = new File(path);
		String files[] = fileDir.list();
		for (String fNm : files) {
			System.out.println("fNm:" + fNm);// 파일명
			File file = new File(path + fNm);
			// file객체를 가지고 필요한 로직 수행.
		}

	}
}

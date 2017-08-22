package com.exam.senior.ssp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class BookSearchTerminal {

//	private static final String BASE_PATH   = "cache/epub";
	private static final String BASE_PATH   = "D:/D/cache/epub";
	private static final String RESULT_FILE = "result.txt";

	public static void main(String[] args) {
		Scanner reader = null;
		BufferedWriter out = null;
		try {
			
			BookThreadIndexLoader loader  = new BookThreadIndexLoader( BASE_PATH );
			
			
			reader = new Scanner(System.in); // Reading from System.in
			System.out.println("Enter a keyword: ");
			String keyword = reader.nextLine();
			List<String[]> bookList = loader.findBook(keyword);
			
			out = new BufferedWriter(new FileWriter(RESULT_FILE));
			for( String[] each : bookList ){
				String output = each[0] + ", " + each[1] + ", " + each[2] + ", " + each[3];
				out.write(output);
				out.newLine();
				System.out.println(" -- line: " + output);
			}


		}catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (reader != null){
				try{reader.close();}catch(Exception ex){}
			}
			if (out != null) {
				try {out.close(); } catch (Exception e) {}
			}
		}

	}

}

package com.exam.sample.javaapi;

import java.util.ArrayList;

/**
 * [실습] 도서 정보 관리 - Step 1
 * 도서 정보를 관리하려고 한다. 아래 정보를 보고 Book 클래스를 만들어 보자.
 * ArrayList를 이용하여 도서 정보를 저장하고, 각 도서를 추출하여 실행 결과와 같이 출력해 보자.
 * 
 * [실행결과]
 * Java의 정석 (346 page) : 15000 원
 * Oracle 11g (560 page) : 18000 원
 * JSP 따라하기 (271 page) : 12000 원
 * 
 */
public class BookListTestStep1 {

	public static void main(String[] args) {

		ArrayList<Book> books = new ArrayList<Book>();

		books.add(new Book("Java의 정석", 346, 15000));
		books.add(new Book("Oracle 11g", 560, 18000));
		books.add(new Book("JSP 따라하기", 271, 12000));

		for (Book book : books) {
			book.printBookInfo();
		}

	}
}
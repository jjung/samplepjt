package com.exam.sample.javaapi;

import java.util.HashMap;

/**
 * [실습] 도서 정보 관리 - Step 4
 * 앞에서 실습으로 진행한 도서 관리 프로그램에 변화가 생겼다.
 * Oracle 11g 책의 가격이 18000원에서 20000원으로 인상되었다. 
 * Java의 정석은 더 이상 관리하지 않고, 목록에서 제외하도록 결정하였다. 
 * 대신, 새로운 Java 도서를 추가하기로 하였다.
 * 위 내용을 구현해 보도록 하자.
 * 
 * [실행결과]
 * PRG002 - Oracle 11g (560 page) : 20000 원
 * PRG003 - JSP 따라하기 (271 page) : 12000 원
 * PRG004 – 뇌를 자극하는 Java (900 page) : 25000 원
 * 
 */
public class BookMapTestStep4 {

	public static void main(String[] args) {

		HashMap<String, Book> books = new HashMap<String, Book>();

		books.put("PRG001", new Book("Java의 정석", 346, 15000));
		books.put("PRG002", new Book("Oracle 11g", 560, 18000));
		books.put("PRG003", new Book("JSP 따라하기", 271, 12000));

		books.get("PRG002").setPrice(20000);
		books.remove("PRG001");
		books.put("PRG004", new Book("뇌를 자극하는 Java", 900, 25000));

		for (String bookId : books.keySet()) {
			Book book = books.get(bookId);
			book.printBookInfo();
		}
	}
}
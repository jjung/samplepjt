package com.lgcns.sample.javaapi;

import java.util.HashMap;

/**
 * [실습] 도서 정보 관리 - Step 3
 * 앞에서 ArrayList를 이용하여 저장했던 도서 정보를 HashMap을 이용하여 관리하려고 한다. 
 * 새로운 정보인 ISBN 번호가 생겼다. ISBN 번호를 키로 하고, Book 정보를 값으로 갖는 HashMap 을 생성해 보자.
 * 
 * [실행결과]
 * PRG001 - Java의 정석 (346 page) : 15000 원
 * PRG002 - Oracle 11g (560 page) : 18000 원
 * PRG003 - JSP 따라하기 (271 page) : 12000 원
 * 
 */
public class BookMapTestStep3 {

	public static void main(String[] args) {

		HashMap<String, Book> books = new HashMap<String, Book>();

		books.put("PRG001", new Book("Java의 정석", 346, 15000));
		books.put("PRG002", new Book("Oracle 11g", 560, 18000));
		books.put("PRG003", new Book("JSP 따라하기", 271, 12000));

		for (String bookId : books.keySet()) {
			Book book = books.get(bookId);
			book.printBookInfo();
		}
	}
}
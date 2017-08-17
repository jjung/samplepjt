package com.lgcns.sample.javaapi;

import java.util.ArrayList;

/**
 * [실습] 도서 정보 관리 - Step 2
 * 앞에서 실습으로 진행한 도서 관리 프로그램에 변화가 생겼다.
 * Oracle 11g 책의 가격이 18000원에서 20000원으로 인상되었고, 
 * Java의 정석 도서는 더 이상 관리하지 않고 목록에서 삭제하기로 하였다.
 * 대신, 도서의 첫 번째 자리에 새로운 Java 도서를 추가하기로 하였다.
 * 위의 내용을 구현해 보자.
 * 
 * [실행결과]
 * 뇌를 자극하는 Java (900 page) : 25000원
 * Oracle 11g (560 page) : 18000원
 * JSP 따라하기 (271 page) : 12000원
 * 
 */
public class BookListTestStep2 {
    
    public static void main( String[] args ) {
        
		ArrayList<Book> books = new ArrayList<Book>();

		books.add(new Book("Java의 정석", 346, 15000));
		books.add(new Book("Oracle 11g", 560, 18000));
		books.add(new Book("JSP 따라하기", 271, 12000));

		books.remove(0);
		books.add(0, new Book("뇌를 자극하는 Java", 900, 25000));
		books.get(1).setPrice(20000);
		
		for (Book book : books) {
			book.printBookInfo();
		}
    }
}
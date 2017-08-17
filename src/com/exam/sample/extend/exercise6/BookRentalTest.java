package com.lgcns.sample.extend.exercise6;

/*
 * 도서 대여 연체료
 * 
 * Book 클래스를 상속해서 Novel, ComicBook, Magazine 클래스를 만든다.
 * 
 * 각각의 책 종류별 연체료는 다음과 같다. 
 * Novel 600원/일, Magazine 300원/일, ComicBook 200원/일이다. 
 * 지연 일자를 입력하면 연체료를 출력하는 메소드를 구현한다.
 * 
 * 도서 번호가 같은 책은 동일한 책으로 취급하기 위해 Object.equals() 메서드를 오버라이드해서 구현한다.
 * 
 * 구현된 클래스로 우측의 실행 결과를 출력하자.
 * 
 * 
 * [실행 결과]
 * 
 * Novel 3일 연체 : 1800
 * ComicBook 3일 연체 : 600
 * Magazine 3일 연체 : 900
 * book4와 book3는 같은 책?? true
 * book4와 book1는 같은 책?? false
 * 
 */
public class BookRentalTest {
    
    public static void main( String[] args ) {
        
    	Novel book1 = new Novel(1, "왕좌의 게임", "조지 R. R. 마틴");
    	ComicBook book2 = new ComicBook(2, "원피스", "오다 에이치로");
    	Magazine book3 = new Magazine(3, "코스모폴리탄", "편집부");
    	Magazine book4 = new Magazine(3, "우먼센스", "편집부");
        
        System.out.println("Novel 3일 연체 : " + book1.getLateFees(3));
        System.out.println("ComicBook 3일 연체 : " + book2.getLateFees(3));
        System.out.println("Magazine 3일 연체 : " + book3.getLateFees(3));
        
        System.out.println("book4와 book3는 같은 책?? " + book4.equals(book3));
        System.out.println("book4와 book1는 같은 책?? " + book4.equals(book1));
    }
}
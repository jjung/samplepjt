package com.exam.sample.extend.exercise1;

/*
 * 동물 특성 출력하기
 * 
 * Step1 객체를 생성하고, 아래 실행 결과와 같이 나오도록 값을 세팅하고 출력해 보자.
 * 
 * 
 * 
 * [실행 결과]
 * 
 * 이름 : 야옹이
 * 나이 : 3살
 * 종류 : 페르시안
 * 달려라!!!
 * 쥐를 잡을꺼야!!
 * 모빌 놀이가 좋아요~
 * 
 */
public class AnimalStep1Test {
    
    public static void main( String[] args ) {
        
        CatStep1 cat = new CatStep1( 3, "페르시안", "야옹이" );
        
        System.out.println( "이름 : " + cat.getName() );
        System.out.println( "나이 : " + cat.getAge() + "살" );
        System.out.println( "종류 : " + cat.getKind() );
        
        cat.run();
        cat.hunt();
        cat.play();
    }
}
package com.exam.sample.extend.exercise3;

/*
 * 동물 특성 출력하기2
 * 
 * DogStep2 클래스를 추가해 보자. 
 * 
 * 클래스 다이어그램을 참고하여 CatStep2 클래스와 DogStep2 클래스에 hunt(), run() 메소드를 오버라이딩 해 보고, 
 * 실행 결과를 출력해 보자.
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
 * 이름 : 멍멍이
 * 나이 : 2살
 * 종류 : 시베리안허스키
 * 시속 40km로 뛰어!!
 * 순록을 잡아요~
 * 
 */
public class AnimalStep2Test {
    
    public static void main( String[] args ) {
        
        CatStep2 cat = new CatStep2( 3, "페르시안", "야옹이" );
        
        System.out.println( "이름 : " + cat.getName() );
        System.out.println( "나이 : " + cat.getAge() + "살" );
        System.out.println( "종류 : " + cat.getKind() );
        
        cat.run();
        cat.hunt();
        cat.play();
        
        System.out.println();
        
        DogStep2 dog = new DogStep2( 2, "시베리안허스키", "멍멍이" );
        
        System.out.println( "이름 : " + dog.getName() );
        System.out.println( "나이 : " + dog.getAge() + "살" );
        System.out.println( "종류 : " + dog.getKind() );
        
        dog.run();
        dog.hunt();
    }
}
package com.lgcns.sample.extend.exercise8;

/*
 * Hero 프로그램
 * 
 * Hero 클래스를 작성하고 각 Hero의 action을 정의한 후, 
 * HeroTest 클래스에서 Hero 목록 출력 및 
 * 각 Hero 별로 action을 수행하는 프로그램을 구현하자
 * 
 * 
 * [실행 결과]
 * 
 * Hero 목록 : 슈퍼맨, 배트맨, 스파이더맨
 * 슈퍼맨이 난다.
 * 슈퍼맨이 헤엄친다.
 * 슈퍼맨이 싸운다.
 * 배트맨이 헤엄친다.
 * 배트맨이 싸운다.
 * 스파이더맨이 싸운다.
 * 
 */
public class HeroTest {
    
    public static void main( String[] args ) {
        
        Hero[] heroes = { new SuperMan(), new BatMan(), new SpiderMan() };
        
        System.out.print( "Hero 목록 : " );
        
        for ( int inx = 0 ; inx < heroes.length ; inx++ ) {
            System.out.print( heroes[inx] );
            if ( inx < heroes.length - 1 ) {
                System.out.print( ", " );
            }
        }
        
        System.out.println();
        
        for ( int inx = 0 ; inx < heroes.length ; inx++ ) {
            heroes[inx].action();
        }
    }
}
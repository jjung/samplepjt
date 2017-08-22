package com.exam.sample.extend.exercise7;

/*
 * 핸드폰 사용 관리 Step2
 * 
 * GooPlay 인터페이스를 추가하고, V20Step2 클래스가 이 인터페이스를 구현하도록 하자.
 * 
 * buy() 메소드 구현 내용은 아래의 실행 결과를 참고한다.
 * 
 * 
 * [실행 결과]
 * 
 * V20 : 게임 앱을 1000원에 구입했습니다.
 * 
 */
public class MobileStep2Test {
    
    public static void main( String[] args ) {
        
        V20Step2 v20 = new V20Step2();
        
        v20.setProduction( "V20" );
        
        System.out.print( v20.getProduction() + " : " );
        v20.buy( "게임", 1000 );
    }
}
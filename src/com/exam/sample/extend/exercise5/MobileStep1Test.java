package com.exam.sample.extend.exercise5;

/*
 * 핸드폰 사용 관리 Step1
 * 
 * G5Step1 과 V20Step1 클래스에 새로운 메소드를 추가하고, 
 * 그 메소드들을 이용하여 아래 실행 결과와 같이 출력해 보자.
 * 
 * 
 * [실행 결과]
 * 
 * V20 : 쿼드 DAC
 * V20 : 5분 통화했습니다.
 * V20 : 보조배터리 30분 충전
 * G5 : 안드로이드 머쉬맬로우
 * G5 : 10분 통화했습니다.
 * G5 : 15분 충전했더니 Full!!
 * 
 */
public class MobileStep1Test {
    
    public static void main( String[] args ) {
        
        MobileStep1 v20 = new V20Step1();
        MobileStep1 g5  = new G5Step1();
        
        v20.setProduction( "V20" );
        g5.setProduction( "G5" );
        
        ((V20Step1) v20).setDac("쿼드 DAC");
        ((G5Step1) g5).setOsVersion("안드로이드 머쉬맬로우" );
        
        System.out.println( v20.getProduction() + " : " + ((V20Step1) v20).getDac() );
        v20.call( 5 );
        v20.charge( 30 );
        
        System.out.println( g5.getProduction() + " : " + ((G5Step1) g5).getOsVersion() );
        g5.call( 10 );
        g5.charge( 15 );
    }
}
package com.lgcns.sample.extend.example.carstep2;

/*
 * [따라하기] 차량 관리2
 * 
 * 인터페이스 Washer 를 추가하고, Car 에서 Washer 의 내용을 구현하도록 한다.
 * 
 * Washer 타입의 Car 객체도 하나 생성하고, 
 * 아래 실행 결과와 같이 출력되도록 알맞은 메소드를 호출해 보자.
 * 
 * 
 * [실행 결과]
 * 
 * 세차합니다.
 * 택시 : 세차합니다.
 * 트럭 : 세차합니다.
 * 
 */
public class CarStep2Test {
    
    public static void main( String[] args ) {
    	
    	Washer car   = new CarStep2();
    	Washer taxi  = new TaxiStep2();
    	Washer truck = new TruckStep2();
        
        car.wash();
        System.out.print( "택시 : " );
        taxi.wash();
        System.out.print( "트럭 : " );
        truck.wash();
    }
}
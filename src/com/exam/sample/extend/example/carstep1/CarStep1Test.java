package com.exam.sample.extend.example.carstep1;

/*
 * [따라하기] 차량 관리1
 * 
 * 부모 클래스인 CarStep1 타입으로 TaxiStep1과 TruckStep1 객체를 생성하고, 
 * 만들어진 객체를 이용하여 각 메소드를 호출해 본다.
 * 
 * 
 * [실행 결과]
 * 
 * 20 km 이동합니다.
 * 연료 : 10
 * 30 km 이동합니다.
 * 연료 : 10
 * 
 */
public class CarStep1Test {
    
    public static void main( String[] args ) {
        
        CarStep1 taxi  = new TaxiStep1();
        CarStep1 truck = new TruckStep1();
        
        taxi.setOilSize( 10 );
        truck.setOilSize( 10 );
        
        taxi.go( 20 );
        System.out.println( "연료 : " + taxi.getOilSize() );
        
        truck.go( 30 );
        System.out.println( "연료 : " + truck.getOilSize() );
    }
}
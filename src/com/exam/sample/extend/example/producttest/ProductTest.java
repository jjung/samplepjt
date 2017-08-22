package com.exam.sample.extend.example.producttest;

/*
 * [따라하기] 가전제품 구매하기
 * 
 * 일반 제품과 텔레비전 객체를 생성하고, 정보를 출력하거나 판매 가격을 계산하여 출력해 보자.
 * 
 * 
 * 
 * [실행 결과]
 * 
 * ============ 제품 정보 ============
 * 제품명 : 통돌이
 * 정가 : ￦450,000 ( 할인율 : 8% )
 * 판매가 : ￦414,000
 * -----------------------------------
 * 제품명 : 시네마 TV
 * 정가 : ￦3,500,000 ( 할인율 : 10% )
 * 판매가 : ￦3,150,000
 * 비고 : 화면 크기 151cm
 * 
 * [공지] 할인율을 모두 15%로 변경합니다!!
 * 
 * 통돌이 판매가 : ￦382,500
 * 시네마 TV 판매가 : ￦2,975,000
 * 
 */
public class ProductTest {
    
    public static void main( String[] args ) {
        
        Product washer = new Product( "통돌이", 450000, 8 );
        Television cinemaTv = new Television( "시네마 TV", 3500000, 10, "화면 크기 151cm" );
        
        System.out.println( "============ 제품 정보 ============" );
        washer.printProductInfo();
        System.out.println( "-----------------------------------" );
        cinemaTv.printProductInfo();
        System.out.println( "비고 : " + cinemaTv.getDescription() );
        
        System.out.println( "\n[공지] 할인율을 모두 15%로 변경합니다!!\n" );
        
        washer.setDiscountRate( 15 );
        cinemaTv.setDiscountRate( 15 );
        
        System.out.println( washer.getName() + " 판매가 : " + washer.calculateDiscountPrice() );
        System.out.println( cinemaTv.getName() + " 판매가 : " + cinemaTv.calculateDiscountPrice() );
    }
}
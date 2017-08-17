package com.lgcns.sample.extend.exercise4;

/*
 * 펀드 계좌 출력하기3
 * 
 * AccountStep3 와 FundAccountStep3 클래스에 최상의 클래스 Object 의 메소드인 
 * toString() 메소드를 오버라이딩 해 보도록 한다.
 * 
 * AccountStep3 클래스의 toString() 메소드에서는 계좌번호, 예금주, 잔액 정보를 
 * 문자열로 만들어 리턴 해 주도록 하자.
 * 
 * FundAccountStep3 클래스의 toString() 메소드에서는 계좌번호, 예금주, 잔액 정보에 더하여 
 * 수익률 정보까지 문자열로 만들어 리턴 해 주도록 하자.
 * 
 * 
 * [실행 결과]
 * 
 * 펀드 계좌 번호 : 111-2222
 * 예금주 : 홍길동
 * 잔액 : 5000000원
 * 수익률 : 5.6%
 * 
 * 펀드 계좌 번호 : 666-7777
 * 예금주 : 홍길순
 * 잔액 : 1000000원
 * 수익률 : 2.9%
 * 
 */
public class AccountStep3Test {
    
    public static void main( String[] args ) {
        
        FundAccountStep3[] fundAccounts = 
                {
                    new FundAccountStep3( "111-2222", "홍길동", 5000000, 4.7 ),
                    new FundAccountStep3( "666-7777", "홍길순", 1000000, 2.9 )
                };
        
        for ( int inx = 0 ; inx < fundAccounts.length ; inx++ ) {
            //System.out.println( fundAccounts[inx].toString() );
        	System.out.println( fundAccounts[inx] );
            System.out.println();
        }
    }
}
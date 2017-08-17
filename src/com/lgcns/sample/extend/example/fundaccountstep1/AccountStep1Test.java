package com.lgcns.sample.extend.example.fundaccountstep1;

/*
 * [따라하기] 펀드 계좌 출력하기1
 * 
 * FundAccountStep1 객체를 생성하고, 아래 실행 결과와 같이 나오도록 값을 출력해 보자.
 * 
 * 
 * 
 * [실행 결과]
 * 
 * 계좌를 개설합니다.
 * 계좌 번호 : 111-2222
 * 예금주 : 홍길동
 * 잔액 : 5000000원
 * 수익률 : 4.7%
 * 수익이 발생하였습니다.
 * 
 */

public class AccountStep1Test {
    
    public static void main( String[] args ) {
        
        FundAccountStep1 fundAccount = new FundAccountStep1();
        
        fundAccount.setNumber( "111-2222" );
        fundAccount.setName( "홍길동" );
        fundAccount.setBalance( 5000000 );
        fundAccount.setEarningRate( 4.7 );
        
        fundAccount.openAccount();
        
        System.out.println( "계좌 번호 : " + fundAccount.getNumber() );
        System.out.println( "예금주 : " + fundAccount.getName() );
        System.out.println( "잔액 : " + fundAccount.getBalance() + "원" );
        System.out.println( "수익률 : " + fundAccount.getEarningRate() + "%" );
        
        fundAccount.earnMoney();
    }
}
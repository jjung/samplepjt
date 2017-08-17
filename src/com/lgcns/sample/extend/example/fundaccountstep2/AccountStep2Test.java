package com.lgcns.sample.extend.example.fundaccountstep2;

public class AccountStep2Test {
    
	/*
	 * [따라하기] 펀드 계좌 출력하기2
	 * 
	 * FundAccountStep2 클래스에서 부모 클래스의 메소드인 openAccount() 메소드를 오버라이딩한다.
	 *
	 * FundAccountStep2 클래스의 오버라이딩 한 메소드에서 계좌를 개설 메시지와 
	 * 계좌 번호, 예금주, 최초 잔액에 대한 정보를 출력할 수 있도록 구현해 보자. 
	 *
	 * AccountTestStep2 에는 객체를 하나 더 만들어서 두 개의 계좌를 관리해 보도록 한다.
	 * 
	 * [실행 결과]
	 * 
	 * 계좌를 개설합니다.
	 * 펀드 계좌 번호 : 111-2222
	 * 예금주 : 홍길동
	 * 잔액 : 5000000원
	 * 수익률 : 4.7%
	 * 수익이 발생하였습니다.
	 * 
	 * 계좌를 개설합니다.
	 * 펀드 계좌 번호 : 666-7777
	 * 예금주 : 홍길순
	 * 잔액 : 1000000원
	 * 수익률 : 2.9%
	 * 수익이 발생하였습니다.
	 * 
	 */
    public static void main( String[] args ) {
        
        FundAccountStep2 fundAccount = new FundAccountStep2( "111-2222", "홍길동", 5000000, 4.7 );
        
        fundAccount.openAccount();
        System.out.println( "수익률 : " + fundAccount.getEarningRate() + "%" );
        fundAccount.earnMoney();
        
        System.out.println();
        
        FundAccountStep2 fundAccount2 = new FundAccountStep2( "666-7777", "홍길순", 1000000, 2.9 );
        
        fundAccount2.openAccount();
        System.out.println( "수익률 : " + fundAccount2.getEarningRate() + "%" );
        fundAccount2.earnMoney();
        
    	/*
        FundAccountStep2[] fundAccounts = 
                {
                    new FundAccountStep2( "111-2222", "홍길동", 5000000, 4.7 ),
                    new FundAccountStep2( "666-7777", "홍길순", 1000000, 2.9 )
                };
        
        for ( int inx = 0 ; inx < fundAccounts.length ; inx++ ) {
            fundAccounts[inx].openAccount();
            System.out.println( "수익률 : " + fundAccounts[inx].getEarningRate() + "%" );
            fundAccounts[inx].earnMoney();
            System.out.println();
        }
        */
    }
}
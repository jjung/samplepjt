package com.lgcns.sample.extend.example.fundaccountstep2;

/*
 * openAccount() 메소드 오버라이딩
 * 
 */
public class FundAccountStep2 extends AccountStep2 {
    
    private double earningRate;
    
    public FundAccountStep2( String number, String name, int balance, double earningRate ) {
        super( number, name, balance );
        this.earningRate = earningRate;
    }
    
    public double getEarningRate() {
        return earningRate;
    }
    
    public void setEarningRate( double earningRate ) {
        this.earningRate = earningRate;
    }
    
    public void earnMoney() {
        System.out.println( "수익이 발생하였습니다." );
    }
    
    @Override
    public void openAccount() {
    	// 계좌를 개설 메시지와 계좌 번호, 예금주, 최초 잔액에 대한 정보를 출력할 수 있도록 구현해 보자. 
        super.openAccount();
        System.out.println( "펀드 계좌 번호 : " + getNumber() );
        System.out.println( "예금주 : " + getName() );
        System.out.println( "잔액 : " + getBalance() + "원" );
    }
}
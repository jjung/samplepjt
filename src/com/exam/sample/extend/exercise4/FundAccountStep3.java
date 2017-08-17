package com.lgcns.sample.extend.exercise4;

public class FundAccountStep3 extends AccountStep3 {
    
    private double earningRate;
    
    public FundAccountStep3( String number, String name, int balance, double earningRate ) {
        super( number, name, balance );
        this.earningRate = earningRate;
    }
    
    @Override
    public String toString() {
        
        String accountInfo = "펀드 " + super.toString();
        accountInfo += "\n수익률 : " + earningRate + "%";
        
        return accountInfo;
    }
}
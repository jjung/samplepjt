package com.exam.sample.extend.exercise4;

public class AccountStep3 {
    
    private String number;
    private String name;
    private int balance;
    
    public AccountStep3( String number, String name, int balance ) {
        this.number  = number;
        this.name    = name;
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        
        String accountInfo = "계좌 번호 : " + number;
        accountInfo += "\n예금주 : " + name;
        accountInfo += "\n잔액 : " + balance;
        
        return accountInfo;
    }
}
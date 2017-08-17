package com.lgcns.sample.extend.example.fundaccountstep1;

public class AccountStep1 {
    
    private String number;
    private String name;
    private int balance;
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber( String number ) {
        this.number = number;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName( String name ) {
        this.name = name;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void setBalance( int balance ) {
        this.balance = balance;
    }
    
    public void openAccount() {
        System.out.println( "계좌를 개설합니다." );
    }
}
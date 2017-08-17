package com.lgcns.sample.extend.example.fundaccountstep2;

public class AccountStep2 {
    
    private String number;
    private String name;
    private int balance;
    
    public AccountStep2( String number, String name, int balance ) {
        this.number  = number;
        this.name    = name;
        this.balance = balance;
    }
    
    public String getNumber() {
        return number;
    }
    
    public String getName() {
        return name;
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
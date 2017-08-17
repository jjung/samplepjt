package com.lgcns.sample.extend.exercise7;

public class MobileStep2 {
    
    private String production;
    
    public String getProduction() {
        return production;
    }
    
    public void setProduction( String production ) {
        this.production = production;
    }
    
    public void call( int time ) {
        System.out.println( production + " : " + time + "분 통화했습니다." );
    }
    
    public void charge( int time ) {
        System.out.println( production + " : " + time + "분 충전했습니다." );
    }
}
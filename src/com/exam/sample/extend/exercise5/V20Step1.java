package com.exam.sample.extend.exercise5;

public class V20Step1 extends MobileStep1 {
    
    private String dac;
    
    @Override
    public void charge( int time ) {
        System.out.println( getProduction() + " : 보조배터리 " + time + "분 충전" );
    }
    
    public String getDac() {
        return dac;
    }
    
    public void setDac( String dac ) {
        this.dac = dac;
    }
}
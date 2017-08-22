package com.exam.sample.extend.exercise7;

public class V20Step2 extends MobileStep2 implements GooPlay {
    
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
    
    @Override
    public void buy( String kind, int price ) {
        System.out.println( kind + " 앱을 " + price + "원에 구입했습니다." );
    }
}
package com.lgcns.sample.extend.example.carstep1;

public class CarStep1 {
    
    private int oilSize;
    
    public void go( int distance ) {
        System.out.println( distance + "km 이동합니다." );
    }
    
    public void setOilSize( int oilSize ) {
        this.oilSize = oilSize;
    }
    
    public int getOilSize() {
        return oilSize;
    }
}
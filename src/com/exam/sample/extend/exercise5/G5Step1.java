package com.exam.sample.extend.exercise5;

public class G5Step1 extends MobileStep1 {
    
    private String osVersion;
    
    @Override
    public void charge( int time ) {
        System.out.println( getProduction() + " : " + time + "분 충전했더니 Full!!" );
    }
    
    public String getOsVersion() {
        return osVersion;
    }
    
    public void setOsVersion( String osVersion ) {
        this.osVersion = osVersion;
    }
}
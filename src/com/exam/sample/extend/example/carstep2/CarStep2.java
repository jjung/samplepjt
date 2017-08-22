package com.exam.sample.extend.example.carstep2;

public class CarStep2 implements Washer {
    
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

	@Override
	public void wash() {
		System.out.println("세차합니다.");
	}
}
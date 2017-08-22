package com.exam.sample.extend.example.fundaccountstep1;

public class FundAccountStep1 extends AccountStep1 {
	private double earningRate;

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	
	public void earnMoney() {
		System.out.println( "수익이 발생하였습니다." );
	}
}

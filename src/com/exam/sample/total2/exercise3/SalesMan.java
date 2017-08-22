package com.exam.sample.total2.exercise3;

public class SalesMan extends Regular {
	private int sales;
	private double commission;
		 
	public SalesMan(String name, int age, int salary, int sales, double commission) {
		super(name, age, salary, "영업직");
		this.sales = sales;
		this.commission = commission;
	}
		 
	@Override
	public double pay() {
		return super.pay() + (sales * commission);
	}
		 
	@Override
	public void print() {
		display();
		System.out.println(", 수령액 : " + pay() + "원");
	}
}

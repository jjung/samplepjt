package com.exam.sample.total2.exercise3;

public class Temporary extends Employee {
	private int workDay;
	private int dailyPay;

	public Temporary(String name, int age, int workDay, int dailyPay) {
		super(name, age, "임시직");
		this.workDay = workDay;
		this.dailyPay = dailyPay;
	}

	@Override
	public double pay() {
		return workDay * dailyPay;
	}

	@Override
	public void print() {
		display();
		System.out.println(", 월급 : " + pay() + "원");
	}
}
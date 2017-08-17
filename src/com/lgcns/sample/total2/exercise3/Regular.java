package com.lgcns.sample.total2.exercise3;

public class Regular extends Employee{

	private int salary;
 
	public Regular(String name, int age, int salary) {
		super(name, age, "정규직");
		this.salary = salary;
	}
	
	public Regular(String name, int age, int salary, String workType) {
		super(name, age, workType);
		this.salary = salary;
	}
		 
	@Override
	public double pay() {
		return salary;
	}
		 
	@Override
	public void print() {
		display();
		System.out.println(", 고정급 : " + pay() + "원");
	}
}
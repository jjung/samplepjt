package com.exam.sample.total2.exercise3;

public abstract class Employee {
	private String name;
	private int age;
	private String workType;
		 
    public Employee(String name, int age, String workType) {
    	this.name = name;
    	this.age = age;
    	this.workType = workType;
    }
		 
	public abstract double pay();
	public abstract void print();
		 
	public void display() {
		System.out.print("이름 : " + name + ", 직업 : " + workType + ", 나이 : " + age);
	}
}
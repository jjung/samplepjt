package com.exam.sample.extend.exercise6;

public class Magazine extends Book {
	public Magazine(int mngNumber, String title, String author) {
		super.setMngNumber(mngNumber);
		super.setTitle(title);
		super.setAuthor(author);
	}
	
	public int getLateFees(int rateDay) {
		return rateDay * 300;
	}
}

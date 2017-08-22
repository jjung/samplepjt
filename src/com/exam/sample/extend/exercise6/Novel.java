package com.exam.sample.extend.exercise6;

public class Novel extends Book {
	public Novel(int mngNumber, String title, String author) {
		super.setMngNumber(mngNumber);
		super.setTitle(title);
		super.setAuthor(author);
	}

	public int getLateFees(int rateDay) {
		return rateDay * 600;
	}
}

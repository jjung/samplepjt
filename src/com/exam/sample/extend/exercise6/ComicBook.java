package com.lgcns.sample.extend.exercise6;

public class ComicBook extends Book {
	public ComicBook(int mngNumber, String title, String author) {
		super.setMngNumber(mngNumber);
		super.setTitle(title);
		super.setAuthor(author);
	}
	
	public int getLateFees(int rateDay) {
		return rateDay * 200;
	}
}

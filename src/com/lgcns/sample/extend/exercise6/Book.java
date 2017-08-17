package com.lgcns.sample.extend.exercise6;

public class Book {

	private int mngNumber;
	private String title;
	private String author;
	
	public int getMngNumber() {
		return mngNumber;
	}
	public void setMngNumber(int mngNumber) {
		this.mngNumber = mngNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			if(this.mngNumber == ((Book)obj).getMngNumber()) {
				return true;
			}
		}
		return false;
	}
}

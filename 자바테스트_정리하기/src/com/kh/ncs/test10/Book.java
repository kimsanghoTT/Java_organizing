package com.kh.ncs.test10;

public class Book {

	private String category;
	private String bookName;
	private double bookPrice;
	private double bookDiscount;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String category, String bookName, double bookPrice, double bookDiscount) {
		super();
		this.category = category;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscount = bookDiscount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscount() {
		return bookDiscount;
	}

	public void setBookDiscount(double bookDiscount) {
		this.bookDiscount = bookDiscount;
	}
	
	
}

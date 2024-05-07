package com.kh.ncs.test10;

public class BookUpdate {

	private Book bookData;
	
	public BookUpdate() {
		// TODO Auto-generated constructor stub
	}
	
	public BookUpdate(Book bookData) {
		super();
		this.bookData = bookData;
	}

	public Book getBookData() {
		return bookData;
	}

	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}
	
	public void updateBookPrice() {
		double 할인가 = bookData.getBookPrice() * (1 - bookData.getBookDiscount() /100);
		bookData.setBookPrice(할인가);
		
		
	}
}

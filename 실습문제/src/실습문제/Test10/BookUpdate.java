package 실습문제.Test10;

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
		double newPrice = bookData.getBookPrice() * (1 - bookData.getBookDiscountRate()/100);
		bookData.setBookPrice(newPrice);
	}
}

package ncs.test15;

public class Book {


	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	public Book() {
		
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public Book(String title, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}
	//할인율과 정상가격을 확인해서 할인가를 알고 싶을 떄 작성하는 메서드
	public int get할인가() {
		//할인가 계산 방식
		double discountAmount = price * discountRate;
		
		int 할인가격 = (int) (price - discountAmount);
		return 할인가격;
	}

	@Override
	public String toString() {
		return title + ", " + author + ", " + price + ", " + publisher
				+ ", " + discountRate*100 + "%할인";
	}
	
	
}

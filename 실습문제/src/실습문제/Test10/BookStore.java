package 실습문제.Test10;

public class BookStore {

	public static void main(String[] args) {

		Book book = new Book("IT","HTML",30000,15);
		
		BookUpdate up = new BookUpdate(book);
		
		up.updateBookPrice();
		System.out.println(book.getBookPrice());
		System.out.println(book.getBookName());
		
	}

}

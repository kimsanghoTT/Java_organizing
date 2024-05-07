package ncs.test15;

import java.util.ArrayList;
import java.util.List;

public class BookListTest {

	public void StoreList(List<Book> list) {
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
	}
	
	public void saveFile(List<Book> list) {
		
	}
	
	public void loadFile(List<Book> list) {
		
	}
	
	public void printList(List<Book> list) {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookListTest test = new BookListTest();
		ArrayList<Book> list = new ArrayList<>();

		for(Book book : list) {
			System.out.println(book.toString());
			System.out.println("할인가 : " +book.get할인가());
		}
	}

}

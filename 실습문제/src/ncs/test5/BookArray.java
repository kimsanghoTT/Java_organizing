package ncs.test5;

public class BookArray {

	public static void main(String[] args) {
		
		Book bArray [] = new Book[3];
			
		bArray[0] = new Book("자바의 정석","남궁성",30000,"도우출판",10);
		bArray[1] = new Book("열혈강의 자바","구정은",29000,"프리렉",10);
		bArray[2] = new Book("객체지향 JAVA8","금영욱",30000,"북스홈",10);
		
		for(int i = 0; i<bArray.length; i++) {
			System.out.println(bArray[i].getTitle() + ", " + bArray[i].getAuthor() + ", "
					+bArray[i].getPublisher()+", "+bArray[i].getPrice()+"원, "+bArray[i].getDiscountRate()+"% 할인");
			System.out.println("할인된 가격 : " + bArray[i].getPrice() * (1 -bArray[i].getDiscountRate()/100) +"원");
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

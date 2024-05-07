package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("상품 가격을 입력하세요 : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("상품 수량을 입력하세요 : ");
		int quantity = Integer.parseInt(sc.nextLine());
		Product 갤럭시 = new Product(name, price, quantity);
		System.out.println(갤럭시.toString());
	}

}

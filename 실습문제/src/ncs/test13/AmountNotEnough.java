package ncs.test13;

public class AmountNotEnough extends Exception{

	public AmountNotEnough(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		System.out.println("현재 재고가 부족합니다.");
	}
}

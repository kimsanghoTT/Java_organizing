package 실습문제.Test9;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		System.out.println("합 : " + calc.sum(num1, num2));
		System.out.println("차 : " + calc.substract(num1, num2));
		System.out.println("곱 : " + calc.multiply(num1, num2));
		System.out.println("나누기 : " + calc.divide(num1, num2));
	}
	
}

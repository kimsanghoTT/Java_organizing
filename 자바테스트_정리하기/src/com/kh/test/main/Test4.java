package com.kh.test.main;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");	
		int 숫자1 = sc.nextInt();
		if(숫자1<1 || 숫자1 >9) {
			System.out.println("프로그램 종료");
			return;
		}
		System.out.println("두 번째 정수 입력 : ");
		int 숫자2 = sc.nextInt();
		
		if(숫자2<1 || 숫자2 >9) {
			System.out.println("프로그램 종료");
			return;
		}
		int sum = 숫자1 + 숫자2;
		int abs = 숫자1 - 숫자2;		
		int times = 숫자1 * 숫자2;
		int div = 숫자1 / 숫자2;
	
		
	}
	
	
}

package com.kh.test.main;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		boolean 계속 = true;
		
		while(계속) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 작성 : ");
			int 날짜 = sc.nextInt();
			String 할일;
			
			switch(날짜) {
			case 1:
				할일 = "월요일 : 일";
				break;
			case 2:
				할일 = "화요일 : 공부";
				break;
			case 3:
				System.out.println("종료합니다.");
				//return; => boolrean 말고 그냥 조건식에 true 넣을 떄
				계속 = false;
				break;
			default :
				할일 = "날짜 상관없이 휴식";
				break;
			
			
			
			}
		}

	}
}

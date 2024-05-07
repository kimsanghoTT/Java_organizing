package 자바_예제문제실습;

import java.util.Scanner;

/*
	사용자에게 문자열을 입력받아 문자열의 길이를 출력하기
	입력한 문자열이 finish면 프로그램 종료
*/	
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 입력(finish입력시 종료) : ");
			String str = sc.nextLine();
			if(str.equals("finish")) {
				break;
				
			}
			else {
				System.out.println("문자열의 길이 : " + str.length());
				//.length() : 문자열에 대한 글자수 반환 메서드
			}
			
		}
		System.out.println("프로그램을 종료합니다");

		
	}
}

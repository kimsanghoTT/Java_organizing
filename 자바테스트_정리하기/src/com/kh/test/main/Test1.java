package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
//키보드로 1개의 정수형(int) 데이터를 입력 받아, 1~100 사이의 값일 때만 2의 배수인지 아닌지를 출력 처리
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~100의 정수 입력 : ");
		int num = sc.nextInt();
		if(num >=1 && num <= 100) {
			if(num % 2 == 0) {
				System.out.println("2의 배수입니다.");
			}
			else if(num % 2 != 0) {
				System.out.println("2의 배수가 아닙니다.");
			}
		}
		else {
			System.out.println("1~100사이의 정수만 입력해주세요");
		}
		
		int 숫자1 = 5;
		if(숫자1>0) {
			System.out.println("양수");
		}
		else if(숫자1<0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0입니다");
		}

	}
	
	
	
}

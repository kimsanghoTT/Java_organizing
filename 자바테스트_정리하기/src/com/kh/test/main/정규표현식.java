package com.kh.test.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 정규표현식 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한글을 입력하세요 : ");
		String 입력 = sc.nextLine();
		
		//반복하는 패턴이 가-힣 한글이라면
		if(Pattern.matches("^[가-힣]*$", 입력)) {
			System.out.println("입력한 문자열은 한글입니다");
		}
		else {
			System.out.println("한글만 입력해주세요");
		}
		
		
		System.out.println("전화번호를 '-'없이 입력하세요 : ");
		String 전화번호 = sc.nextLine();
		if(Pattern.matches("^[0-9]*$", 전화번호)) {
			//matches는 문자열만 받음
			System.out.println("입력한 문자열은 전화번호입니다.");
		}
		else {
			System.out.println("전화번호가 아닙니다.");
		}
	}
}

package com.kh.NumberSystem;

public class 숫자시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 숫자 = 42;
		
		//42를 2진수 숫자로 변환
		//정수로 된 숫자 -> 문자열로 변환, 출력하기 위해 String 변환
		String 이진수 = Integer.toBinaryString(숫자);
		System.out.println(이진수);
		
		//8진수로 변환
		String 팔진수 = Integer.toOctalString(숫자);
		System.out.println(팔진수);
		
		//10진수로 변환 -> 2진수로 변환한 값을 가져와서 10진수로 변환해야함
		String 이진수2 = "101010"; //42
		int 십진수 = Integer.parseInt(이진수2, 2);
		System.out.println(십진수);//10진수는 parseInt를 사용해서 변경
		
		String 팔진수2 = "52";
		int 십진수2 = Integer.parseInt(팔진수2, 8);	
		System.out.println(십진수2);
		
		//16진법에서 A = 10, 2 = 2
		String 십육진수 = "2A"; // 42 = 2 X 16 + 10(A)
		// 2 X 16 + 10(A)
		int 십진수3 = Integer.parseInt(십육진수);
		System.out.println(십진수3);
	}

}

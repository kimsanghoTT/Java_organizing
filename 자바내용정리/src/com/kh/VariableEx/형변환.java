package com.kh.VariableEx;

public class 형변환 {
/*
	(자료)형변환
	- 데이터 타입을 변환하는 것
	- 자동으로 변환하는 형변환 / 강제로 변환하는 형변환
	
	- 자동으로 형변환이 가능한 경우
		- 자료형의 byte가 서로 같거나, 변환하는 결과가 변환 전 byte보다 클 경우 자동으로 변환 가능
		
	- 강제로 변환해야하는 경우
		- 큰 byte에서 작은 byte로 넘어갈 때는 강제로 무언가를 넣어줘야함.(이 때 데이터 손실 위험있음)
		
	- 자동형변환 : ()를 생략 가능
		ex)
		int 숫자 = 10;
		double 실수 = (double) 숫자; //(double)생략가능
		
	- 강제형변환 : ()를 무조건 넣어야함
		ex)
		double 실수 = 1.0;
		int 숫자 = (int) 실수; //(int)를 필수로 작성해야함
		
	- 메서드 호출을 통한 형변환	 : 
		일부 데이터들은 메서드를 통해 값변환이 진행됨		
		문자열 String으로 담은 겂을 숫자계열로 변경하고 싶을 때 많이 사용		
		문자열을 정수로 변환하길 원한다면
		String 휴대폰번호 = "010-7434-8494";
		Integer.parseInt(휴대폰번호); // 숫자(정수)로 변경
		
		
		* String -> 숫자 자료형 = "자료형.parse자료형(변환할 값);"
		Integer.parseInt(변환할 String 변수);
		Double.parseDouble(변환할 String 변수);
		Byte.parseByte(변환할 String 변수);
		Short.parseShort(변환할 String 변수);
		Float.parseFloat(변환할 String 변수);
		Long.parseLong(변환할 String 변수);
		정수는 맨 앞의 0을 자동으로 제거시킨 후 진행
		
		* 숫자 자료형 -> String = "객체자료형.toString(변환할 숫자 변수);""		
		Integer.toString(변환할 숫자변수);
		Double.toString(변환할 실수변수);
		Byte.toString(변환할 숫자변수);
		Short.toString(변환할 숫자변수);
		Float.toString(변환할 실수변수);
		Long.toString(변환할 숫자변수);
		*/
}

package com.kh.VariableEx;
/*
	
	자료형 / 변수명 / 변수값
	type / name / literal
	변수
	
	- 자료형(기본)(primitive)
		* 숫자 : byte, short, int, long 	=> 기본으로 int형을 사용
		* 문자 : char						=> ''사용. 한 글자만 들어갈 수 있음
		* 실수 : float, double			=> double이 기본 값
		* 참/거짓 : boolean				=> false가 기본 값
	
	- 자료형(참조)(reference)
		* 문자열 : String					=> ""사용. 문자를 모두 나열하는 문자열. 특수문자 등 모두 사용가능
	
	- 상수형 : 상시적으로 변하지 않는 수. 값의 변화가 없음. 이름을 대문자로 표기
		* final 자료형 상수명(대문자) = 값;
		ex) final int MAX_NUM = 100;
		
	- 열거형 : 상수를 하나씩 작성하는 게 아니라 관련있는 상수들을 한번에 { } 안에 작성. 
				final과 자료형을 생략하는 상수 표기법
		* enum 대표이름{  
					상수 모두 작성
			}
		
*/	
//변수명은 특정 행위나 행동을 하기 위한 것이 아니기에 메서드 안에 작성하지 않아도 됨 => 클래스에서 바로 작성 가능
//System.out.print와 같은 '행동'은 메서드안에 작성해야함
public class 기본변수 {

	//자료형 기본
	//필드
	int 숫자 = 10;
	byte b = 2;
	short sh = 3;
	long lng = 5;
	
	float ft = 3.14f; //기본 실수 값은 double이고 double은 float보다 큰 값이기 떄문에 f,F를 붙여야함
	double db = 3.14; //실수는 초기값이 double이므로 따로 뭘 안붙여도 됨
	
	char ch = 'A';	//문자는 ''작성해줘야하고 '가', 'A'처럼 단어 하나만 넣어야함
	
	boolean bln = false; //boolean bln;과 같은 값. boolean은 false가 기본값이기 떄문
	
	//자료형 참조
	String name = "가나다"; //추가로 만들어진 자료형. 대문자 S로 시작해야함. 누구나 참조 자료형을 만들 수 있음
	
	//상수형
	final int MAX_NUMBER = 100;
	final double PI = 3.14;
	final String 규칙 = "변경되면 안되면 규칙";
	// 앞에 final 붙이고 모두 사용할 경우 static 작성
	
	//열거형
	enum day {
		MONDAY, TUESDAY, WENDSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	
	
	
	
	
	
}

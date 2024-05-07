package com.kh.test.main.oop;
//자식클래스. 부모클래스를 상속받음
//클래스를 상속 받을 때는 하나밖에 상속을 받지 못함
public class Child extends Parent{
//필드
	int 자식변수;
	
//메서드
	//생성자 기본 컨트롤+스페이스바 후 constructor 표시가 있는지 확인
	public Child() {
		// TODO Auto-generated constructor stub
	}

	public Child(int 자식변수) {
		super(); //Parent의 기본 생성자
		//super(부모변수); : 하나의 자식 생성자에서 super를 두번 부르는 건 불가능
		this.자식변수 = 자식변수;
	}
	//만약 super를 기본, 필수 생성자를 불러오고 싶다면
	//자식 생성자도 2개 만들어서 각각 넣어줘야함
	public Child(int 부모변수, int 자식변수) {
		super(부모변수);
		this.자식변수 = 자식변수;
	}

	/*
	//생성자 필수
				//부모변수는 Parent에서 가져올 예정
	public Child(int 부모변수, int 자식변수) {
		//super(부모변수); // 부모변수에 어떻게 받아서 가져가겠다라는 것이 없으면 에러가 뜸
						//부모변수에도 기본 생성자를 넣어서 작성
		this.자식변수 = 자식변수;
	}
	*/
	public void 자식메서드() {
		super.부모메서드();
		System.out.println("자식도 호출되었습니다");
	}
}

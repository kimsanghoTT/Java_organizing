package com.kh.test.main.oop;

public class Main {
	//최종으로 실행할 메인 메서드. 내가 실행하고자 하는 파일과 코드만 작성
	public static void main(String[] args) {
		
		Dog 해피 = new Dog();
		//Dog => 객체		해피 = new Dog => 인스턴스
		Dog 러브 = new Dog();
		
		Dog 희망 = new Dog();
		
		//개들의 소리를 들어보기
		//인터페이스 메서드에 작성한 makeSound를 Dog에서 재 작성한 소리로 변경한 것을 들음
		해피.makeSound();
		러브.makeSound();
		희망.makeSound();
		
		해피.eat();
		러브.eat();
		희망.eat();
	}
}

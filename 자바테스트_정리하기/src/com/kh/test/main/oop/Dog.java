package com.kh.test.main.oop;

//동물 하나만 상속 implements Animal 동물 이외에 여러 인터페이스를 ,를 사용해서 작성 가능.

public class Dog implements Animal, AnimalEat{
	
	//Animal에 있는 인터페이스 메서드 구현
	@Override // 주석같은 의미로 생략해도 좋지만 개발자 간의 약속으로 작성하는 것이 좋음
	public void makeSound() {
		
		System.out.println("멍멍하고 짖습니다");
		
	}
	@Override
	public void eat() {
		System.out.println("냠냠");
	}
}

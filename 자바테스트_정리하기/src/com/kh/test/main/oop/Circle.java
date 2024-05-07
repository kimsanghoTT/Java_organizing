package com.kh.test.main.oop;

public class Circle extends Shape{
//에러가 나오는 이유는 추상클래스에서 작성한 추상메서드를 반드시 재사용해서 완성하란 의미
	//추상메서드 구현
	@Override
	public double getArea() {
		return 3.14;
	}
}

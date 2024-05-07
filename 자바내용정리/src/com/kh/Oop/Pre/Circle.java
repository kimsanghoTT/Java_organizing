package com.kh.Oop.Pre;

public class Circle implements Drawble, Shape{
	
	@Override
	public double Area() {
		return 4.8;
	}
	
	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}

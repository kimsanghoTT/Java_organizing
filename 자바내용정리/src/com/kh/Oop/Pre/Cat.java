package com.kh.Oop.Pre;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("고양이 " + getName() + "야옹");
	}
}

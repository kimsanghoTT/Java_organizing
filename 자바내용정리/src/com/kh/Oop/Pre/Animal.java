package com.kh.Oop.Pre;
//부모
public class Animal {
//필드
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void makeSound() {
		System.out.println(name + "가 소리를 냅니다.");
	}
}

package com.kh.serialEx;

import java.io.Serializable;

//학생을 직렬화하기
public class Student implements Serializable{

	private String name;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		

	@Override
	public String toString() {
		return "Student [name = " + name + ", age = " + age + "]";
	}
	
	
}

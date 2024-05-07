package com.kh.test.main;

public class Test2 {

	public static void main(String[] args) {
		for(int 단 = 2; 단 <=5; 단++) {
			System.out.println("------------------");
			for(int i = 1; i <=9; i+=2) {//2씩 증가
				System.out.println(단 + " * " + i + " = " + 단*i);
			}
		}
	}


}

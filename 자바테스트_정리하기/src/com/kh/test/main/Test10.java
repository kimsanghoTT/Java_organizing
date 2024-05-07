package com.kh.test.main;

public class Test10 {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, 
				{14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
		
		double 합 = 0;
		int count = 0;
		
		for(int[] 한줄씩꺼내기 : array) {
			for(int num : 한줄씩꺼내기) {
				합 +=num;
				count++; // 평균 구하기 위해 갯수 카운트
			}
		}
		System.out.println(합);
		System.out.println(합/count);
	}
}

package com.kh.test.main;

public class Test7 {

	public static void main(String[] args) {
		//배열 안의 값 중 홀수만 출력하고 합 구하기
		//continue 이용해서 작성
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0;
		//for each문을 사용해서 모두 돌기
		//if문으로  뽑기
		for(int 배열 : array) {
			if(배열 % 2 != 0) {
				System.out.println(배열);
				sum +=배열;
			}
		}
		System.out.println(sum);
	}


}

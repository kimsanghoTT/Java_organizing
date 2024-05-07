package com.kh.test.main;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		
		String[] st = str.split(",");
		//문자열을 , 기준으로 나누고 배열에 담기
		
		//,로 나눈 실수들을 모아서 double에 담기
		double data[] = new double[st.length];
		double sum = 0;
		int count = 0;
		
		//문자열로 담겨진 배열을 실수로 변환하는 형변환
		for(int i = 0; i<st.length; i++) {
			data[i] = Double.parseDouble(st[i]);
			//문자열(String)을 실수(double)로 변환하는 데 사용
			sum += data[i];
			count++;
		}
		System.out.println("합계 : " +sum);
		System.out.println("평균 : " +(sum/count));
		
	}

}

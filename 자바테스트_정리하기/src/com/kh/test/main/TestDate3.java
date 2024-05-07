package com.kh.test.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate3 {

	public static void main(String[] args) {
		
		int 출생연도 = 1987;
		int 출생월 = 8;
		int 출생일 = 14;
		
		Calendar 현재 = Calendar.getInstance();
		int 현재년도 = 현재.get(Calendar.YEAR);
		int 현재월 = 현재.get(Calendar.MONTH);
		int 현재날짜 = 현재.get(Calendar.DAY_OF_MONTH);
		
		int 나이 = 현재년도 - 출생연도;
		
		//생일 전이면 나이 - 1
		//만 나이 계산
		if(현재월 < 출생월 || 출생월 == 현재월 && 현재날짜 < 출생일) {
			나이--;
		}
		Calendar 생일 = new GregorianCalendar(출생연도,출생월-1,출생일);
		SimpleDateFormat 날짜포맷 = new SimpleDateFormat("yyyy년 M월 d일");
		
		System.out.println("생일 : " + 날짜포맷.format(생일.getTime()));
		System.out.println("현재 : " + 날짜포맷.format(현재.getTime()));
		System.out.println("나이 : " + 나이);
	}
}

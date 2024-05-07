package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		//Date로 현재 날짜를 받아서 년-월-일 출력하기
		Date now = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 M월 d일");
		String 형식1 = sdf1.format(now);
		System.out.println(형식1);
		try {
			Date parse1 = sdf1.parse(형식1);
			System.out.println(parse1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//문자열로 재 변환할 때 형식에 없는 값은 0으로 바뀜
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("H시 m분 s초");
		String 형식2 = sdf2.format(now);
		System.out.println(형식2);
		try {
			Date parse2 = sdf2.parse(형식2);
			System.out.println(parse2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 M월 d일 H시 m분 s초");
		String 형식3 = sdf3.format(now);
		System.out.println(형식3);
		try {
			Date parse3 = sdf3.parse(형식3);
			System.out.println(parse3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

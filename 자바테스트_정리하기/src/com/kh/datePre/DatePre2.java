package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre2 {

	public static void main(String[] args) {

		Date now = new Date();
		//날짜 형식 0000년 00월 00일
		
		//년 월 일 형식으로 글자를 넣으면 시 분 초는 값을 읽어오지 못함 => 0이 됨
		//- 이외 /, _ 글자를 넣게 되면 자동으로 시 분 초를 읽어오지 못함
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 EEEE");
		String 형식1 = sdf.format(now);
		System.out.println(형식1);
		
		try {
			Date parse1 = sdf.parse(형식1);
			System.out.println(parse1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

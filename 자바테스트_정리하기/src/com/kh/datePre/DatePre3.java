package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre3 {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy / MM / dd E");
		String format = sdf.format(now);
		//System.out.println(sdf); => 주소가 나옴
		//sdf는 변환하고 싶은 규칙일 뿐이지 날짜를 가져올 수 있는 게 아님
		System.out.println(format);
		
		System.out.println("생년월일 8자리 입력");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		String format2 = sdf2.format(now);
		System.out.println(format2);
		
		System.out.println("주민번호 6자리 입력");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyMMdd");
		String format3 = sdf3.format(now);
		System.out.println(format3);
	}
}

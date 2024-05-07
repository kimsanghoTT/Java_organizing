package ncs.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test3 {

	public static void main(String[] args) {
		int year = 1987;
		int month = 5;
		int day = 27;
		
		
		
		Calendar 현재 =  Calendar.getInstance();
		int 지금년도 = 현재.get(Calendar.YEAR);
		int 지금월 = 현재.get(Calendar.MONTH);
		int 지금일 = 현재.get(Calendar.DAY_OF_MONTH);
		
		int 나이 = 지금년도 - year;
		
		GregorianCalendar 생일 = new GregorianCalendar(year, month, day);
		SimpleDateFormat 포맷 = new SimpleDateFormat("yyyy년 M월 d일");
		
		System.out.println(포맷.format(현재.getTime()));
		System.out.println(포맷.format(생일.getTime()));
		
	}
}

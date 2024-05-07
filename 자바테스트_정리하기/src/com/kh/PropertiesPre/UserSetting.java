package com.kh.PropertiesPre;

import java.util.Map;
import java.util.Properties;

public class UserSetting {

	public static void main(String[] args) {
		//Properties 객체와 인스턴스 생성 = setting
		Properties 설정 = new Properties();
		//속성 설정
		설정.setProperty("name", "John");
		설정.setProperty("age", "17");
		설정.setProperty("city", "seoul");
		
		//city 조회
		System.out.println("city : " + 설정.getProperty("city"));
		
		for(Map.Entry<Object, Object> e : 설정.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key + " : " + value);
		}
	}
}

package com.kh.PropertiesPre;

import java.util.Map;
import java.util.Properties;

public class PropertiesPre {

	public static void main(String[] args) {
		Properties 설정 = new Properties();
		
		//속성 설정
		설정.setProperty("이름", "김다섯");
		설정.setProperty("나이", "15");
		설정.setProperty("사는 곳", "서울");
		
		//특정 값 조회하기
		String 이름조회 = 설정.getProperty("이름");
		System.out.println("이름 : " + 이름조회);
		
		//전체 조회하기
		System.out.println("====전체조회====");
		//Map.Entry를 사용해서 전체 조회를 할 수 있음
		//properties는 문자열로 작성을 하지만 Object 기반임
		for(Map.Entry<Object, Object> e : 설정.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key +" : "+ value);
		}
	}
}

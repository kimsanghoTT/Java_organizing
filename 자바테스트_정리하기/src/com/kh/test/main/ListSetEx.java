package com.kh.test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ListSetEx {

	public static void main(String[] args) {
		//ArrayList와 HashSet 함께 사용하기
		ArrayList<String> 리스트 = new ArrayList<>();
		
		//값주기
		리스트.add("피자");
		리스트.add("햄버거");
		리스트.add("서브웨이");
		리스트.add("피자");
		
		//HashSet 선언, 즉 초기화
		//객체를 통해 인스턴스를 만듦
		HashSet<String> 해시셋 = new HashSet<>();
		
		해시셋.add("피자");
		해시셋.add("햄버거");
		해시셋.add("서브웨이");
		해시셋.add("피자");
		
		System.out.println(리스트);
		System.out.println(해시셋); // 중복이 안됨
		
		
		HashMap<Integer, String> 해시맵 = new HashMap<>();
		System.out.println("안녕하세요. 과일과게에 오신 것을 환영합니다.");
		해시맵.put(1, "망고");
		해시맵.put(2, "패션후르츠");
		해시맵.put(3, "망고스틴");
		
		System.out.println(해시맵);
		//키에 숫자도 가능. 중복 안됨
	}

}

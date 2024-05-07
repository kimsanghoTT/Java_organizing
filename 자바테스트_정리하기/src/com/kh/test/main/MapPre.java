package com.kh.test.main;

import java.util.HashMap;
import java.util.Map;

public class MapPre {

	public static void main(String[] args) {
		//Map 또한 인터페이스이므로 인스턴스느낌으로 사용하려면
		//Map<String, Integer> map = new HashMap<>();과 같이 사용해야함
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("apple", 2000);
		map.put("banana", 3000);
		map.put("cherry", 1000);
		System.out.println(map); // 순서가 보장되지 않음
		
		map.put("banana", 500);
		System.out.println(map);
		
		map.put("banana ", 1000);
		System.out.println(map);
		map.put(" banana ", 1000);
		System.out.println(map);
		//주의 : "" 안에 스페이스바 공백 확인할 것. 순서 보장 X
	}
}

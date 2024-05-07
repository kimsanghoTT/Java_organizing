package com.kh.test.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPre {

	public static void main(String[] args) {
		//set의 경우 인터페이스이기 때문에 단독으로 사용은 못하지만
		// Set 셋 = new Set<>(); => 불가
		// Set 셋 = new HashSet<>(); => 가능
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("사과");
		set1.add("바나나");
		set1.add("오렌지");
		
		System.out.println("해시셋 : " + set1);
		
		Set<Integer> set2 = new TreeSet<>();
		
		set2.add(5);
		set2.add(2);
		set2.add(8);
		
		System.out.println("트리셋 : " + set2);
		
		Set<String> set3 = new LinkedHashSet<>();
		
		set3.add("영화");
		set3.add("드라마");
		set3.add("TV");
		
		System.out.println("링크드해시셋 : " + set3);
		
		//clear remove isEmpty
		
		//set get 사용해서 값을 수정하거나 가져올 수 없음
		
	}

}

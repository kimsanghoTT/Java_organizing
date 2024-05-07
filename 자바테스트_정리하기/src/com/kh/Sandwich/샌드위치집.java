package com.kh.Sandwich;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 샌드위치집 {

	public static void main(String[] args) {
		List<샌드위치> 주문리스트 = new ArrayList<>();
		주문리스트.add(new 샌드위치("김하나", "BLT"));
		주문리스트.add(new 샌드위치("이둘", "터키"));
		주문리스트.add(new 샌드위치("김하나", "치킨"));
		주문리스트.add(new 샌드위치("이셋", "에그마요"));
		주문리스트.add(new 샌드위치("김하나", "베지터블"));
		
		List<샌드위치> 중복주문제거 = new ArrayList<>();
		Set<String> 중복고객 = new HashSet<>();
		
		for(샌드위치 주문 : 주문리스트) {
			if(!중복고객.contains(주문.get고객명())) {
				중복주문제거.add(주문);
				중복고객.add(주문.get고객명());
			}
		}
		System.out.println(중복주문제거);
		
	}
}

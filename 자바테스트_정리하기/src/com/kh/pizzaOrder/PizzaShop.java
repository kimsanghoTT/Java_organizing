package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PizzaShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주문 목록 저장할 ArrayList
		ArrayList<String> 고객리스트 = new ArrayList<>(Arrays.asList("고영희","박철진","안영식","고영희","박철진"));
		ArrayList<String> 피자리스트 = new ArrayList<>(Arrays.asList("페페로니","마르게리따","슈프림","파인애플","치즈"));
		
		//고객과 피자리스트를 하나에 묶을 ArrayList 생성
		ArrayList<PizzaOrder> 주문리스트 = new ArrayList<>();
		
		//for문을 활용해서 주문 추가
		for(int i = 0; i<고객리스트.size(); i++) {
			PizzaOrder 주문 = new PizzaOrder(고객리스트.get(i), 피자리스트.get(i));
			주문리스트.add(주문);
		}
		System.out.println(고객리스트);
		System.out.println(피자리스트);
		System.out.println(주문리스트);
		//HashSet 사용해서 중복 주문 방지하기 위한 set
		HashSet<String> set = new HashSet<>();
		
		//주문추가 PizzaOrder 사용해서 주문 추가

		//주문한 내용 전체보기 toString
		
		//중복된 주문 정보 제거한 목록 출력
	}

}

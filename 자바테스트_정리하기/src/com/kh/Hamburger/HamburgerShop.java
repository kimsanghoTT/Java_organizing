package com.kh.Hamburger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HamburgerShop {

	public static void main(String[] args) {
		
		ArrayList<HamburgerOrder> orderList = new ArrayList<>();
		
		orderList.add(new HamburgerOrder("동그라미", "치즈버거"));
		orderList.add(new HamburgerOrder("안세모", "베이컨버거"));
		orderList.add(new HamburgerOrder("박네모", "상하이버거"));
		orderList.add(new HamburgerOrder("금각진", "치킨버거"));
		orderList.add(new HamburgerOrder("동그라미", "빅맥"));
		
		for(HamburgerOrder list : orderList) {
			System.out.println(list);
		}
		//ArrayList에 중복으로 주문한 사람들을 중복으로 주문하지 못하게 하기
		System.out.println("처음 주문만 받는 것으로 처리");
		Set<String> 중복고객제거 = new HashSet<>();//중복 확인여부를 위한 인스턴스 생성
		
		//중복 고객을 제거한 다음에 중복되지 않은 고객만 ArrayList에 담기
		//중복이 되지 않는 내용만 추가
		List<HamburgerOrder> 중복주문제거 = new ArrayList<>();
		
		
		//for-each문으로 중복이 있는지 한바퀴 돌면서 확인하고 중복이 되지 않는 내용만 추가
		for(HamburgerOrder 주문 : orderList) {
			if(!중복고객제거.contains(주문.get고객명())) {//고객이 존재하지 않는다면
				중복주문제거.add(주문);					//주문 내용 추가
				중복고객제거.add(주문.get고객명());
			}
		}
		System.out.println(중복주문제거);
		//중복주문제거에는 처음에 주문한 리스트만 받을 수 있게됨
		
	}

}

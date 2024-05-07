package com.kh.goodsShop;

import java.util.HashMap;
import java.util.Map;

public class 컴퓨터가게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> 모든제품 = new HashMap<>();
		
		모든제품.put("노트북", 700000);
		모든제품.put("데스트탑", 200000);
		모든제품.put("모니터", 50000);
		모든제품.put("마우스", 30000);
		모든제품.put("키보드", 20000);
		
		for(Map.Entry<String, Integer> e : 모든제품.entrySet()) {
			String 제품명 = e.getKey();
			int 가격 = e.getValue();
			System.out.println("제품명 : " + 제품명 + "\n가격 : " + 가격);
		}
		
		//특정 물품의 가격 출력
		String 찾는물건 = "USB";
		System.out.println(찾는물건 + "이 있는가");
		if(모든제품.containsKey(찾는물건)) {
			System.out.println("있습니다.");
		}
		else {
			System.out.println("없습니다.");
		}
	}
	

}

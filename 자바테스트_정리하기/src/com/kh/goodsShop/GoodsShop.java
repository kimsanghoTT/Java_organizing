package com.kh.goodsShop;

import java.util.HashMap;
import java.util.Map;

public class GoodsShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> 아이템 = new HashMap<>();
		System.out.println("제주도에 오신 것을 환영합니다");
		
		//물품과 가격추가
		아이템.put("동백모자", 20000);
		아이템.put("감귤모자", 15000);
		아이템.put("흑돼지키링", 25000);
		
		//물품 목록 보기 Map.Entry
		//Map<자료형, 자료형> = Map.Entry<자료형, 자료형> 이어야 함
		for(Map.Entry<String, Integer> e : 아이템.entrySet()) {
			//아이템을 하나씩 키-값으로 꺼내보기		//안에 들어있는 아이템 모두보기
			String 제품 = e.getKey(); //제품 명만 받음
			int 가격 = e.getValue(); // 가격만 받음
			
			System.out.println("제품 명 : " + 제품 + "\n가격 : " + 가격);
		}
		
		//특정 물품의 가격 보기
		System.out.println("오미자볼펜 얼마인지 보기");
		String 제품명 = "오미자볼펜";
		//오미자볼펜이 있는지 확인하고 얼마인지 얘기하기
		if(아이템.containsKey(제품명)) { //아이템이 존재한다면
			int 제품가격 = 아이템.get(제품명); //오미자볼펜을 검색했을 떄 존재하면 정보 가져오기
			System.out.println(제품명 + "의 가격은 " + 제품가격);
		}
		else { //판매하지 않을 경우
			System.out.println("그런건 없습니다");
		}
		
		
		
	}

}

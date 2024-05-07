package com.kh.test.main;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트예제 {

	public static void main(String[] args) {
		ArrayList<String> 리스트 = new ArrayList<>(Arrays.asList("바나나","오렌지"));
		//값추가
		리스트.add("사과");
		System.out.println(리스트);
		
		//값제거
		리스트.remove("바나나"); // -> 값을 직접 지정
		리스트.remove(0); // -> index 번호 지정 후 삭제
		System.out.println(리스트); // 사과는 2번 인덱스에서 0번 인덱스로 옮겨짐
		
		//값변경
		리스트.set(0, "체리");
		System.out.println(리스트); // 사과가 체리로 변경
		
		리스트.add(1, "파파야");
		System.out.println(리스트); // 1번 인덱스 자리에 값이 차지 않은 채 2번으로 넘어가면 오류
									// 따라서 순서대로 값을 추가해야함
		
		//크기 확인
		System.out.println(리스트.size());
		
		//포함여부 확인
		System.out.println(리스트.contains("파파야"));
		
		//인덱스 확인
		System.out.println(리스트.indexOf("체리"));
	}
}

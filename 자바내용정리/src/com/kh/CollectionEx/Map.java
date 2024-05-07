package com.kh.CollectionEx;

public class Map {
/*
	Map
	- 키(key) - 값(value) 한 쌍의 집합을 이루는 구조
	
	- 키는 숫자, 문자, 문자열 등 어떤 값이 들어가도 괜찮음
	- 값 또한 모든 값이 들어갈 수 있음
	
	- 값은 중복이 가능하지만 키는 중복이 될 수 없음
	- 중복된 키가 존재한다면 이전 키는 가장 나중에 작성된 키로 대체됨
	- 순서가 보장되지 않음. 순서를 보장해야하는 경우 LinkedHashMap을 써야함
	
	HashMap : 가장 많이 사용
	TreeMap : 이진 트리로 ㄱ빠른 검색이 필요할 때 사용
	LinkedHashMap : 순서를 보장하는 연결이 필요할 떄 사용
	
	메서드
	put(key, value) : 지정된 키와 값을 맵에 추가
						이미 동일한 키가 존재한다면 이전 값은 새로운 값으로 대체
	get(key) : 지정된 키에 해당하는 값을 보여줌
				해당 키가 존재하지 않으면 null 반환
	contains(key) : 맵에 지정된 키가 포함되어 있는지 확인
	contains(value) : 맵에 지정된 값이 포함되어 있는지 확인
	remove(key) : 지정된 키와 해당하는 값을 제거
				
			  key   value	
	Map.Entry<자료형, 자료형>
		Entry
		- Map 인터페이스 안의 내부 클래스. 키와 값의 쌍을 나타냄
		- 보통은 entrySet() 메서드를 사용해서 키-값에 대한 정보를 보여줌
		- entrySet()로 모든 키와 값의 쌓을 한 번에 보여주지만
			Map.Entry를 써서 모두 가져올 수 있음 => 하나씩 가져와서 보여주기
		- getKey()나 getValue()를 사용해서 각각 가져올 수도 있음
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
*/	
}

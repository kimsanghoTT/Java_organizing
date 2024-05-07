package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Inventory> map = new HashMap<>();
		Calendar 캘린더 = Calendar.getInstance();
		
		캘린더.set(2016, 캘린더.MARCH, 15);//제품별 날짜를 다르게 넣어줌
		map.put("삼성 갤럭시 S7", new Inventory("삼성 갤럭시S7", 캘린더.getTime(), 30));
		
		캘린더.set(2016, 캘린더.FEBRUARY, 25);
		map.put("LG G5", new Inventory("LG G5", 캘린더.getTime(), 20));
		
		캘린더.set(2016, 캘린더.JANUARY, 23);
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", 캘린더.getTime(), 15));
		
		try {
		
		캘린더.set(2016, 캘린더.APRIL, 28);
		map.get("삼성 갤럭시 S7").setGetDate(캘린더.getTime()); // 출고 날짜
		map.get("삼성 갤럭시 S7").setGetAmount(10); // 출고 갯수
		
		map.get("LG G5").setGetDate(캘린더.getTime());
		map.get("LG G5").setGetAmount(10);
		
		map.get("애플 아이패드 Pro").setGetDate(캘린더.getTime());
		map.get("애플 아이패드 Pro").setGetAmount(10);
		
		//만약 제품이 존재하지 않을 경우 AmountNotEnough를 넣고 사용할 것
		for(Inventory 인벤 : map.values()) {
			// 가지고 있는 양 < 출고 양
			// 판매하고자 하는 양 > 현재 소지량
			if(인벤.getGetAmount() > 인벤.getPutAmount()) {
				throw new AmountNotEnough("출고 수량이 재고 수량을 초과했습니다.");
			}
		}
		}catch(AmountNotEnough e) {
			e.printStackTrace(); // 에러를 출력해서 보여주기
		}
		
		
		for(Inventory e : map.values()) {
			System.out.println(e.toString());
			//현재 팔린 제품이 없기 떄문에 출고일, 출고수량, 남은수량은 없음
		}
	}
}

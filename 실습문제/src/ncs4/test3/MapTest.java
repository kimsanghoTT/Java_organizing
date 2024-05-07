package ncs4.test3;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Map<String, Inventory> map = new HashMap<>();
		Calendar 날짜 = Calendar.getInstance();
	try {
		
	
		날짜.set(2016, 날짜.MARCH, 15);
		map.put("삼성 갤럭시 S7", new Inventory("삼성 갤럭시 S7", 날짜.getTime(), 30));
		날짜.set(2016, 날짜.FEBRUARY, 25);
		map.put("LG G5", new Inventory("LG G5", 날짜.getTime(), 20));
		날짜.set(2016, 날짜.JANUARY, 23);
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", 날짜.getTime(), 15));
		
		날짜.set(2016, 날짜.APRIL, 28);
		map.get("삼성 갤럭시 S7").setGetDate(날짜.getTime());
		map.get("삼성 갤럭시 S7").setGetAmount(10);
		
		map.get("LG G5").setGetDate(날짜.getTime());
		map.get("LG G5").setGetAmount(10);
		
		map.get("애플 아이패드 Pro").setGetDate(날짜.getTime());
		map.get("애플 아이패드 Pro").setGetAmount(10);
		
		for(Inventory 인벤 : map.values()) {
			if(인벤.getGetAmount() > 인벤.getPutAmount()) {
				throw new AmountNotEnough("수량이 부족합니다.");
			}
		}
	}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(Map.Entry<String, Inventory>e : map.entrySet()) {
			System.out.println(e);
		}
		
		
		
		
		
		
	}

}

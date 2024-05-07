package pre.propertiesEx2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropTest {

	public static void fileSave(Properties p) {
		
		p.setProperty("1", "순풍산부인과,1998,682");
		p.setProperty("2", "똑바로살아라,2002,239");
		p.setProperty("3", "눈물의여왕,2024,16");
		p.setProperty("4", "아내의유혹,2008,129");
		
		
		//Properties xml 파일로 저장
		//xml 텍스트 기반의 문서 웹에서 읽기 편하도록 <>로 규칙을 지정해서 작성하는 공간
		try {
			FileOutputStream fos = new FileOutputStream("Drama.xml");
			p.storeToXML(fos, null);
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(Properties p) {
		try {
			FileInputStream fis = new FileInputStream("Drama.xml");
			p.loadFromXML(fis); // 글이 적혀있는 xml 파일을 불러오기
			fis.close();
			
			//Properties 객체에 키-값을 넣어서 List에 저장
			List<Drama> 드라마들 = new ArrayList<>();
			//눈으로 데이터가 어떻게 들어있는지 테이터를 담을 리스트를 만들어줌
			//for문으로 설정파일 안에 적혀있는 이름을 기준으로 모두 추가하기
			for(String key : p.stringPropertyNames()) {
				//xml파일 안에 있는 모든 값을 문자열 형태로 변경해서 검색할 수 있도록 함
				String[] values = p.getProperty(key).split(",");
				//모든 키를 담을 String[]을 생성해서 ","를 기준으로 나눠서 key들을 모두 담아줌.
				
				//각각 변수에 담아서 생성
				//설정값(Properties)안에 있는 내용들은 모두 String에 담아 가져온 것이므로
				//정수는 모두 String -> int 로 변환해서 사용해야함
				String name = values[0];
				int 출시년도 = Integer.parseInt(values[1]);
				int 몇부작 = Integer.parseInt(values[2]);
				
				Drama 드라마 = new Drama(name, 출시년도, 몇부작);
				
				//각각 담은 드라마를 모두 추가하기
				//비어있는 드라마들(ArrayList)에 각각의 드라마 추가하기
				드라마들.add(드라마);
			}
			System.out.println("드라마 목록 : ");
			for(Drama d : 드라마들) {
				System.out.println(d);
			}
			
		//정렬할 때 정렬하는 기준
			//정렬할 때는 이름이면 이름, 년도하면 년도 등 정렬하는 기준을 정해야함
			//담겨있는 드라마들(ArrayList)을 다시 정렬함. 정렬하는 기준 Drama[0] = name
		Drama[] 정렬 = 드라마들.toArray(new Drama[0]);	// name 기준 정렬
	//	Drama[] 정렬 = 드라마들.toArray(new Drama[1]);	// 출시년도 기준 정렬
	//	Drama[] 정렬 = 드라마들.toArray(new Drama[2]);	// 몇부작 기준 정렬
		
		
		Arrays.sort(정렬);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Properties p = new Properties();
		//p,fileSave(); -> p 밑에서 추가로 가져오거나 작성할 때 사용하는 것
		//메서드를 따로 만들어줬기 떄문에 위 방법으로 사용하지 않음
		fileSave(p);
		fileOpen(p);
	}
}

package pre.propertiesEx;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class PropTest {

	public static void fileSave(Properties p) {
		//XML 파일로 내용 저장하기
		
		p.setProperty("1", "패밀리맨,4,2000");
		p.setProperty("2", "엘리멘탈,5,2023");
		p.setProperty("3", "투모로우,5,2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, "movie is fun");
			fos.close();//파일 저장 후 종료
			System.out.println("설정이 movies.xml 파일에 저장됨");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void fileOpen(Properties p) {
		try {
			FileInputStream fis = new FileInputStream("movies.xml");
			p.loadFromXML(fis);
			fis.close();
			
			ArrayList<Movies> 영화들 = new ArrayList<>();
			for(String key : p.stringPropertyNames()) {
				String[] value = p.getProperty(key).split(",");
				
				String 제목 = value[0];
				int 평점 = Integer.parseInt(value[1]);
				int 관객 = Integer.parseInt(value[2]);
				
				Movies 영화 = new Movies(제목, 평점, 관객);
				
				영화들.add(영화);
			}
			Movies[] 정렬 = 영화들.toArray(new Movies[0]);
			Arrays.sort(정렬);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		fileSave(p);
		
	}

}

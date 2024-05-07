package 자바_예제문제실습;

import java.io.FileWriter;
import java.io.IOException;

//기존에 있던 animal.txt 파일에 코뿔소~코끼리친구코뿔소를 
// 동물이름 = 멧돼지, 나이 =3 밑에 이어서 저장되게 만들어주기
public class FileMain {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("animal.txt", true);
			fw.write("\n코뿔소, 10");
			fw.write("\n코끼리 친구 코뿔소");
			System.out.println("글쓰기 완료");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {

	public void fileSave(String 파일이름) {
		
		File file = new File(파일이름);
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person 사람 = new Person("김상호", 29);
			bw.write(사람.toString());
			System.out.println("파일생성완료");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		
		PersonMain 파일 = new PersonMain();
		파일.fileSave("Person.txt");
	}
}

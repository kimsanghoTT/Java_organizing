package com.kh.FileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePre {

	public static void main(String[] args) throws IOException {
		String 파일이름 = "practice.txt";
		File file = new File(파일이름);
		//파일이 존재하는지 여부 확인		
		//존재하지 않으면 만들어줌		
		//존재한다면 이미 존재한다는 문구 출력
		if(file.exists()) {
			System.out.println("이미 존재");
		}
		else {
			file.createNewFile();
			System.out.println("파일 생성 완료");
		}
		
		//파일에 글을 작성하기
		FileWriter 글쓰기 = new FileWriter(file);
		글쓰기.write("Java \n");
		글쓰기.write("File \n");
		글쓰기.write("객체 \n");
		글쓰기.write("종료하기");
		
		글쓰기.close();
		
	}
}

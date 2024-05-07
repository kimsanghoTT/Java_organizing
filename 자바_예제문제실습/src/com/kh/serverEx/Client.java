package com.kh.serverEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
//서버로 "안녕하세요"라고 메세지 서버에게 보낸 후 클라이언트 자동으로 종료되게 코드 작성
public class Client {

	public static void main(String[] args) {
		int port = 3003;
		String 서버ip;
		
		try {
			서버ip = InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(서버ip,port);
			System.out.println("서버에 연결됐습니다.");
			//bufferedReader : 입력한 글자 모두 읽어오기
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//PrintWriter : 읽어온 글자 출력하기
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			//주최자에게 메세지 전송
			out.println("안녕하세요");
			
			//주최자에게서 온 메세지 수신 후 출력
			String message = in.readLine();
			System.out.println("send success : " + message);
			
			out.close();
			in.close();
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

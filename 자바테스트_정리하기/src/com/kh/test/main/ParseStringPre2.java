package com.kh.test.main;

public class ParseStringPre2 {

	public static void main(String[] args) {
		//String으로 받은 휴대폰 번호를 정수로 변경
		String phoneNumber = "01012345678";
		int num1 = Integer.parseInt(phoneNumber);
		System.out.println(num1);
		
		//String으로 받은 점수를 실수로 변경
		String score = "88.9";
		double num2 = Double.parseDouble(score);
		System.out.println(num2);
		
		//정수로 받은 휴대폰 번호를 String으로 변환
		int phoneNumber2 = 102345678;
		String str1 = Integer.toString(phoneNumber2);
		System.out.println(str1);
		
		//실수로 받은 점수를 String으로 변경
		double score2 = 72.5;
		String str2 = Double.toString(score2);
		System.out.println(str2);
		
		//문자열에서 하이픈('-')제거
		String phoneNumber3 = "010-1234-5678";
		//""안에 아무것도 작성하지 않으면 삭제의 의미로 사용
		String 하이픈제거 = phoneNumber3.replace("-", "");
		System.out.println(하이픈제거);
		//주민번호에서 '-' 제거
		String id = "230304-1234567";
		String remover = id.replace("-","");
		System.out.println(remover);
		
		//charAt(7)
		//하이픈 제거하고 성별 추출
		String id2 = "240101-3456789";
		String 주민번호 = id2.replace("-", "");
		char 성별 = 주민번호.charAt(6);
		System.out.println("성별 번호 : " + 성별);
		
		//삼항 연산자를 사용해서 성별번호가 1또는 3이면 ? "남성" : "여성"
		
		String gender = (성별 == '3' || 성별 == '1') ? "남성" : "여성";
		System.out.println(gender);
		
		
		//주민번호에서 - 제거하고 삼항연산자 사용해서 성별 추출
		String id3 = "200101-4567891";
		String 주민번호2 = id3.replace("-", "");
		char 성별2 = 주민번호2.charAt(6);
		String gender2 = (성별2 =='2' || 성별2 == '4') ? "남성" : "여성";
		System.out.println(gender2);
		
		
		String 주민번호3 = "870101-2345678";
		//주민번호가 앞에는 6자리가 맞는지 확인하고 뒤는 7자리가 맞는지 확인
		boolean is주민 = (주민번호3.length() == 14 ) && 
						//주민등록번호가 - 포함 14자리가 맞는지 확인
						(주민번호3.charAt(6) == '-') &&
						//주민등록번호 6자리 작성후 -가 들어가 있는지 확인
						(주민번호3.substring(0, 6).matches("[0-9]+")) &&
						//앞의 6자리가 숫자로만 이루어져 있는지 확인
						(주민번호3.substring(7).matches("[0-9]+"));
						//인덱스7번부터 맨 뒤까지 모두 숫자인지 확인
		System.out.println("주민번호 작성이 잘됐는가? : " + is주민);
		
		
	}
}

package 자바_예제문제실습;

public class 배열 {

	public static void main(String[] args) {
		
		Circle[] 원들 = new Circle[2];
		
		//i값이 비어있지는 않은지 확인
		//원들[0], 원들[1] 각 자리에 값이 비어있지 않은지 확인
		System.out.println(원들[0]);
		원들[0] = new Circle(3.5);
		System.out.println(원들[1]);
		원들[1] = new Circle(4);
		
		//for문의 범위 확인
		for(int i = 0; i<원들.length; i++) {
			System.out.println(원들[i].getRadius());
		}
	}
}


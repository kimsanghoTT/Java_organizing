package 자바_예제문제실습;

public class 오버로딩 {

//매개변수 갯수에 따라 다른 생성자가 됨. -> 같은 이름도 여러개 가능
	
	public void test(double p) {}
	public void test(String str, String a) {}
	public void test(String s) {}

	public void test(int i, int a) {}
	private void test(int a) {}
	
	public void test(char a, char ch) {}
	void test(char ch) {}
	
	public void test(boolean a, String x, int y, short z, char k, byte b
			, long p, float f, double d) {}
	public void test(boolean b) {}
	public void test(short a, long l) {}
	public void test(short b) {}
	
	public void test(int a, String b) {}
	public void test(int a, String b, double d) {}
	
	public void test(String c, int b) {}
	public void test(String c, int b, String a) {}
	
	public void test(boolean a, boolean b) {}
	public void test(boolean a, boolean b, boolean c) {}
	
	public String test() {
		return "test";
		
	}
	public int test(short i, short o) {
		return 0;
	}
	public double test(String a, String b, String c) {
		return 0.1;
	}
	
	
	
	
}

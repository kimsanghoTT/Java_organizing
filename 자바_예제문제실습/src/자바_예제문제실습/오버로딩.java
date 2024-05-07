package 자바_예제문제실습;

public class 오버로딩 {

//매개변수 갯수에 따라 다른 생성자가 됨. -> 같은 이름도 여러개 가능
	
	public void test() {}
	public void test(String str, String a) {}
	public void test(String s) {}

	public void test(int i, int a) {}
	private void test(int a) {}
	
	public void test(char a, char ch) {}
	void test(char ch) {}
}

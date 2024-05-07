package ncs.test8;

public class UsetTest {

	public static void main(String[] args) {
		// User 객체를 담을 수 있는 배열 선언
		User[] users = new User[3];
		
		//3개의 User 객체 생성해서 배열에 넣기
		users[0] = new User("user01","비번1","김철수",32,'M',"010-1234-5678");
		users[1] = new User("user02","비번2","이영희",25,'F',"010-5555-7777");
		users[2] = new User("user03","비번3","황진이",20,'F',"010-9874-5632");
		for(User user : users) {
			System.out.println(user.toString());
		}
		//내가 만든 유저 정보를 그대로 복사해서 비교
		User[] copyUsers = new User[users.length];
		
		for(int i = 0; i<users.length; i++) {
			copyUsers[i] = users[i].clone(); // users를 복사
			System.out.println(copyUsers[i].toString());
		}

	}

}

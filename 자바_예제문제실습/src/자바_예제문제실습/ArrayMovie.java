package 자바_예제문제실습;

import java.util.ArrayList;

public class ArrayMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//영화를 넣을 ArrayList
		ArrayList<Movie> list = new ArrayList<>();
		
		list.add(new Movie("어벤저스", "액션"));
		list.add(new Movie("매드맥스", "스릴러"));
		list.add(new Movie("톰과제리","개그"));
	}

}

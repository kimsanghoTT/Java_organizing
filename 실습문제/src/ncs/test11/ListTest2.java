package ncs.test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void display(List<Integer> list) {
		for(int num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Random ran = new Random();
		for(int i = 0; i<10; i++) {
			arr.add(ran.nextInt(100)+1);
		}
		display(arr);
		
		Collections.sort(arr, new Decending2());
		display(arr);
	}
}

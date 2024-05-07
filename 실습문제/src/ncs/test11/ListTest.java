package ncs.test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest {
	
	public static void display(List<Integer> list) {
		for(int num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random ran = new Random();
		
		for(int i = 0; i<10; i++) {
			list.add(ran.nextInt(100)+1);
		}
		display(list);
		
		Collections.sort(list, new Decending());
		display(list);
	}
}

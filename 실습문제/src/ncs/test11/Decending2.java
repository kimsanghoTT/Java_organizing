package ncs.test11;

import java.util.Comparator;

public class Decending2 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}

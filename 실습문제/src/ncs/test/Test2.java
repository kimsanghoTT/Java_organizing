package ncs.test;

public class Test2 {

	public static void main(String[] args) {
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		int count = 0;
		String[] st = str.split(",");
		
		for(int i = 0; i<data.length; i++) {
			data[i] = Double.parseDouble(st[i]);
			sum += data[i];
			count++;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum/count));
	}

}

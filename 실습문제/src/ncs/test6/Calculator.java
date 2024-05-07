package ncs.test6;

public class Calculator {

	int num;
	double sum;

	public double getSum() {
		for(int i = 1; i<=num; i++) {
			sum += i;
		}
		return sum;
	}

	

}

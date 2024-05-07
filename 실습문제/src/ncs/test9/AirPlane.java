package ncs.test9;

public class AirPlane extends Plane{

	int afterFuel = 0;
	public AirPlane() {
		// TODO Auto-generated constructor stub
	}
	
	public AirPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	
	public void flight(int distance) {//운항
		afterFuel = (getFuelSize() - distance*3);
		System.out.println(getPlaneName() + "         " 
	+ afterFuel);
		
	}
	
	public void refuel(int fuel) {
		
		System.out.println(getPlaneName() + "         " 
	+ (afterFuel + fuel));
	}
}

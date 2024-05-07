package ncs.test9;

public class CargoPlane extends Plane{
	int afterFuel = 0;
	public CargoPlane() {
		// TODO Auto-generated constructor stub
	}
	
	public CargoPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {//운항
		afterFuel = (getFuelSize() - distance*5);
		System.out.println(getPlaneName() + "         " 
	+ (getFuelSize() - distance*5));
	}
	public void refuel(int fuel) {
		
		System.out.println(getPlaneName() + "         " 
	+ (afterFuel + fuel));
	}
}

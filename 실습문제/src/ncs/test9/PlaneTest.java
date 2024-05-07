package ncs.test9;

import java.util.Scanner;

public class PlaneTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("여객기 이름 : ");
		String apName = sc.nextLine();
		System.out.print("여객기 연료량 : ");
		int apFuelSize = sc.nextInt();
		sc.nextLine();
		System.out.print("화물기 이름 : ");
		String cgName = sc.nextLine();
		System.out.print("화물기 연료량 : ");
		int cgFuelSize = sc.nextInt();	
		
		System.out.println("Plane         fuelSize");
		System.out.println("------------------------");
		AirPlane 여객기 = new AirPlane(apName, apFuelSize);
		System.out.println(여객기.getPlaneName() + "         " + 여객기.getFuelSize());
		CargoPlane 화물기 = new CargoPlane(cgName, cgFuelSize);
		System.out.println(화물기.getPlaneName() + "         " + 화물기.getFuelSize());
		
		System.out.print("운항 거리 : ");
		int distance = sc.nextInt();
		System.out.println("Plane         fuelSize");
		System.out.println("------------------------");
		여객기.flight(distance);
		화물기.flight(distance);
					
		System.out.print("주유량 : ");
		int addOil = sc.nextInt();
		System.out.println("Plane         fuelSize");
		System.out.println("------------------------");
		여객기.refuel(addOil);
		화물기.refuel(addOil);
			
		sc.close();
	
		
	}

}

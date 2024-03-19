package InheritanceWithConstructor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter cost of vehicle");
		int vehicle_cost = scan.nextInt();
		
		System.out.println("Enter milage of vehicle");
		int vehicle_milage = scan.nextInt();
		
		System.out.println("Enter color of car");
		String car_color = scan.next();
		
		System.out.println("Enter no. of tyres in car");
		int car_tyres = scan.nextInt();
		
		
		//Create a car object 
		Car obj = new Car(vehicle_cost, vehicle_milage, car_color, car_tyres);
		
		obj.show_car_details();
		obj.show_vehicle_details();

	}

}

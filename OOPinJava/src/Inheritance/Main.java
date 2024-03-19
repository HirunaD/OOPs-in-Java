package Inheritance;

public class Main {

	public static void main(String[] args) {

		//Create an instance of the child class
		Car obj = new Car();
		
		obj.show_car_details();  //Can obtain the methods in child class
		obj.show_vehicle_details();  //Also can obtain the methods of the parent class, because of the inheritance

	}

}

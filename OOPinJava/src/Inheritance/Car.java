package Inheritance;

//Create a child class for the vehicle class using extends keyword
public class Car extends Vehicle {
	
	String color = "Blue";
	int tyres = 4;
	
	public void show_car_details() {
		
		System.out.println("I am a car");
		System.out.println("The color of the car is " + color);
		System.out.println("The number of tyres are " + tyres);

	}

}

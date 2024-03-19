package InheritanceWithConstructor;

//Create a parent class
public class Vehicle {
	
	//Initializing the Variables
	int cost = 0;
	int milage = 0;
	
	//Create the vehicle constructor
	public Vehicle(int c, int m) {
		cost = c;
		milage = m;
	}
	
	//Create a method
	public void show_vehicle_details() {
		
		System.out.println("I am a vehicle");
		System.out.println("The cost of the vehicle is " + cost);
		System.out.println("The milage of the vehicle is " + milage);

	}

}

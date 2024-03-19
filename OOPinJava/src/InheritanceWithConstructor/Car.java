package InheritanceWithConstructor;


//Create a child class for the vehicle class using extends keyword
public class Car extends Vehicle {
	
	//Define variables
	String color = "Blue";
	int tyres = 4;
	
	//Must create constructor for the child class (Because parent class has the constructor)
	public Car(int c, int m, String col, int ty) {
		
		//Arguments comes from the parent class (indicates by using the super keyword)
		super(c, m);
		//Arguments comes from the child class
		color = col;
		tyres = ty;
		
	}

	public void show_car_details() {
		
		System.out.println("I am a car");
		System.out.println("The color of the car is " + color);
		System.out.println("The number of tyres are " + tyres);

	}

}

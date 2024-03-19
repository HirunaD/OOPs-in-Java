package Interface;

//Implement the interface
public class Iphone implements Phone {

	@Override
	public void cost() {
		
		System.out.println("Cost of Iphone is Rs.100,000");
		
	}

	@Override
	public void color() {
		
		System.out.println("Color of Iphone is Gold");
		
	}

	@Override
	public void batteryLife() {
		
		System.out.println("Battery life of Iphone is 15 hours");
		
	}

}

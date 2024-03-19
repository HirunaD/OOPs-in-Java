package ExtendAndImplement;

//Man class extends Person class and implements Father interface
public class Man extends Person implements Father {

	int salary = 0;
	
	// Constructor for Man class
	public Man(String n, int a, int s) {
		super(n, a);
		salary = s;

	}

	// Override the task() method defined in the Father interface
	@Override
	public void task() {
		System.out.println("Earn money");
		
	}

}

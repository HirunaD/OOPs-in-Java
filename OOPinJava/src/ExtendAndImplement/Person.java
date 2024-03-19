package ExtendAndImplement;

//Create person class
public class Person {
	
	//Initialized variables
	String name = "";
	int age = 0;
	
	//Create the constructor
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	//Create the method
	public void show_person_details() {
		
		System.out.println("The name of the person is " + name);
		System.out.println("The age of the person is " + age);

	}

}

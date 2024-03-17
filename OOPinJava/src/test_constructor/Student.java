package test_constructor;

public class Student {
	
	String name = "";
	int marks = 0;
	
	public Student(String n, int m) {
		name = n;
		marks = m;
	}
	
	public void show_details() {
		
		System.out.println("Name of the student is " + name);
		System.out.println("Marks of the student are " + marks);
	}

}
	
	


package test_constructor;

import java.util.Scanner;

//import test_project.Student;

public class TestConstructor {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String my_name = scan.nextLine();
		
		System.out.println("Enter your marks");
		int my_marks = scan.nextInt();
		
		Student obj = new Student(my_name, my_marks);
		
		obj.show_details();
	}

}

package test_project;

import java.util.Scanner;

public class Student {
	
	Scanner scan = new Scanner(System.in);
	
	String name = "";
	int marks = 0;
	
	public void get_details() {
		
		System.out.println("Enter your name");
		name = scan.nextLine();
		
		System.out.println("Enter your marks");
		marks = scan.nextInt();
		
	}
	
	public void show_details() {
		
		System.out.println("Name of the student is " + name);
		System.out.println("Marks of the student are " + marks);
	}

}

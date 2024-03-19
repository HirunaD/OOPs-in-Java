package MultiLevelInheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String my_name = scan.next();
		
		System.out.println("Enter age:");
		int my_age = scan.nextInt();
		
		System.out.println("Enter gender:");
		String my_gender = scan.next();
		
		GrandChild obj = new GrandChild(my_name, my_age, my_gender);

		obj.show_name();
		obj.show_age();
		obj.show_gender();

	}

}

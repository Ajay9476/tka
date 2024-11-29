package practice.kiran;

import java.util.Scanner;

public class Student {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int age;

		String name;

		int id;
		{

			for (int i = 1; i <= 5; i++) {

				System.out.println("Enter the student details on screen ");

				System.out.print("Enter first Name :");

				name = sc.next();

				System.out.print("Enter second age :");

				age = sc.nextInt();

				System.out.print("Enter id ");

				id = sc.nextInt();

				System.out.println("Student " + i + " Details:");
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("ID: " + id);
				
				
				System.out.print("Thanks for the fill all data  HAVE GOOD DAY !!!!!!!");
			}
			
		sc.close();

		}
	}

}

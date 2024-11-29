package practice.kiran;

import java.util.Scanner;

public class modules {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" first  any number ");
		int nemeratour = sc.nextInt();

		System.out.println("Enter Second number");

		int denominator = sc.nextInt();

		if (denominator == 0) {

			System.out.println("Error Denominator cannot be 0");
		}

		else {

		}

		// perform the division

		int division = nemeratour / denominator;

		int modules = nemeratour % denominator;

		// Display the result

		System.out.println("" + division);
		System.out.println("" + modules);

	}
}

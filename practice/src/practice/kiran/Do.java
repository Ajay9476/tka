package practice.kiran;
import java.util.Scanner;
public class Do {

	public static void main(String args[]) {

		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the any digits number ");
		int no = Sc.nextInt();
		
		int originalnumber = no;
		int reversedNumber  = 0;

		while (no != 0) {

			int digit = no % 10;
			reversedNumber  = reversedNumber  * 10 + digit;
			no = no / 10;
		}             
		if (originalnumber == reversedNumber) {

			System.out.println("It is palindrome number");
		}

		else {

			System.out.println("It is not palimdrome number");
		}

	}

}
package practice.kiran;

public class Final {
	
	int a = 100, b = 60, c = 300, d = 40;

	 void local() {


		if (a > b && a > c && a > d) {

			System.out.println("A value is Greator");

		} else if (b > a && b > c && b > d) {

			System.out.println("b value is Greator");

		}

		else if (c > a && c > b && c > d) {

			System.out.println(" C is Greator");

		}

		else if (d > a && d > b && d > c) {
			System.out.println(" d is Greator");
		}

		else {
			System.out.println("Invalid word ");

		}
	}

}

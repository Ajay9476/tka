package practice.kiran;

public class loca {
      // global   variable
	static int a = 20;
	int b;

	static {

		System.out.println(" tring the code writing ");

		int R = 90;

		System.out.println("Display the R varible value on screen = " + R);
	}
	
	// declare the local variable on the screen

	static int d(int y, int z) {

		int q = y + z;

		System.out.println("declare the a value " + a);

		return q;
	}

	static int f(int h, int u) {

		int x = h - u;

		return x;
	}

	public static void main(String agrs[]) {

		loca l1 = new loca();
		loca l2 = new loca();

		int d = l1.d(5, 5);
		int f = l2.f(6, 3);
		
		System.out.println("Display d"+d);
		System.out.println("Display f"+f);
		}
}
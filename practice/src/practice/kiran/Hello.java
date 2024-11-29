package practice.kiran;

public class Hello {

	static int m = 20;

	static int n;

	static void opp(int Y) {

		System.out.println("" + m);

		System.out.println("" + Y);

		System.out.println("" + n);
	}

	static {
		System.out.println("Block initilized");

		 n = m + 30;
	}
	public static void main(String args [])
	
	{
		System.out.println("excecute the block code" + n);
		
		opp(10);
	}

}

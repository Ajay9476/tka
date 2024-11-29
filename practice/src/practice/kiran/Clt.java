package practice.kiran;

public class Clt {
	
	
	// attribute and method
	
	int mrp=100;
	
	String cname="Hello";
	
	
	// declare the method // method head /signature
	
	int Addtwo(int a,int b) {
		
		
		// body write all statement
		
		int sum = a+b;	
		
				return sum;
          
	}
   public static void main(String args []) {
	   
	   Clt c1 = new Clt();
	       
	int result = c1.Addtwo(12, 12);
	
	
	System.out.println(result);
	   
	   
	   
	   
   }
   
}
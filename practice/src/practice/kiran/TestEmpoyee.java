package practice.kiran;

public class TestEmpoyee {
	
	
	
	public static void main(String args[]) {
		
		
		Employee e1 = new Employee();

		e1.name= "Raj";
		
		e1.salary= 35000;
		
		e1.age = 26;
		
		e1.display();
		
		System.out.println("Name = "+e1.name+",Salary"+e1.salary);
		 		
	}

}

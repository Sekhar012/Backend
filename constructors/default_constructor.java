package constructors;

public class default_constructor {		//method name
	int empid;
	String empname;
	
	public default_constructor() // class name
								//method name and class name both are equal thats constructor
	{
		empid=10;
		empname="siva";
	} 
//	public default_constructor()     //default constrctor use only one constructor 
//	{
//		empid=10;
//		empname="siva";
//	}
	public void display()
	{
		System.out.println("emp id "+empid);
		System.out.println("empname "+empname);
	}
	public static void main(String[] args) {
		default_constructor sd=new default_constructor();
		sd.display();
	}
}

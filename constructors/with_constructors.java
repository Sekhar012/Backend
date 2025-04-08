package constructors;

public class with_constructors {  //with constructors and its parametrized constructors

	private with_constructors()
	{
		System.out.println(" im from sklm");
	}
	private with_constructors(int a) 
	
	{
		System.out.println("id number :"+a);
	}
	
	private with_constructors(String b,float c)
	{
		System.out.println("name :"+b+"sal :"+c);
	}
	
	public static void main(String[] args) { 

		with_constructors cn= new with_constructors();
		with_constructors cn1=new with_constructors(101);
		with_constructors cn2= new with_constructors("raja",30000);
		with_constructors cn3= new with_constructors();
	
	}

}

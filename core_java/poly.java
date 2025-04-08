package core_java;


public class poly {

	public void raj(int a,int b)
	{
		System.out.println("sum of two numbers (int):"+(a+b));
	}
	public void raj(float a,float b)
	{
		System.out.println("sum of two numbers (float):"+(a+b));
	}
	public void raj(int a,float b)
	{
		System.out.println("sum of two numbers int,float:"+(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		poly ab= new poly();
		ab.raj(23,20);
		ab.raj(23,20.3f);
		ab.raj(2.3f,20.0f);
		
	}

}

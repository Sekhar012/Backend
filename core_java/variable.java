package core_java;

public class variable {
	int a=10;              //instance variable
	static String b="raj"; // static  variable
	
	public static void main(String[] args) {
		int c=30;      //local variable
//		System.out.println(a);
		System.out.println(b); //generaly static variable call in classname.varablename
		System.out.println(variable.b);
		System.out.println(c);
     	variable v=new variable();     //object creation
		
		System.out.println(v.a);
		System.out.println("something something :"+v.a+variable.b+c);

}
}

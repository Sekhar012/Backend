package core_java;

public class Parse_method {  // parse_method--->className

	public static void main(String[] args) {
	
		int emp_salary=Integer.parseInt(args[0]);
		double annaly_sal=emp_salary*12;
		
		System.out.println("employee package : "+ annaly_sal);
		
		int a=Integer.parseInt(args[1]); 
		
		int b=Integer.parseInt(args[2]);
		int c=a+b;
		System.out.println("\t sum of c: "+c);
		
		float d=Float.parseFloat(args[1]);
		float e=Float.parseFloat(args[2]);
		float f=d*e;
		System.out.println("\t product of F : "+f);
		
		double g= Double.parseDouble(args[1]);
		double h= Double.parseDouble(args[2]);
		double i=g%h;
		System.out.println("\t module of i: "+ i);
		
		byte j= Byte.parseByte(args[1]);
		byte k= Byte.parseByte(args[2]);
		int lm= j/k;
		System.out.println("\t division of lm :"+lm);
		

		
	


	}

}

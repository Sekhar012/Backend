package core_java;

public class variables_empdetails {
int empid=101;                           //instance variable
int empsalary=30000;                     //instance variable
int empatmpin=10001;                     //instance variable
static String empname="raju";           //static variable

public static void main(String[] args)  {

	String empadd="sklm(532185),AP";      //local variable
	
	variables_empdetails ev=new variables_empdetails();
	
	System.out.println("--------employee details----------");
	System.out.println("\t employee id = "+ev.empid);
	System.out.println("\t employee salary = "+ev.empsalary);
	System.out.println("\t emoloyee ATM pin = "+ev.empatmpin);
	
	System.out.println("\t employee name= "+variables_empdetails.empname);
	
	System.out.println("\t employee addres = "+empadd);

	}

}

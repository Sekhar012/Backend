package standed_programs.java;

import java.util.Scanner;
public class quadraticequation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the values A,B and C :");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c= sc.nextDouble();
		double discriminant=b*b-4*a*c;
		
		double root1,root2;
		if(discriminant >0) {
			root1=(-b-Math.sqrt(discriminant))/(2*a);
			root2=(-b+Math.sqrt(discriminant))/(2*a);
			System.out.println("the roots are real and distinct");
			System.out.println("Root1 :"+root1);
			System.out.println("Root2 :"+root2);
		}
		else if(discriminant==0){
			root1=-b/(2*a);
			System.out.println("the roots are real and equal:");
			System.out.println("ROOT1=ROOT2 :"+root1);
		}
		else {
			double realpart=-b/(2*a);
			double imaginarypart=Math.sqrt(-discriminant)/(2*a);
			System.out.println("roots are complex and conjugate :");
			System.out.println("Root1 ="+realpart+"+"+imaginarypart+"i");
			System.out.println("Root2 ="+realpart+"-"+imaginarypart+"i");
		}
		}
}

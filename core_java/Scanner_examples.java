package core_java;

import java.util.Scanner;

public class Scanner_examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name :");
		String name=sc.nextLine();
		
		System.out.println("enter the pasword :");
		String psd=sc.next();
		
		System.out.println("enter the salary :");
		double sal=sc.nextDouble();
		
		System.out.println("name :"+name+"pasword:"+psd+"salary :"+sal);
	}

}

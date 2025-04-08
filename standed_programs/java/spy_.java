package standed_programs.java;

import java.util.Scanner;

public class spy_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value :");
		int a=sc.nextInt();
		
		int sum=0,pro=1;
		while(a>0||a<0) {            //sum of the digits=pro of the digits
			int ld=a%10;
			sum=sum+ld;
			pro=pro*ld;
			a=a/10;
		}
			if(sum==pro) {
				System.out.println("given number is spy");
			             }
			else {
				System.out.println("given number is not spy");
			     }
	}
}


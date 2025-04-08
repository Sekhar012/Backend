package core_java;
import java.util.Scanner;

public class flow_controls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
//		System.out.println("enetr the given number:");
//		int num =sc.nextInt();
//		
//		int ab =num%2;
//		if (ab==0) 
//		{
//			System.out.println("its even number");
//		}
//		else
//		{
//			System.out.println("its even number");
//		}
//	}
//}
		System.out.println("enetr the given name:");
		String name=sc.next();
		
		if (name.equalsIgnoreCase("raja"))
		{
			System.out.println("given name is matched raja");
		}
		else if(name.equals("sekhar"))
		{
			System.out.println("name is matched sekhar");
		}
		else if (name=="ramu")
		{
			System.out.println("name is matched ramu ");
		}
		else
		{
			System.out.println("not match any name");
		}
	}

}

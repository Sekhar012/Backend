package core_java;
import java.util.Scanner;

public class switch_conditions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the feedback like-(good,bad,worst,...) :");
		String fd=sc.nextLine();
		 switch (fd)
		 {
		 case "good":
			 System.out.println("service is good tq");
			 break;
		 case "bad":
			 System.out.println("service is bad u can leave ");
			 break;
		 case "worst":
			 System.out.println("service is worst u can also leave ");
			 break;
			 default:
				 System.out.println("not match case once check your feedback");
		 }
	}
}

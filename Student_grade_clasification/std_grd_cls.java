package Student_grade_clasification;
import java.util.Scanner;

public class std_grd_cls {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr students name :");
		String name=sc.nextLine();
		System.out.println("enetr students age :");
		int age=sc.nextInt();
		System.out.println("enetr grade for Maths :");
		int maths=sc.nextInt();
		System.out.println("enetr grade for Scince :");
		int science=sc.nextInt();
		System.out.println("enetr grade for English :");
		int english=sc.nextInt();
		
		float m=maths,s=science,e=english,avg ;
		System.out.println("\t student name :"+name);
		System.out.println("\t student age :"+age);
		System.out.println("\t Maths Grade  :"+m);
		System.out.println("\t Scince Grade  :"+s);
		System.out.println("\t English Grade :"+e);
		
		avg=(m+s+e)/3;
		System.out.println("\t Average grade :"+avg);
		
		if (avg>0 && avg<40)
		{ 
			System.out.println("\t Grade clasification : 3rd class");
		}
		else if(avg>40 && avg<60)
		{
			System.out.println("\t Grade clasification : Second class");
		}
		else if(avg>60 && avg<100)
		{
			System.out.println("\t Grade clasification : First class");
		}
		else
		{
			System.out.println("\t Grade clasification :  invalid input values please check once ");
		}
	}
} 

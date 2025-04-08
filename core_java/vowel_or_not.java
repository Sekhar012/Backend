package core_java;
import java.util.Scanner;
public class vowel_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("enter the character :");
		char ch=sc.next().charAt(0);
		
		ch=Character.toUpperCase(ch);
		if (ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("given character : "+ch+"\t is vowel :");
		}
		else
		{
			System.out.println("given character :"+ch+"\t is Not vowel");
		}
	}

}

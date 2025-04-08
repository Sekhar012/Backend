package standed_programs.java;

public class harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=31,givena=a,sum=0;
		while(a>0)                    //given num % given num digits sum==0
		{                      
			int ld=a%10;
			sum=sum+ld;
			a=a/10;
		}
		if(givena%sum==0) {
			System.out.println("this number is harshad");			
		}
		else {
			System.out.println("this number is NOT harshad");		
		}
	}

}

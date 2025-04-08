package standed_programs.java;

public class given_num_strong_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=145,temp=a,sum=0;
			while(a>0) {				//given num each digit factorial sum is = given num
				int ld= a%10;
				int fact=1;
				for(int i=1;i<=ld;i++) {
					fact=fact*i;
				}
				sum=sum+fact;
				a=a/10;
			}
			if(temp==sum) {
				System.out.println("given number "+temp+" is strong");
			}
			else {
				System.out.println("given number "+temp+" is not strong");

			}
	}

}

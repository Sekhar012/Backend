package standed_programs.java;

public class largestdigit_prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=7347423,largest=0;
			while(a>0) {
				int ld=a%10;
				if(ld>largest) {
					largest=ld;
				}
				a=a/10;
			}
			int i=1,count=0;
			while(i<=largest) {
				if(largest%i==0) {
					count++;
				}
				i++;
			}
			if(count==2) {
				System.out.println("given number largest digit :"+"(-"+largest+"-)"+" is prime ");
			}
			else {
				System.out.println("given number largest digit :"+largest+" is not prime ");

			}
	}

}

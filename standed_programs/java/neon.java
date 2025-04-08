package standed_programs.java;

public class neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9,square=a*a,sum=0;
		while(square>0) {				//(given num =given num square digit sum)
			int ld=square%10;
			sum=sum+ld;
			square=square/10;
		}
		if(a==sum) {
			System.out.println("given number is neon");
		}else {
			System.out.println("given number is not neon");
		
	}

}
}

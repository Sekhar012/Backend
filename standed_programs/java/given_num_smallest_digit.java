package standed_programs.java;

public class given_num_smallest_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=9273649,smallest=10;
			while(a>0) {
				int ld=a%10;
				if(ld<smallest) {
					smallest=ld;
				}
				a=a/10;
			}
			System.out.println("given number smallest digit = "+smallest);
	}

}

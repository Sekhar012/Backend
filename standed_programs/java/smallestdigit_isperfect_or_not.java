package standed_programs.java;

public class smallestdigit_isperfect_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=896789879,smal=10,sum=0;
			while(a>0) {
				int ld=a%10;
				if(ld<smal) {
					smal=ld;
				}
				a=a/10;
			}
			for(int i=1;i<smal;i++) {
				if(smal%i==0) {
					sum=sum+i;
				}
			}
			if(sum==smal) {
				System.out.println("smallest digit "+smal+" is perfect");
			}
			else {
				System.out.println("smallest digit "+smal+" is not perfect");

			}
	}

}

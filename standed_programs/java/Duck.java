package standed_programs.java;

public class Duck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=123,count=0;
			while(a>0) {				//given number to exist minimum one zero digit 
				int ld=a%10;
				if(ld==0) {
					count++;
				}
				a=a/10;
			}
			if(count>= 1) {
				System.out.println("duck number");
			}
			else {
				System.out.println("not duck number");
			}
	}

}

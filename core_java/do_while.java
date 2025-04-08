package core_java;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		do {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}
		while(i<=10);
		System.out.println(sum);
	}

}

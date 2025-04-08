package standed_programs.java;

public class given_num_largestdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=29654682,largest=0;
			while(a>0) {
				int ld=a%10;
				if(ld>largest) {
					largest=ld;
				}
				a=a/10;
			}
			System.out.println("largest digit = "+largest);
	}

}

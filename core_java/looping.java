package core_java;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count_1=0;
		for (int a = 20; a >= 10; a--) {

			
			if (a == 15 || a==12)
				
			{

				count_1++;
				continue;
			}
			
			System.out.println("\t values are :" + a);
		}
	
		for (int j=1;j<=count_1;j++)
		{
			System.out.println("hello");
		}
		int i=1,count=0;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
			i++;
		  }
		System.out.println("even no's count = "+count);
	}
	
}

package standed_programs.java;

public class spynumbers_1_to_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,j=1000,count=0,sum=0,pro=1;
		System.out.println("0 to 1000 spy numbers given below :");
		while(i<j) {
			int num=i,sum1=0,pro1=1;
			while(num>0) 
			{
				int ld=num%10;
				sum1=sum1+ld;
				pro1=pro1*ld;
			 num=num/10;	
			}
			if(sum1==pro1) {
				System.out.println(i);
				count++;
				sum=sum+i;
				pro=pro*i;
			
			}
		i++;
		}
		System.out.println(" spy numbers total count :"+ count);
		System.out.println("total sum :"+ sum);
		System.out.println("total product :"+ pro);
	}

}

package core_java;

class raj
{
	public void rr(String username)
	{
		System.out.println("username :"+username);
	}
	public void rr2(int rollno)
	{
		System.out.println(101);
	}
	public void raj() {
		// TODO Auto-generated method stub
		
	}
}
public class override extends raj{
	@Override
	public void rr2(int rollno)
	{
		rollno=40;
		System.out.println("105"+rollno); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		override ad= new override();
		ad.rr("sai");
		ad.rr2(33);
	}

}

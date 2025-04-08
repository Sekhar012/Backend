package constructors;

public class auth {
	public boolean raj(String a)
	{
		return a.equals("rajasekhar");
	} 
	public boolean raj(String a,String pasword)
	{
		return a.equals("rajasekhar")&& pasword.equals("raja@123");
	}
	public boolean raj(long phno,String a,String pasword)
	{
		return phno==676989879 &&a.equals("rajasekhar")&& pasword.equals("raja@123");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		auth ab=new auth();
		System.out.println(ab.raj("rajasekh"));
		System.out.println(ab.raj("rajasekhar", "raja@123"));
		System.out.println(ab.raj(0, null, null));
	}

}

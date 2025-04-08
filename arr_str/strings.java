package arr_str;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="rajasekhar";
		// string is immutable
		
		name.concat("siva");
		System.out.println(name); // doesnt concatnation
		
		String nm=name.concat("siva");
		System.out.println(nm);// o/p rajasekharsiva
		
		//literal way
		String a="abc";
		String b="abc";
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		//by using new key word
		String s= new String("raj");
		String s1=new String ("raj");
		System.out.println(s.equals(s1)); //true
		System.out.println(s==s1);        // false
		// maximum string using ".equals" method.  not using "=="
		// only literalway lo two difrent varable refrances accepting "=="symbole.
	}

}

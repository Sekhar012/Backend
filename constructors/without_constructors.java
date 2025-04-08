package constructors;
//without constructor  like its methods
public class without_constructors {  //classname
	
	int a=10;
	String b="raja";
	
	public void assign() { 
		
		a=20;b="sekhar";
	}
	
	public void display() {
		System.out.println("std id number :"+a+"\n std name :"+b);     // [\n->next line]
	}                                                                  // [\t-> some space]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		without_constructors ct=new without_constructors();
		
		ct.assign();
		ct.display();
	}

}

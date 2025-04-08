package hotel_management;

public abstract class Person {

	String id;
	String name;
	String phno;
	
	public Person(String id, String name, String phno) {
		this.id=id;
		this.name=name;
		this.phno=phno;
	}
	abstract void  show();
}

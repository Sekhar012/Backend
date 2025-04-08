package hotel_management;

public class Customer extends Person {
	String roomId;
	Room room; //HAS-A RELATION
	
	public Customer(String id,String name,String phno,Room room)
	{
		super(id,name,phno);
		this.room=room;
	}
	public void rentroom()
	{
		this.roomId=room.getRoomID();
	}
	@Override
	public void show() {

		System.out.println("----customer detils..----");
		System.out.println("\t customer id :"+ super.id);
		System.out.println("\t customer name :"+ super.name);
		System.out.println("\t customer phno :"+ super.phno);
		System.out.println("\t customer roomid :"+ roomId);
	}
}

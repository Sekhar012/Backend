package hotel_management;

public class DeluxRoom extends Room{
	double roomSize;
	public DeluxRoom(String roomID,int roomNum,double roomFare,double roomSize)
	{
		super(roomID,roomNum,roomFare);
		this.roomSize=roomSize;
	}
	@Override
	void roominfo() {
		// TODO Auto-generated method stub
		System.out.println("---deluxe room information ---");
		System.out.println("\t Room ID  : " + super.getRoomID());
		System.out.println("\t Room number  :"+super.getRoomNum());
		System.out.println("\t room fare  :"+super.getRoomFare());
		System.out.println("\t room size  :"+ this.roomSize);
       
	}
	
}

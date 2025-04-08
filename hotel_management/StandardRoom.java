package hotel_management;

public  class StandardRoom  extends Room{

	boolean ac_availability;
	
	public StandardRoom(String roomID,int roomNum,double roomFare,boolean ac_availability) 
	{
     super(roomID,roomNum,roomFare);
  this.ac_availability=ac_availability;
	}

	@Override
	void roominfo(){

		System.out.println("----standard room details-----");
		System.out.println("\t room id :"+super.getRoomID());
		System.out.println("\t room roomnum :"+super.getRoomNum());
		System.out.println("\t room roomfare :"+super.getRoomFare());
		System.out.println("\t room ac_availability :"+this.ac_availability);

	
	}	
}

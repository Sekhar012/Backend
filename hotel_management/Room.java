package hotel_management;

public abstract class Room {
	String roomID;   //initialization
	int roomNum;
	double roomFare;
	//parameter cunstructor
	public Room (String roomID,int roomNum,double roomFare)
	{
		this.roomID=roomID;
		this.roomNum=roomNum;
		this.roomFare=roomFare;
	}
	
	//GETTERS AND SETTERS

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public double getRoomFare() {
		return roomFare;
	}

	public void setRoomFare(double roomFare) {
		this.roomFare = roomFare;
	}
	
	abstract void roominfo(); //room information

}

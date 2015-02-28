class Student {
	
	static String id;
	static String name;
	static int dormRoom;

	Student() {
		this.id = id;
		this.name = name;
		this.dormRoom = dormRoom;
	}
	
	public void setID(String i)
	{
		id = i;
	}
	public void setSName(String sn) {
		name = sn;
	}

	public void setSRoom(int dormRoomNum) {
		dormRoom = dormRoomNum;
	}

	public String getId() {
		return id;
	}
	
	public String getSName(){
		return name;
	}

	public int getSRoom() {
		return dormRoom;
	}

	public String toString() {
		return name + ", your student ID is: " + id + ", your dorm room is: "
				+ dormRoom;
	}
}

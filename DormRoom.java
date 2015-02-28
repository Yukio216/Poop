import java.util.ArrayList;

class DormRoom {

	static String building;
	static int room;

	DormRoom() {
		this.building = building;
		this.room = room;
	}

	public void setDName(String Dn) {
		building = Dn;
	}

	public void setRoom(int i) {
		room = i;
	}

	public String getDormName() {
		return building;
	}

	public int getRoom() {
		return room;
	}

	public String toString() {
		return building + " Dorm" + ", Room " + room;
	}
	
}

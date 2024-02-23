public class Hotel {
	private String name;
	private String city;
	private int rooms;
	private int free;
	public String getName() {
		return name;
	}
	public String getCity(){
		return city;
	}
	public int getRooms() {
		return rooms;
	}
	public int getFree(){
		return free;
	}
	//Constructor 1
	public Hotel(String name, String city, int rooms, int free){
		this.name = name;
		this.city = city;
		this.rooms = rooms;
		this.free= free;
	}
	//Constructor 2
	public Hotel(){
		this.name = "NA";
		this.city = "NA";
		this.rooms = 0;
		this.free= 0;
	}

	public void setFree(int free) {
		this.free = free;
	}

	public void setData(String name, String city, int rooms, int free){
		this.name = name;
		this.city = city;
		this.rooms = rooms;
		this.free= free;
	}
	public String toString(){
		return "Hotel Name: " + this.name + "\n City: " +city +
				"\n Total rooms:" + this.rooms + "\n Free rooms: " + free;
	}
}


public class Auto {
	private String name;
	private int id, occupancy, number, day;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	private float load, price;
	
	public Auto(String name, int id, int occupancy, float price) {
		super();
		this.name = name;
		this.id = id;
		this.occupancy = occupancy;
		this.load = 0;
		this.price = price;
	}
	public Auto(String name, int id, float load, float price) {
		super();
		this.name = name;
		this.id = id;
		this.occupancy = 0;
		this.load = load;
		this.price = price;
	}
	public Auto(String name, int id, int occupancy, float load, float price) {
		super();
		this.name = name;
		this.id = id;
		this.occupancy = occupancy;
		this.load = load;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}
	public float getLoad() {
		return load;
	}
	public void setLoad(float load) {
		this.load = load;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}

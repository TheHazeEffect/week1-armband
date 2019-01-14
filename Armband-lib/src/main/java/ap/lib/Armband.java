package ap.lib;

public class Armband {
	private int id;
	private String color;
	private float price;
	
	public Armband(){
		this(0,"",0);
	}
	
	public Armband(int id, String color, float price) {
		super();
		this.id = id;
		this.color = color;
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Armband [id=" + id + ", color=" + color + ", price=" + price
				+ "]";
	}
	
	

}

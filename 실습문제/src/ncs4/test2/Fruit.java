package ncs4.test2;


public class Fruit implements Comparable<Fruit>{

	private String name;
	private int price;
	private int quantity;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return name + ", " + price + "원, " + quantity + "개";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int compareTo(Fruit 과일비교) {
		return this.name.compareTo(과일비교.name); // 같은 이름끼리 비교하게 됨
	}
	
}

package ncs.test7;

public class Human {

	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String toString() {
		return name + " "+ age + " "+ height +" "+ weight + " ";
	}
}

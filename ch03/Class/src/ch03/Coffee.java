package ch03;

public class Coffee {
	
	private int id;
	private String name;
	private double price;
	
	public Coffee(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}

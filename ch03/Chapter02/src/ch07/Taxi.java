package ch07;

public class Taxi {
	
	int money;
	String name;

	
	public Taxi(int money, String name) {
		this.money = money;
		this.name = name;
	}
	
	public void take(int money) {
		this.money = 10000;
	}

}

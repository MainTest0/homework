package ch02;

public class Person {

	private String name;
	private int age;
	private Address address;
	
	public Person(String name, int age, Address address) {
		address = new Address("연수로 249번길", "서울", "자이303호", "1234-456"); 	//1002번지 외부에서 쓰는 녀석과 다른 녀석이다.
		this.address = address;			//이 코드는 외부코드와 같은 녀석이다.
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}
	
	
	
}

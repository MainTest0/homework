package ch02;

public class Main {

	public static void main(String[] args) {

		//Address address = new Address();		//여기 address는 번지가 1001번지
		//Person person = new Person("홍길동", 20, address);

		Address address = new Address("해운대구 좌동 123", "부산", "롯데103호", "456-123");
		Person person = new Person("홍길동", 10, address);
		
		System.out.println("name : " + person.getName());
		System.out.println("address : " + person.getAddress().getCity());
		// Person 클래스에서 Address 클래스를 참조 할 수 있다.
		// Address 클래스는 Person 클래스를 참조할 수 없다.
		
	}

}

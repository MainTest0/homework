package ch07;

public class Person {

	//this의 이용방법 3가지
	// 1. 자기 자신을 가리킨다.
	
	private String name;
	private int age;
	private String phone;
	private String gender;

	public Person(String name, int age) {
		// 1번에 대한 사용법 ( 자기 자신을 가리키는 this)
		this.name = name;
		this.age = age;
	}
	// 2. 생성자에서 다른 생성자를 호출할 때 사용할 수 있다.
	
	// 생성자는 객체가 메모리에 올라갈 때 제일 먼저 실행하는 코드이다.
	 public Person(String name, int age, String phone) {
		 // new this();
		 this(name, age);
		 //this.name = name;
		 //this.age = age;
		 this.phone = phone;
	 }
	 
	 public Person(String name, int age, String phone, String gender) {
		 this(name, age, phone);
		 this.gender = gender;
	 }
	 // 3. 자신의 주소(참조값, 주소값)을 반환시킬 수 있다.

	 // 자기 자신을 반환하는 this는 디자인 패턴중에 빌더패턴을 만들어 낼 수 있다.
	 public Person getPerson() {
		 return this;
	 }
	 
	 public void showInfo() {
		 System.out.println("이름 : " +name + ", 나이 : " + age);
	 }
	 
	// static 메인 함수는 잠시 자리를 빌려서 사용한다.
		public static void main(String[] args) {
			Person person1 = new Person("홍길동",100);
			person1.showInfo();
		}// end of main
	 
}// end of Person class


// xxx.java 파일 하나에 여러 클래스를 작성할 수 있다.
// 단, xxx.java 하나의 파일 안에 public을 가지는 클래스는 단 한개만 선언할 수 있다.
// class PersonMainTest -> default 타입으로 자동 전환
// ch07에 있는 클래스들은 사용 가능(참조 타입)
// public class PersonMainTest{} => 문법 오류
class PersonMainTest{
	
	
	
}// end of PersonMainTest class






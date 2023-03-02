package ch01;

public class Student {

	// 상태(속성)	(멤버변수)
	int studentId;
	String name;
	String address;
	double height;
	boolean isMarred;
	
	// 기능
	
	// 공부한다
	public void study() {
		System.out.println(name+"학생이 공부를 합니다.");
	}

	// 휴식한다
	public void breakTime() {
		System.out.println(name+"학생이 휴식을 합니다.");
	}
	
	// 상태창
	public void showInfo() {
		System.out.println("==========상태창=========");
		System.out.println("학생의 ID값은 : " + studentId);
		System.out.println("학생의 이름은 : " + name);
		System.out.println("학생의 주소는 : " + address);
		System.out.println("==========상태창=========");
		
		Student studetLee = new Student();
		
	}
	
	// 함수와 메서드의 차이점
	// 메서드란
	// 자바에서 메서드란 객체의 기능을 구현하기 위해서 클래스 내부에 구현되는 메서드
	// 멤버 함수라고도 한다.(Member Function)
	// 결론 : 메서드는 자신의 변수를 활용해서 객체의 기능을 구현하는 것
	// -> 함수를 만들 때는 독립적인 기능중심으로 만들어냈지만
	// student를 설계했을때 관련있는 동작들 독립적이지 않은 객체의 기능을 구현한것
	
	// 학생의 기능(메서드) 3가지 정의해주세요.
	
	// 시험친다
	public void Example() {
		System.out.println("학생이 시험을 친다.");
	}
	// 청소한다
	public void clean() {
		System.out.println("학생이 청소를 한다.");
	}
	// 급식먹는다
	public void eat() {
		System.out.println("학생이 급식을 먹는다.");
	}
	// 집에간다.
	public void home() {
		System.out.println("학생이 집에간다.");
	}
	
	
}	// end of class

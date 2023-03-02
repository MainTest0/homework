package ch01;

public class MainTest1 {
	// 메인함수
	public static void main(String[] args) {

		// 데이터 타입이 사용자 정의 타입( 대문자 --> 참조타입)
		// 대문자로 쓰는건 전부 참조타입
		Student studentKim = new Student();
		studentKim.studentId = 1;
		studentKim.name = "홍길동";
		studentKim.address = "부산시 해운대구";

		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		System.out.println("================");
		

		Student studentLee = new Student();
		studentLee.studentId = 1;
		studentLee.name = "이순신";
		studentLee.address = "부산시 진구";
		
		studentLee.study();
		studentLee.showInfo();

	}// end of main

}// end of class

package ch05;

public class MainTest3 {

	int number1 = 10; // 멤버변수(클래스에서 선언하는 변수)
	User user = new User(); // 멤버변수 (데이터타입은 참조타입), 참조타입 변수는 대문자로 시작한다.
	// 참조타입은 정확한 메모리공간을 알 수 없다. (int = 4byte <-> String a = "asdlfjslkdjflk"; (몇
	// byte)

	// 메인함수(코드의 시작점) 실행하면 제일먼저 찾아보는 코드
	public static void main(String[] args) {

		// 변수의 선언, 데이터타입 : 변수의 종류(기본 데이터 타입)
		// 지역변수(main에서 선언하는 변수)

		int number1;
		User userKim; // 변수의 선언과 같다. (데이터타입은 참조타입), 지역변수

		//System.out.println(user);

	} // end of main

} // end of class

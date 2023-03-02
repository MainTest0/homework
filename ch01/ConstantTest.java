package ch01;

public class ConstantTest {
	// 코드의 시작점은 main함수
	public static void main(String[] args) {

		// 상수 : 변하지 않는 수
		// 예약어 : final사용하면 된다.
		// 권장사항 : 상수는 대문자로 사용하고 연결에 단어는 밑줄로 구분
		
		final int MAX_NUM = 10;
		// 상수의 선언과 초기화
		// MAX_NUM = 200;  - 오류 : 한번 초기화된 값은 변경할 수 없다.
		
		final int MIN_NUM;	// 상수의 선언
		MIN_NUM = 1;		// 상수는 선언후에 단 한번만 초기화 할 수 있다.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

	} // end of main

} // end of class

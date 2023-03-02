package ch01;

public class DataType1 {

	// 코드 시작점 : main함수
	public void main(String[] args) {

		// 데이터 타입의 종류 2가지
		// 1. 기본 데이터 타입(Primitive Data Type)
		// 2. 참조 타입(Reference Type)

		// 정수형(1, 10, 100) 데이터 타입
		// 크기가 다를 수 있다.

		byte b; // 8bit (1byte) 크기를 담을 수 있다.
		short s; // 16bit (2byte) 크기를 담을 수 있다.
		int i; // 32bit (4byte) 크기를 담을 수 있다.
		long l; // 64bit (8byte) 크기를 담을 수 있다.

		b = 127;
		b = -128;
		// 데이터타입 byte는 정수 -128~127까지 담을 수 있다.

		s = 128;
		// s = 200000000;

		// int는 약 +- 21억정도까지의 정수를 담을 수 있다.
		i = 2100000000;
		// i = 2200000000;

		// L.value, R.value
		// 컴퓨터 정수값의 기본단위는 int이다.
		l = 2200000000L;

	}// end of main

}// end of class

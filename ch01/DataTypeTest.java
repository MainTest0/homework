package ch01;

public class DataTypeTest {

	public static void main(String[] args) {
		// 1번 : 정수 550을 name1 이름으로 변수에 담기
		int name1 = 550;
		System.out.println(name1);
		// 2번 : 정수 22억을 name2 이름으로 변수에 담기
		long name2 = 2200000000L;
		System.out.println(name2);
		// 3번 : 문자 A를 name3 이름으로 변수에 담기
		char name3 = 'A';
		System.out.println(name3);
		// 4번 : 실수 float 타입으로 0.12345678을 name 4 이름으로 변수에 담기
		float name4 = 0.12345678F;
		System.out.println(name4);
		// 5번 : 실수 double 타입으로 200.0035를 name 5
		double name5 = 200.0035;
		System.out.println(name5);
		// 6번 : 논리 자료형 isOk 이름의 변수를 선언
		boolean isOk;
		// 7번 : isOk 변수에 값을 false로 초기화
		isOk = false;
		System.out.println(isOk);
		// 8번 : isOk 변수에 값을 true로 변경
		isOk = true;
		System.out.println(isOk);
		// 9번 : 변수란 무엇인지 서술
		// 변수란 변할 수 있는 수로 하나의 그릇(변수)에 원하는 내용물을 담는것과 같다.
		// 데이터값을 메모리에 저장할 수 있는 메모리공간
		// 10번 : 기본 데이터 타입에 종류 8가지를 서술
		// 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		// 실수형 : float(4byte), double(8byte)
		// 논리형 : boolean(1byte)
		// 문자형 : char(2byte)
	}
}

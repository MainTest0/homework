package ch01;

import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner); 
		Student studentKim = new Student();
		System.out.println(studentKim); 	// 주소값이 출력된다.
		Student studentLee = new Student();
		System.out.println(studentLee); 	// 주소값이 출력된다.
		
		
		// ------------*별2개*--------------
		// 기본 데이터 타입은 값(리터럴)이 출력이 된다.
		// 참조 타입은 주소값이 출력이 된다.
		
		System.out.println("========================");
		System.out.println(studentLee.studentId);
		System.out.println(studentLee.name);
		System.out.println(studentLee.address);
		System.out.println(studentLee.height);
		System.out.println(studentLee.isMarred);
		
		// 멤버 변수는 객체로 메모리에 올라 간 뒤, 멤버 변수에 값을 할당하지 않으면
		// 기본값으로 컴파일러가 알아서 초기화 해준다.
		
		// double의 기본값 : 0.0
		// boolean의 기본값 : false

	}// end of main

}// end of class

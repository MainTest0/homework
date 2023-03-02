package ch05;

import java.util.Scanner;

public class UserMainTest2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 개행문자를 제거하지 않았기 때문에
		// 바로 아래 코드가 동작하고 완료 되어진다.
		//int userinput1 = scanner.nextInt();
		//scanner.nextLine();
		// 입력 장치 (키보드값을 받아주는 객체)
		// 정수값을 입력 받을 때
		//int a = scanner.nextInt();
		// 100 + 엔터(개행 문자 \n)
		//scanner.nextLine();		// 엔터키 소화
		

		// 스캐너를 활용해서 값을 입력 받고 화면에 뿌려 주세요
		// 여러분들이 정의한 클래스를 가지고 값 할당 코드 작성
		// 정보를 출력해주세요
		
		UserClass2 User2 = new UserClass2();
		
		System.out.println("이름을 입력해주세요");
		User2.name = scanner.nextLine();
		
		System.out.println("나이를 입력해주세요");
		User2.age = scanner.nextInt();
		
		System.out.println("키를 입력해주세요");
		User2.height = scanner.nextInt();
		
		System.out.println("몸무게를 입력해주세요");
		User2.weight = scanner.nextInt();
		
		System.out.println("사는곳을 입력해주세요");
		String enter = scanner.nextLine();
		User2.live = scanner.nextLine();
		
		System.out.println("=============상태창============");
		// 코드 작성
		System.out.println("name : " + User2.name);
		System.out.println("age : " + User2.age);
		System.out.println("height : " + User2.height);
		System.out.println("weight : " + User2.weight);
		System.out.println("live : " + User2.live);
		
		System.out.println("==============================");

	}

}

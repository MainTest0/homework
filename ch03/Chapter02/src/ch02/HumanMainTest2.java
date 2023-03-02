package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {
		

		Human human = new Human();
		Scanner sc = new Scanner(System.in);
		// 스캐너를 활용해서 값을 할당
		System.out.println("키 : ");
		human.height = sc.nextInt();
		System.out.println("몸무게 : ");
		human.weight = sc.nextInt();
		System.out.println("성별 : ");
		human.isMan = sc.nextBoolean();
		sc.nextLine();
		System.out.println("이름 : ");
		human.name = sc.nextLine();
		
		int num = sc.nextInt();
		if(num == 0) {
			human.showInfo();
		}
		// showInfo() 메서드 호출해서 값을 확인해주세요
		
		// 심화 : 0번 입력시에 showinfo 호출
		// 스캐너를 통해서 showInfo() 메서드 호출 기능 만들어보기
		
	}// end of main

}// end of class

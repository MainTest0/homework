package ch01;

import java.util.Scanner;

public class WhileMainTest4 {

	// 메인 작업자(메인 쓰레드)
	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		
		// 상수값 만들어보기
//		final int USER_INPUT;
		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("정수 입력: ");
//		USER_INPUT = scanner.nextInt();
//		
//		while(num <= USER_INPUT) {
//			sum += num;
//			num ++;
//		}
//		System.out.println("더한값은" + sum);

		// 조건은 사용자가 0을 입력하면 프로그램을 종료하게 설계
		// 0이 아니라면 사용자가 입력한 값을 계속 덧셈해서 sum에 담아주세요
		// while문으로 코드를 작성해주세요

		while (num == 0) {
			System.out.println("정수 입력: ");
			num = scanner.nextInt();
			sum += num;
		}
		System.out.println("더한값은" + sum);

	} // end of main

} // end of class

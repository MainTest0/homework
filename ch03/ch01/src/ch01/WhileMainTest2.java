package ch01;

import java.util.Scanner;

public class WhileMainTest2 {

	// 메인 작업자(메인 쓰레드)
	public static void main(String[] args) {

		System.out.println("값을 입력해주세요 : ");
//		{
//			
//		} while(조건식);
// 사용자가 0을 입력하면 프로그램을 종료하는 프로그램을 만들어주세요.
		Scanner sc = new Scanner(System.in);
		int userInput = -1;

		int num = 1;
		int sum = 0;

		do {
			// 한번 코드를 수행하고
			// 다시 사용자 입력값을 받고싶다면
			userInput = sc.nextInt();
			sum += userInput;
			System.out.println("값을 입력해주세요");
			
			// 조건에 관계없이 한번은 수행되는 반복문

			System.out.println("연산된 결과값 : " + sum);
		} while (true);


//		while(true) {
//			System.out.print(".");
//			//예외처리 try catch문
//			// 작업자 힘드니까 1초 잠들어
//			//예외처리
//			try {
//				Thread.sleep(100);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		} //end of while

	} // end of main

} // end of class

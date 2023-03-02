package ch06;

import java.util.Scanner;

/*
 * 함수를 선언하는 코드 방법
 * 함수를 사용하는 코드 방법
 */

import ch05.MainTest1;

public class Lion {

	// 함수를 설계하는 코드 작성
	// 정수를 반환하는 함수
	static int addNumber(int n1, int n2) { // 시그니쳐
		
		
		// 함수 구현부 (body)

		int result; // 지역변수
		result = n1 + n2;

		return result;		
		// return 키워드를 만나면 실행의 제어권을 반납한다.
	}	// 텅빈, 리턴값이 없다
	
	// 아무 값도 반환하지 않는 함수 = void
	static void sayHello(String name) {
		System.out.println(name +" 반갑습니다 ~");
	}
	
	// 매개 변수가 없는 변수를 설계
	static int calcSum() {
		int sum = 0;
		int i;
	
		for(i=1; i<=100; i++) {
			sum+=i;
		}
		return sum;
	}
	
	// calcSum2 정수값 3개를 받아서 덧셈 연산 후 결과를 반환 하시오
	// return 타입은 double로 하시오
	
	
	static double calcSum2(int num1, int num2, int num3) {
		
		double result= num1 + num2 + num3;
		
		return result;
	}
	
	// calcSum3 정수값 1개 실수값 1개 논리형(boolean)1개를 받고 식을 만들어서
	// "정수값: "[] , "실수값: "[] , "논리값: " []  <------문자열로 연산하고
	// return 타입은 string으로 만들어주세요
	
	static String calcSum3(int n1, double n2, boolean n3) {
		
		String result = "정수값:"+n1+"\n실수값:"+n2+"\n논리값:"+n3;
		
		return result;
	}
	
	// 메인함수 코드의 시작점
	public static void main(String[] args) {
		// 함수 호출하기
		// 함수를 사용하는 코드
		
		int myNumber = addNumber(5, 10);
		
		System.out.println("myNumber : "+ myNumber);
		
		// int a = String  sayHello();
		
		// 함수 호출 2
		
		sayHello("에쉬");
		sayHello("티모");
		sayHello("바론");
		
		int calcResult = calcSum();
		System.out.println(calcResult);
		
		double result2 = calcSum2(1, 2, 3);
		System.out.println(result2);
		
		String result3 = calcSum3(154, 12.14, true);
		System.out.println(result3);
	}// end of main
	
	// 함수란?
	// 자바에서 객체와 상관없이 독립적으로 어떠한 기능을 수행하는 (일련의 코드 묶음)이다.
	
} // end of class

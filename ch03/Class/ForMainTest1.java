package ch03;

public class ForMainTest1 {

	public static void main(String[] args) {

		// 화면에 구구단 2단을 출력하시오.
		int num = 2;
		System.out.println(num + " X 1 = " + (num * 1));
		System.out.println(num + " X 2 = " + (num * 2));
		System.out.println(num + " X 3 = " + (num * 3));
		System.out.println(num + " X 4 = " + (num * 4));
		System.out.println(num + " X 5 = " + (num * 5));
		System.out.println(num + " X 6 = " + (num * 6));
		System.out.println(num + " X 7 = " + (num * 7));
		System.out.println(num + " X 8 = " + (num * 8));
		System.out.println(num + " X 9 = " + (num * 9));

		System.out.println("========================");

		// 화면에 구구단 3단을 출력하시오.
		num = 3;
		System.out.println(num + " X 1 = " + (num * 1));
		System.out.println(num + " X 2 = " + (num * 2));
		System.out.println(num + " X 3 = " + (num * 3));
		System.out.println(num + " X 4 = " + (num * 4));
		System.out.println(num + " X 5 = " + (num * 5));
		System.out.println(num + " X 6 = " + (num * 6));
		System.out.println(num + " X 7 = " + (num * 7));
		System.out.println(num + " X 8 = " + (num * 8));
		System.out.println(num + " X 9 = " + (num * 9));

		System.out.println("========================");

		// 구구단 4단을 출력하시오
		num = 4;
		System.out.println(num + " X 1 = " + (num * 1));
		System.out.println(num + " X 2 = " + (num * 2));
		System.out.println(num + " X 3 = " + (num * 3));
		System.out.println(num + " X 4 = " + (num * 4));
		System.out.println(num + " X 5 = " + (num * 5));
		System.out.println(num + " X 6 = " + (num * 6));
		System.out.println(num + " X 7 = " + (num * 7));
		System.out.println(num + " X 8 = " + (num * 8));
		System.out.println(num + " X 9 = " + (num * 9));

		System.out.println("========================");

		// 구구단 5단을 출력하시오.
//		for(초기화식; 조건식; 증감식) {
//
//		}
		num = 5;
		// i 변수에 유효 범위는? 0~9까지, scope범위?
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		} // end of for
		System.out.println("========================");
		
		// 문제 6단에서 9단까지 출력

		num = 6;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		} // end of for
		System.out.println("========================");
		num = 7;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		} // end of for
		System.out.println("========================");
		num = 8;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		} // end of for
		System.out.println("========================");
		num = 9;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		} // end of for
		
		for (int j = 6; j < 10; j++) {
			for(int i = 1; i < 10; i++) {
				System.out.println(j + " X " + i + " = " + (j * i));
			}
			if(j < 9) {
				System.out.println("========================");
			}
		}

	} // end of main

} // end of class

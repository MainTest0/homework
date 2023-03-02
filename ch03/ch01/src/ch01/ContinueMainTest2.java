package ch01;

import java.util.Scanner;

public class ContinueMainTest2 {

	public static void main(String[] args) {

		// 스캐너를 사용해서 사용자의 정수값을 입력받아서
		// 배수의 갯수를 출력하는 프로그램을 만들어보세요
		// 테스트 값은 1000 (3을 입력하면 1부터 1000 사이의 3 갯수)

		Scanner sc = new Scanner(System.in);

//		int cnt = 0;
//		int user;
//
//		System.out.println("배수 입력 : ");
//		user = sc.nextInt();
//
//		for (int i = 1; i < 1001; i++) {
//			if (i % user != 0) {
//				continue;
//			}
//			cnt ++;
//		}
//		System.out.println("갯수 : " + cnt);
		System.out.println("확인 할 값을 입력해주세요");
		final int MULTIPLE = sc.nextInt();
		System.out.println("몇까지 확인 하겠습니까?");
		final int MAX = sc.nextInt();

		int num = 0;
		int count = 0;

		for (num = 1; num <= MAX; num++) {
			// 만약 3에 배수이면 화면에 출력하지 마시오
			if (num % MULTIPLE == 0) {
				count++;
				continue;
			}
			//System.out.println("num : " +num);
		}
		System.out.println(MULTIPLE + "의 배수의 갯수는 " + count+"개 입니다.");

	}

}

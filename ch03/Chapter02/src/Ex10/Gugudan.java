package Ex10;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		// 시작값 종료값 받아서
		// 이중 for문으로 구구단을 출력
		// ex) 시작값이 5, 종료값이 8이면
		// 5*1, = 5 ~ 8*9=72 까지

		int userNum1;
		int userNum2;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.println("시작할 단수를 입력 해주세요");
		userNum1 = sc.nextInt();
		System.out.println("종료할 단수를 입력 해주세요");
		userNum2 = sc.nextInt();

		for (int i = userNum1; i <= userNum2; i++) {
			for (int j = 1; j < 10; j++) {
				result = i * j;
				System.out.println(i + "X" + j + "=" + result+" ");
			}
		}
		
	}
}

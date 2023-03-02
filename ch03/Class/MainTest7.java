package ch03;

// (에약어) import : 수입하다, 가져오다
// 자바 개발자들이 미리 만들어둠
import java.util.Scanner;

public class MainTest7 {
	// 메인 쓰레드
	public static void main(String[] args) {

		// 삼항 연산자
		// 조건식 ? 결과1 : 결과2
		
		int num = ( 5 > 3 ) ? 10 : 20;
		//System.out.println(num);
		
		int max = 0;
		System.out.println("입력 받은 두 수중 큰 수를 출력하시오.");
		
		// JDK에 만들어 둔 도구
		// 입력장치 : (키보드에 있는 어떠한 값을 받아 들여 주는 녀석)
		Scanner sc = new Scanner(System.in);
		System.out.println("입력1 : ");
		int x = sc.nextInt();		// 정수값만 받을 수 있는 녀석이다.
		System.out.println("x : " +x);
		
		System.out.println("입력2 : ");
		int y = sc.nextInt();
		
		System.out.println("=============================");
		// 여기까지 코드가 내려온다면 x값이 담겨있고, y값이 담겨있는 상태이다.
		
		// 삼항 연산자로 더 큰 값 출력하기
		int z = ( x > y ) ? x : y;
		System.out.println("입력 받은 두 수 중 큰 값은 "+z+"입니다");
		//System.out.println( (x > y) ? x : y );
		

	}// end of main

}// end of class

package ch06;

// Random이라는 클래스를 가져오다 -> LottoGame.java파일로
import java.util.Random;

public class LottoGame {

	// 함수를 만들 때 반드시 어떠한 기능을 만들지 정의하고 코드 작성해주세요
	// 랜덤 숫자 6개를 반환하는 기능을 만들어 보자

	static int randomNumber() {

		// 알고리즘을 설계한다.
		// JDK가 만들어준 도구를 이용해보자
		Random random = new Random();
		// 랜덤 값을 한개 생성해서 반환 -> 45
		// 0부터 시작한다. -> 0부터 44까지 반환 -> 46 -> 0~45
		//
		int resultNumber = random.nextInt(45) + 1;

		return resultNumber;
	}

	// 코드 실행 메인 함수
	public static void main(String[] args) {

		int r1 = randomNumber();
		int r2 = randomNumber();
		int r3 = randomNumber();
		int r4 = randomNumber();
		int r5 = randomNumber();
		int r6 = randomNumber();

		System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5 + " : " + r6);
		
		// ===========================================
		
		
		
		
	}// end of main

}// end of class

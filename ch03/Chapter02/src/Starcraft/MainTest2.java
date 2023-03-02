package Starcraft;

import java.util.Scanner;

public class MainTest2 {
	//메인함수
	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 4;
		Zealot zealot1 = new Zealot("질럿");
		Marine marine1 = new Marine("마린");
		Zergling zergling = new Zergling("저글링");
		
		Scanner sc = new Scanner(System.in);
		int unitChoise;
		do {
			System.out.println("유닛을 선택하세요 : ");
			System.out.println("1번은 질럿 \t 2번은 마린 \t 3번은 저글링\t 4번은 종료");		// \t : 이스케이프 문자 : tab간격만큼 띄어쓰기
			unitChoise = sc.nextInt();
		} while(unitChoise != GAME_END);
		
		System.out.println("게임이 종료되었습니다.");
		
		if(unitChoise == ZEALOT) {
			System.out.println("질럿을 선택하였습니다.");
		} else if(unitChoise == MARINE) {
			System.out.println("마린을 선택하였습니다.");
		
		}else if(unitChoise == ZERGLING) {
			System.out.println("저글링을 선택하였습니다.");
		}
		
		// 질럿
		// 업그레이드 기능
		// 쉴드기능
	
	} // end of main

} // end of class

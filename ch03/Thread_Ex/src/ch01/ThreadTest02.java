package ch01;

public class ThreadTest02 {

	// 메인 쓰레드
	public static void main(String[] args) {
		// 사용하는 방법 연습
		// 현재 쓰레드가 누구야 알아보는 명령어

		System.out.println("---------- 메인 쓰레드 시작 -----------");
		System.out.println(Thread.currentThread()); // Thread[main,5,main] --- 여기서 5는 실행 우선순위
		// 작업자 하나 만들어내기( 메인 쓰레드가 할 일 )
		Worker worker1 = new Worker("워커1");
		// 너가 위임 받은 일을 시작해 -> start();명령어

		worker1.start(); // 멀티 쓰레드
		// 0.2초 동안 50번 for문 반복해야되는게 더 오래걸리니까 밑에 sysout 먼저 실행 시킨다음 반복문시작함

		// 쓰레드 하나더 생성해보기
		Worker worker2 = new Worker("워커2");
		worker2.start();

		System.out.println("---------- 메인 쓰레드 종료 -----------");
	}// end of main
}// end of class



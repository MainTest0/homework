package ch01;

import javax.swing.JFrame;

// 생성 방법, 사용방법을 이미 학습했다.
// 만약 코드가 JFrame을 상속받았다면 자바는 단일 상속을 지원하기 때문에
// 다중 상속을 할 수 없다. 그래서 interface인 Runnable 구현 방법을 알아야 한다.


public class RunnableTest1 {

	public static void main(String[] args) {

		// -----사용 방법
		
		System.out.println("main thread 시작");
		Subwalk subwalk = new Subwalk();
		//	subwalk.start();		<-- 현재 start 메서드가 없다 
		// why? subwalk는 runnable기능을 구현한거지 Thread 클래스를 상속받은건 아니다.
		// 그래서 thread기능인 start메서드가 없는 상태이다.
		
		// 해결법
		// start라는 녀석은 Thread가 가지고있다.
		// Thread도 일반 클래스이다.
		// Thread를 생성할 때 생성자에 Runnable타입을 넣을 수 있다.
		// -문서 or 코드 힌트를 통해서 알 수 있다.

		Thread t= new Thread(subwalk);
		
		// 시작 시점은 이벤트를 받든지 연산 후에 하든지 여러분들이 실행 시킬 수 있다.
		t.start();
		
	}// end of main
}// end of class

// -----설계방법
class Subwalk extends JFrame implements Runnable{

	
	// 나중에 쓰레드가 동작해야 하는 부분을 run안에서 작성함
	@Override
	public void run() {
		for(int i = 0; i < 200; i++) {
			System.out.println("i : "+i+"\n");
		}
		
	}
	
}
package ch01;

import javax.swing.JFrame;

public class MyGameFrame extends JFrame {

	public MyGameFrame() {
		// 익명클래스 + 메서드 체이닝 방식 코드 - 자주 쓰이는 방식
		new Thread(this.runnable).start();
	}
	
	
	// 클래스 문법
	// 변수, 생성자, 메서드들을 적었었다.
	// (식은 사용할 수 없다. ex) for문 등)

	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			// 여기 따로 작업하고자 하는 상황을 지시
			for (int i = 0; i < 30; i++) {
				System.out.print("=");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} // end of for

		}// end of run
	}; // end of runnable

	// 메인 작업자가 일하는 곳
	public static void main(String[] args) {
		MyGameFrame gameFrame = new MyGameFrame();
		//Thread thread = new Thread(gameFrame.runnable);
		//thread.start();
		//gameFrame.runnable.run();
		for(int i = 0; i < 100; i++) {
			System.out.println("i : " + i);
		}
	}

}

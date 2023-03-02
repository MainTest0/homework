package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame() {
		super.setTitle("MyFrame01");
		// width, height 가로크기, 세로크기
		super.setSize(200, 800);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//창을 닫았을 때 이클립스에서도 꺼지게함
	}
	// 코드 테스트
	public static void main(String[] args) {
		new MyFrame();
		// GUI 관련 프로그램 학습시에 배치 관리자 먼저 명확히 이해하는 것이 좋다.
		// 레이아웃 -> Button을 어디에 배치할지 설정하는 것을 레이아웃을 잡는다라고 한다.
	}
	
	
	
}

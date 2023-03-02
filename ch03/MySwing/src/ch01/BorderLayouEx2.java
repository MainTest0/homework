package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayouEx2 extends JFrame {

	// BorderLayout <= 컴포넌트들을 동 서 남 북 센터로 배치
	// 변수 선언과 동시에 초기화
	String [] direction= {BorderLayout.EAST, BorderLayout.WEST,BorderLayout.SOUTH,BorderLayout.NORTH};
	
	JButton buttons[] = new JButton[5];

	public BorderLayouEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("BorderLayout 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(direction[i]);
		}
	}

	private void setInitLayout() {
		// setLayout(new BorderLayout()); // 기본 레이아웃은 BorderLayout이다
		// BorderLayout은 매개변수 값 하나를 더 추가 시킬 수 있다. (방향 지정 가능)
		
		
		for(int i = 0; i < buttons.length; i++) {
			add(buttons[i], direction[i]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayouEx2();
	}
}

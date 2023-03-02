package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayOutEx3 extends JFrame{

	// 멤버 변수를 선언할 수 있는가
		// 배열을 활용할 수 있는가
		// 생성자 + 메서드를 호출 
		// for문 활용할 수 있는가?
		// GUI 프로그램 익숙해지기 !!!
	
	private JButton button[] = new JButton[8];
	
	public FlowLayOutEx3() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("제목");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < button.length; i++) {
			button[i] = new JButton("버튼"+(i+1));
		}
	}
	
	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.RIGHT,50,200));
		for(int i = 0; i < button.length; i++) {
			add(button[i]);
		}
	}
	public static void main(String[] args) {
		new FlowLayOutEx3();
	}
	
}

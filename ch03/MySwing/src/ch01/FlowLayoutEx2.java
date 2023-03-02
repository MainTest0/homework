package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame{
	
	// 1단계 JButton 2개 생성
	// 배치 관리자 FlowLayout 멤버 변수로 선언
	// 화면에 컴포넌트를 그려주세요
	
	// 멤버 변수를 선언할 수 있는가
	// 배열을 활용할 수 있는가
	// 생성자 + 메서드를 호출 
	// for문 활용할 수 있는가?
	// GUI 프로그램 익숙해지기 !!!
	
	
	// 배열로 선언
	private JButton button1;
	private JButton button2;
	
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private FlowLayout flowLayout;
	
	public FlowLayoutEx2() {

		initData();
		setInitLayout();
		
	}
	
	private void initData() {
		setTitle("TItle");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// for문
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		flowLayout = new FlowLayout(FlowLayout.RIGHT,20,20);
		
	}
	
	private void setInitLayout() {
		setLayout(flowLayout);
		
		add(button1);
		add(button2);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}

}

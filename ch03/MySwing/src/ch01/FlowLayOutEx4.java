package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayOutEx4 extends JFrame{
	
	// 멤버 변수 선언 
	private JButton[] button = new JButton[8];
	
	// 생성자는 메모리에 올라갈 때 처음 실행되는 코드
	// 구현부 안에서 순서도 중요합니다!!
	public FlowLayOutEx4() {
		initData();
		setInitLayout();		
	}
	
	private void initData() {
		setTitle("제목");
		setSize(500,500);
		//static 변수나 static 함수는 클래스 이름으로도 접근이 가능하다!!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < button.length; i++) {
			button[i] = new JButton("버튼"+(i+1));
		}
		
	}

	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.RIGHT,50,50));
		for(int i = 0; i < button.length; i++) {
			// 방어적 코드 작성 염두!!
			add(button[i]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayOutEx4();
	}
	
}

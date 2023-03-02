package ch03;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 외부 클래스 - outer class
public class MyFrame1 extends JFrame {
	/*
	 * 학습목표 내부클래스, 외부 클래스의 개념
	 */

	MyDrawPanel drawPanel; // 멤버변수 선언

	// 내부 클래스 사용 - inner class
	// 내부 클레스에는 - 정적 클래스 인스턴스 클래스로 나눌 수 있음
	// 정적 클래스 -satitic이 붙음. <-- new하지 않더라도 접근가능, 클래스 이름으로 접근가능
	// 인스턴스 클래스 - new 해야 접근가능 <== 외부 클래스가 먼저 생성된 후 내부 클래스가 생성되어야 한다.
	// 상속의 개념 (클래스화 시킴)
	class MyDrawPanel extends JPanel {

		// paints -> x
		// print -> x
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(100, 100, 100, 200);
			g.drawRect(100, 50, 50, 50);
			g.drawString("반가워", 300, 300);
			g.drawLine(250, 300, 600, 600);
			g.drawOval(300, 300, 50, 50);
		}
	}

	public MyFrame1() {
		initData();
		setInitLayout();
	}

	private void initData() {

		setTitle("내부 클래스판");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();

	}

	private void setInitLayout() {

		add(drawPanel);

		setVisible(true);

	}

} // end of class

package ch03;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {

	// 내부 클래스를 활용해서
	// JPanel로 상속 받고 paint 메서드로
	// 집 그림을 그려주세요
	// 카페 -> 결과 사진까지

	MyDrawPanel drawPanel;

	class MyDrawPanel extends JPanel {

		public void paint(Graphics g) {
			super.paint(g);
			// 집
			g.drawRect(300, 300, 400, 300);
			// 지붕
			g.drawLine(300, 300, 500, 50);
			g.drawLine(700, 300, 500, 50);
			// 창문
			g.drawRect(400, 350, 100, 100);
			g.drawLine(450, 450, 450, 350);
			g.drawLine(400, 400, 500, 400);
			// 문
			g.drawRect(550, 400, 100, 200);
			// 손잡이
			g.drawOval(560, 500, 10, 10);
			// 굴뚝
			g.drawLine(650, 100, 650, 235);
			g.drawLine(600, 100, 650, 100);
			g.drawLine(600, 100, 600, 175);
			// 발자국
			g.drawString("🐾", 480, 480);
			g.drawString("🐾", 460, 500);
			g.drawString("🐾", 480, 520);
			g.drawString("🐾", 460, 540);
			g.drawString("🐾", 480, 560);
			g.drawString("🐾", 460, 580);

			g.drawOval(60, 300, 100, 100);
			g.drawString("BUS", 80, 330);
			g.drawLine(100, 400, 100, 600);
			g.drawLine(110, 400, 110, 600);
		}
	}

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {

		setTitle("집 그리기");
		setSize(900, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();

	}

	private void setInitLayout() {

		add(drawPanel);

		setVisible(true);

	}

	public static void main(String[] args) {
		new MyFrame2();
	}

} // end of class

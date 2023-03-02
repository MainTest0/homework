package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Swing 이미지를 다루는 방법은 3가지 정도.
// JLable <-- String, image ()

public class MyImageFrame2 extends JFrame {

	imagePanel imagePanel; // 내부 클래스를 멤버 변수로 선언(선언만 하고 초기화하지는 않음)

	// JPanel 안에 이미지를 넣는 방법
	// 내부 클래스 이용해보기
	class imagePanel extends JPanel {

		private Image image;
		private Image image1;
		private Image image2;
		private Image image3;
		private Image image4;
		private Image image5;

		public imagePanel() {
			image = new ImageIcon("image3.png").getImage();
			image1 = new ImageIcon("image5.png").getImage();
			image2 = new ImageIcon("image6.png").getImage();
			image3 = new ImageIcon("image7.png").getImage();
			image4 = new ImageIcon("image8.png").getImage();
			image5 = new ImageIcon("image9.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 대상 지정
			// x좌표 y좌표
			// 가로길이 세로길이
			g.drawImage(image, 0, 0, 100, 100, null);
			g.drawImage(image1, 100, 100, 100, 100, null);
			g.drawImage(image2, 200, 200, 100, 100, null);
			g.drawImage(image3, 300, 300, 100, 100, null);
			g.drawImage(image4, 400, 400, 100, 100, null);
			g.drawImage(image5, 500, 500, 100, 100, null);
		}

	}// end of inner class

	public MyImageFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 연습");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new imagePanel();

	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}

}

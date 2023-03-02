package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Swing 이미지를 다루는 방법은 3가지 정도.
// JLable <-- String, image ()

public class MyImageFrame extends JFrame {

	public MyImageFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}

	private ImagePanel imagePanel;

	static class ImagePanel extends JPanel {

		private Image image;

		public ImagePanel() {
			image = new ImageIcon("images/image3.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 100, 100, 100, 100, null);
		}

	}// end of inner class
}

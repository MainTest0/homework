package TestPackage;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingImageTest extends JFrame {

	imagePanel imagePanel;

	class imagePanel extends JPanel {

		private Image image;
		private Image image1;
		private Image image2;
		private Image image3;
		private Image image4;

		public imagePanel() {

			image = new ImageIcon("image3.png").getImage();
			image1 = new ImageIcon("image5.png").getImage();
			image2 = new ImageIcon("image6.png").getImage();
			image3 = new ImageIcon("image7.png").getImage();
			image4 = new ImageIcon("image8.png").getImage();

		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 0, 0, 100, 100, null);
			g.drawImage(image1, 100, 100, 100, 100, null);
			g.drawImage(image2, 200, 200, 100, 100, null);
			g.drawImage(image3, 300, 300, 100, 100, null);
			g.drawImage(image4, 400, 400, 100, 100, null);

		}

	}

	public SwingImageTest() {

		initData();
		setInitLayout();

	}

	private void initData() {
		setTitle("Swing Image Test");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new imagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingImageTest();
	}
}

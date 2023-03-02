package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame extends JFrame {

	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MoveLabelFrame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		labelText = new JLabel("Hello World~~");
		labelText.setSize(100, 100);
		// 초기값 세팅
		labelTextX = 300;
		labelTextY = 350;

	}

	private void setInitLayout() {

		setLayout(null);
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);

		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// System.out.println("1");
				// e.getKeyCode();
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					// 현재 이벤트가 일어난 시점에 X,Y 좌표값을 확인
//					int currentX = labelText.getX();
//					int currentY = labelText.getY();
					if (labelTextX < 700) {
						int x = labelTextX += 50;
						int y = labelTextY;
						labelText.setLocation(x, y);
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (labelTextX > 0) {
						int x = labelTextX -= 50;
						int y = labelTextY;
						labelText.setLocation(x, y);
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					if (labelTextY > -50) {
						int x = labelTextX;
						int y = labelTextY -= 50;
						labelText.setLocation(x, y);
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					if (labelTextY < 700) {
						int x = labelTextX;
						int y = labelTextY += 50;
						labelText.setLocation(x, y);
					}
				}

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

}

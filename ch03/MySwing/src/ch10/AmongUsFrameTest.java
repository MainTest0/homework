package ch10;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ch10.AmongUsFrame.CustomPanel;

public class AmongUsFrameTest extends JFrame implements KeyListener {

	// 준비물
	// 배경이미지를 그려주는 녀석
	// Buffer라는것은 바구니라고 생각하기(버퍼링)
	BufferedImage backgroundMap;
	BufferedImage pinkImage1;
	BufferedImage greyImage1;
	BufferedImage boom;
	BufferedImage knife;
	boolean keySpace = false;

	// 어몽어스 캐릭터 이미지 우리팀 1개
	// 어몽어스 캐릭터 이미지 적팀 1개
	// 패널 하나 생성해서 사이즈 지정할 수 있도록 설계
	// JPanel 상속 받을건데 inner 클래스로 만들거임
	CustomPanel customPanel;

	int pinkX = 200;
	int pinkY = 200;
	int greyX = -20;
	int greyY = 400;
	int knifeX;
	int knifeY;

	public AmongUsFrameTest() {
		initData();
		setInitLayout();
		addEventListener();
//		Thread thread = new Thread(customPanel);
//		thread.start();
		new Thread(customPanel).start(); // 위 코드 2줄이랑 같은 말임
	}

	// 좌표가 같아지면 충돌났습니다 띄우고 이미지 없애기
	// 걷는 이미지 구현해보기

	private void initData() {
		setTitle("미니 어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		// 이미지 3개 있음, 커스텀 패널 있음
		try {
			backgroundMap = ImageIO.read(new File("images/image_AmongUs.png"));
			greyImage1 = ImageIO.read(new File("images/black_image.png"));
			pinkImage1 = ImageIO.read(new File("images/pink_image.png"));
			boom = ImageIO.read(new File("images/boom.png"));
			knife = ImageIO.read(new File("images/knife.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		}
		customPanel = new CustomPanel();
	}

	private void setInitLayout() {
		add(customPanel);

		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(this);
	}

	class CustomPanel extends JPanel implements Runnable { // inner class

//		boolean isRight = true;

		public void knife() {
			AmongUsFrameTest amongUsFrameTest = new AmongUsFrameTest();
			amongUsFrameTest.keyPressed(null);
			
		}

		
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(pinkImage1, pinkX, pinkY, 100, 100, null);
			g.drawImage(greyImage1, greyX, greyY, 100, 100, null);
		}

		@Override
		public void run() {
			boolean isRight = true;
			while (true) {

				if (isRight == true) {
					greyX += 10;
				} else {
					greyX -= 10;
				}
				// 방향 체크
				if (greyX > 500) {
					isRight = false;
				} else if (greyX < 0) {
					isRight = true;
				}

				if (greyX == pinkX && greyY == pinkY) {
					greyImage1 = boom;
					break;
				}
				

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				repaint();
			} // end of while

		}

	}// end of inner class

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println("keyCode: " + keyCode);
		if (keyCode == KeyEvent.VK_LEFT) {
			// 왼쪽
			pinkX = (pinkX < 0) ? -20 : pinkX - 10;
			// pinkX -= 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			// 오른쪽
			pinkX = (pinkX > 500) ? +510 : pinkX + 10;
		} else if (keyCode == KeyEvent.VK_UP) {
			// 위
			pinkY = (pinkY < 0) ? -5 : pinkY - 10;
			//pinkY -= 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			// 아래
			pinkY = (pinkY > 500) ? +500 : pinkY + 10;
			//pinkY += 10;
		}
	
		// 그림을 다시 그려주다 실행
		repaint();
	}

	
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}// end of outer class

package Ex01;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap); // 찾아보기
		setSize(1000, 640);
		
		player = new Player();
	}

	private void setInitLayout() {
		setLayout(null); // 좌표기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
		add(player);

		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				// switch<- 검색해서 직접 해보기
				switch(e.getKeyCode()) {			// 조건식 넣음
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				}
			}
			
		});
		
	}

	public static void main(String[] args) {
		
		new BubbleFrame();

	}// end of main

}// end of class

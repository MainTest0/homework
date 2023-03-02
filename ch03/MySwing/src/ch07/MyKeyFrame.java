package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyFrame extends JFrame{
	
	// 1번 구현 처리
	// 2번 익명 클래스
	
	private JTextArea area = new JTextArea();

	public MyKeyFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		// TODO Auto-generated method stub
		
	}

	private void setInitLayout() {
		// TODO Auto-generated method stub
		
	}

	private void addEventListener() {
		KeyListener key;
		
		area.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(e.getKeyCode());
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	
}

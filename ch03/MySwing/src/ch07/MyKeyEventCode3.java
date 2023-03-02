package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyKeyEventCode3 extends JFrame {

	private JTextArea area;
	
	// 구현 클래스를 keyListener라고 이름 붙였다.
	private KeyListener keyListener = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
					}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	};

	public MyKeyEventCode3() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // setSize(프레임 사이즈 조절 불가 설정)
		area = new JTextArea();
	}

	private void setInitLayout() {
		add(area);
		setVisible(true);
	}

	private void addEventListener() {
		// 익명 구현 클래스라는 개념을 잡아보자
		// 익명 구현 클래스는 어떤 의미일까?
		// 이름이없다. 익명 구현 클래스 보면
		// MyKeyEvent();, MyKeyEvent();, MyKeyEvent();
		// 위에서 2번째 녀석을 부르는 것이 애매한 것처럼 이름을 붙여주려면
		// MyKey MyKeyEvent = new MyKey(); 이런식으로 이름을 붙여줬었다.
		KeyListener keyListener;
		//인터페이스는 기본적으로 new 할 수 없다.
		// 하지만 인터페이스를 구현 클래스로 변형해서 사용할 수 있다.
		// new KeyListener 자동 완성하면 메서드들이 생긴다.( 이런걸 익명 구현클래스라고 함)
		
		// 인터페이스 + 추상 클래스를 구현 클래스로 만들 수 있다.
		
		area.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
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

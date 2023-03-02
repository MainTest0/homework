package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyKeyEventCode extends JFrame implements KeyListener {

	private JTextArea area;

	public MyKeyEventCode() {
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
		// KeyListener keyListener;
		area.addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent e) { // keyTyped는 문자열만 반응한다.
		System.out.println("KeyTyped : " + e.toString());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("KeyPressed : " + e.toString());
		// 제어문을 활용해서 화살표 방향키 위 가 눌러 졌으면 콘솔에 up이라는 문자열을 출력
		// 왼쪽, 오른쪽, 아래도 출력
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			area.append("방향키 위\n");
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append("방향키 아래\n");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append("방향키 왼쪽\n");
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append("방향키 오른쪽\n");
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// System.out.println("KeyReleased : " +e.toString());

	}

}

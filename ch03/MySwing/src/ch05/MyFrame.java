package ch05;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	// 그림 위에 그림 올리기
	// JLabel 이용해서 이미지 겹치는 방법

	private JLabel backgroundMap;
	private JLabel player;

	public MyFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 겹치기 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("images/background2.png");
		// new ImageIcon("images/background2.png"); 위 코드랑 같은 코드
		backgroundMap = new JLabel(icon);
		backgroundMap.setSize(500, 500);
		// null -> 좌표기반인데 size와 위치를 설정해야 화면에 정확히 표현된다.
		player = new JLabel(new ImageIcon("images/background1.png"));
		player.setSize(500, 500);
	}

	private void setInitLayout() {
		backgroundMap.setLocation(0, 0);
		player.setLocation(200, 200);
		add(player);
		add(backgroundMap);
		setLayout(null); // 좌표기반

		setVisible(true);
	}

}

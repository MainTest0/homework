package ch07;

import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame2 extends JFrame {

	private JLabel player;
	private int x = 200;
	private int y = 200;

	public MoveLabelFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Icon icon = new ImageIcon("images/image3.png");
		player = new JLabel(icon);

		player.setSize(300, 300);

	}

	private void setInitLayout() {
		player.setLocation(x, y);
		add(player);
		setLayout(null);

		setVisible(true);
	}

	private void addEventListener() {

	}

}

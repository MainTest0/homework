package TestPackage;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {

	JButton[] buttons = new JButton[5];

	String[] titles = { "동", "서", "남", "북", "센터" };

	String[] direction = { BorderLayout.EAST, BorderLayout.WEST, 
			BorderLayout.SOUTH, BorderLayout.NORTH,BorderLayout.CENTER };

	public BorderLayoutTest() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("BorderLayoutTest");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < direction.length; i++) {
			buttons[i] = new JButton(titles[i]);
		}
	}

	private void setInitLayout() {

		for (int i = 0; i < direction.length; i++) {
			add(buttons[i], direction[i]);
		}

		setVisible(true);

	}

	public static void main(String[] args) {
		new BorderLayoutTest();
	}

}

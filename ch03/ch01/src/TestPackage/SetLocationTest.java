package TestPackage;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SetLocationTest extends JFrame {

	JButton[] button = new JButton[3];
	private int buttonLocation = 100;

	public SetLocationTest() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("SetLocationTest");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("" + (i + 1));
		}
	}

	private void setInitLayout() {
		setLayout(null);
		button[0].setLocation(100, 100);
		button[1].setLocation(200, 200);
		button[2].setLocation(300, 300);

		for (int i = 0; i < button.length; i++) {
			add(button[i]);
			button[i].setSize(50, 50);
			button[i].setLocation(buttonLocation + (i * 100), buttonLocation + (i * 100));
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new SetLocationTest();
	}
}

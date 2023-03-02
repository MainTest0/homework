package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {

//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
//	private JButton button7;
//	private JButton button8;
//	private JButton button9;

	private JButton[] button = new JButton[9];
	private final int POSITION = 100;

	public NoLayoutEx2() {

		initData();
		setInitLayout();

	}

	private void initData() {

		setTitle("NoLayoutEx2");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("버튼" + (i + 1));
			button[i].setSize(100, 100);
		}

//		button1 = new JButton("버튼1");
//		button1.setSize(100, 100);
//		button2 = new JButton("버튼2");
//		button2.setSize(100, 100);
//		button3 = new JButton("버튼3");
//		button3.setSize(100, 100);
//		button4 = new JButton("버튼4");
//		button4.setSize(100, 100);
//		button5 = new JButton("버튼5");
//		button5.setSize(100, 100);
//		button6 = new JButton("버튼6");
//		button6.setSize(100, 100);
//		button7 = new JButton("버튼7");
//		button7.setSize(100, 100);
//		button8 = new JButton("버튼8");
//		button8.setSize(100, 100);
//		button9 = new JButton("버튼9");
//		button9.setSize(100, 100);

	}

	private void setInitLayout() {
		setLayout(null);
		setVisible(true);

		for (int i = 0; i < button.length - 1; i++) {
			button[i].setLocation(POSITION + 100, POSITION + POSITION + 100);
		}

//		button1.setLocation(200, 300);
//		add(button1);
//		button2.setLocation(300, 400);
//		add(button2);
//		button3.setLocation(400, 500);
//		add(button3);
//		button4.setLocation(500, 400);
//		add(button4);
//		button5.setLocation(600, 300);
//		add(button5);
//		button6.setLocation(500, 200);
//		add(button6);
//		button7.setLocation(400, 100);
//		add(button7);
//		button8.setLocation(300, 200);
//		add(button8);
//		button9.setLocation(400, 300);
//		add(button9);

	}

	public static void main(String[] args) {
		new NoLayoutEx2();
	}

}

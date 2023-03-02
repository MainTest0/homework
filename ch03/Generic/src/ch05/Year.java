package ch05;

import java.awt.Font;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Year extends JFrame {

	private JLabel text;
	private int user;

	public Year() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		text = new JLabel();

	}

	private void setInitLayout() {

		add(text);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		Font font = new Font("궁서체", Font.BOLD, 300);
		g.setFont(font);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		user = sc.nextInt();
		
		if (user % 4 == 0 && user % 100 == 0 || user % 400 == 0) {
			text.setText(user+"년은 윤년입니다.");
		} else if (user % 4 == 0 && user % 100 == 0) {
			text.setText(user+"년은 윤년이 아닙니다.");
		} else if (user % 4 == 0) {
			text.setText(user+"년은 윤년입니다.");
		} else {
			text.setText(user+"년은 윤년이 아닙니다.");
		}
		
		super.paint(g);
	}

	private void addEventListener() {
		
	}

	public static void main(String[] args) {

		new Year();

	}
}

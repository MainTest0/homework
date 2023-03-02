package ch02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents  extends JFrame{
	
	private JButton button;
	private JLabel label;			// 글자를 넣어서 화면에 띄울 수 있다.
	private JTextField field;
	private JPasswordField passwordField;
	private JCheckBox checkbox;
	

	public MyComponents() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("컴포넌트 확인");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("JButton");
		label = new JLabel("글자를 적는 컴포넌트");
		field = new JTextField("아이디 입력", 20);		//20글자까지 받을 수 있다
		passwordField = new JPasswordField("비번입력", 10);
		checkbox = new JCheckBox("동의");
		
	}

	private void setInitLayout() {
		
		setLayout(new FlowLayout());
		setVisible(true);
		
		add(button);
		add(label);
		add(field);
		add(passwordField);
		add(checkbox);
		
	}
	public static void main(String[] args) {
		new MyComponents();
	}
}

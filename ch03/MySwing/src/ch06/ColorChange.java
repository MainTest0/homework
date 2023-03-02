package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange extends JFrame implements ActionListener {
	// 버튼 누르면 배경색 바뀌는 코드

	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;

	public ColorChange() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button1 = new JButton("click1");
		button2 = new JButton("click2");
		button3 = new JButton("click3");
		button4 = new JButton("click4");
		button5 = new JButton("click5");
	}

	private void setInitLayout() {
		// Frame의 레이아웃은 borderLayout (기본값이 보더레이아웃임)
		add(panel);
		panel.setBackground(Color.yellow);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
	
		setVisible(true);
	}

	private void addEventListener() {
		// this는 ColorChange고 다형성이 적용되는 녀석이기 때문에 ActionListener 타입으로 바라볼 수 있다.
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}

	// 테스트 코드
	public static void main(String[] args) {
		new ColorChange();

	}// end of main

	// 약속 되어진 메서드
	// 이벤트가 일어나면 운영체제가 actionPerformed 메서드를 호출 시켜 준다.
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() -> Object
		// 다음 캐스팅 버튼으로 코드 작성
		JButton targetButton = (JButton) e.getSource();
		//targetButton.setText("눌러진 버튼입니다.");
		System.out.println(targetButton.getText());

//		System.out.println(e.getSource());
//		System.out.println(e.getID());
//		System.out.println("호출됨");
//		panel.setBackground(Color.gray);
//		System.out.println(e.toString());
//		if(e.getSource() == this.button1) {
//			panel.setBackground(Color.gray);
//		} else
//			panel.setBackground(Color.yellow);
		
		// 문제 1.
		// 문자열을 비교해서 색상을 변경시키는 코드를 작성 해주세요.
//		if(targetButton.getText().equals(this.button1.getText()) ) {
//			panel.setBackground(Color.BLUE);
//		} else {
//			panel.setBackground(Color.DARK_GRAY);
//		}
		
		// 문제 2.
		if(targetButton.getText().equals(this.button1.getText()) ) {
			panel.setBackground(Color.red);
		} else if(e.getSource() == this.button2) {
			panel.setBackground(Color.orange);
		}else if(e.getSource() == this.button3) {
			panel.setBackground(Color.yellow);
		}else if(e.getSource() == this.button4) {
			panel.setBackground(Color.green);
		}else if(e.getSource() == this.button5) {
			panel.setBackground(Color.pink);
		}
			
		
	}
	
	
	
	// 문제 2.
	// 아래 버튼을 누르면 위의 배경색을 변경하는 코드를 작성 해주세요.
	// 이미지를 활용도 해보기
	

} // end of class

package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFlowLayout extends JFrame{
	
	private JButton[] button = new JButton[8];
	
	public TestFlowLayout() {

		initData();
		setInitData();
		
	}

	private void initData() {

		setTitle("제목");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < button.length; i++) {
			button[i] = new JButton("버튼"+(i+1));
		}
		
	}
	
	private void setInitData() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
		for(int i = 0; i < button.length; i++) {
			add(button[i]);
		}

		setVisible(true);
		
	}

	public static void main(String[] args) {

		new TestFlowLayout();

	}

}

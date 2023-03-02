package ch07;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventListener1 extends JFrame{

	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MouseEventListener1() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		labelText = new JLabel("Hello World~~");
		labelText.setSize(100, 100);
		// 초기값 세팅
		labelTextX = 300;
		labelTextY = 350;

	}

	private void setInitLayout() {

		setLayout(null);
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);

		setVisible(true);
	}

	private void addEventListener() {
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				labelText.setLocation(e.getY(), e.getX());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

	}
	
}

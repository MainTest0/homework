package ex01;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame{
	LottoRandomNumber lottoRandomNumber;
	JButton button;
	
	boolean isStart = false;
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("로또 번호");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Game Start");
		lottoRandomNumber = new LottoRandomNumber();
	}

	private void setInitLayout() {
		add(button, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 그림을 그릴 때 2가지 구분) 처음, 버튼 누름
		if(isStart == false) {
			g.drawString("게임을 실행 해주세요", 150, 150);
			return;
		}
		
		int[] getNumbers = lottoRandomNumber.createNumber();		// 코드 이해하기
		
		for(int i = 0, x = 50; i < getNumbers.length; i++, x+=100) {
			g.drawString(getNumbers[i]+"", x, 200);
		}
	}
	
	private void addEventListener() {
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// event를 누르면 그림을 다시 그려라
				// isStart 변수가 항상 false이기때문에 
				isStart=true;
				repaint();
				
			}
		});
		
	}
	
	
	
}

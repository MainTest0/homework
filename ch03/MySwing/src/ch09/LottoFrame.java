package ch09;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 화면을 집중적으로 담당하는 기능 구현
//LottoRandomNumber 클래스에 받아서 처리
public class LottoFrame extends JFrame {
	LottoRandomNumber lottoRandomNumber;

	JButton button;
	boolean isStart = false;

	public LottoFrame() {
		initData();
		setInitData();
		addEventListener();
	}

	private void initData() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("로또 번호 추출");
		lottoRandomNumber = new LottoRandomNumber();

	}

	private void setInitData() {
		add(button, BorderLayout.SOUTH);

		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		if (isStart == false) {
			g.drawString("로또 번호를 클릭하세요", 200, 200);
			return;
		}
		int[] getNumber = lottoRandomNumber.getLottoNumbers();
		for (int i = 0, x = 50; i < getNumber.length; i++, x += 100) {
			g.drawString(getNumber[i] + "", x, 200);
		}

	}

	private void addEventListener() {

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				isStart = true;
				repaint();
			}
		});

	}
}

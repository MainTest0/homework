package TestPackage;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoGUITest extends JFrame implements ActionListener {
	Random r = new Random();
	int[] lottoNum = new int[6];
	JButton button;
	boolean isStart = false;

	public LottoGUITest() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("로또 번호 추출");

	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);

		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		isStart = true;
		lottoNum = getNumber();
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font f = new Font("굴림", Font.BOLD, 30);
		g.setFont(f);
		int x = 50;
		if (isStart == false) {
			g.drawString("로또 번호 추첨", 200, 250);
			return;
		}
		for (int i = 0; i < lottoNum.length; i++, x += 100) {
			g.drawString(lottoNum[i] + "", x, 200);
		}
	}

	public int[] getNumber() {
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(lottoNum);
		return lottoNum;
	}

	public static void main(String[] args) {
		new LottoGUITest();
	}
}

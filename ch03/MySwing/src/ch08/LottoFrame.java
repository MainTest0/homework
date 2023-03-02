package ch08;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

// 위에 버튼
// 밑에 여섯개의 난수 발생해서 직접 그려진 그림을 그리기(1~45)
// 셔플기능으로도 구현가능
// 1 ~ 45까지 미리 만들어서 섞은다음 맨앞부터 변수에 넣는 방법

public class LottoFrame extends JFrame implements ActionListener {

	int[] lotto = new int[6];
	int x = 50;
	JButton button;

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Lotton Start");

	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);

		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this); // addActionListener 버튼 눌렀을 때 동작

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임 시작");
		lotto = getLottoNumber();

		repaint(); // 그림을 다시 그리는 코드

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// g.setColor(Color.black); 옛날코드라 확인 필요

		Font f = new Font("궁서체", Font.BOLD, 20);
		g.setFont(f);

		if (lotto[0] == 0) { // 게임한번도 안돌린 초기상태
			g.drawString("로또 번호를 클릭하세요", 200, 200);
			return;
		}
		// 코드가 여기 내려오면 버튼을 눌렀다와 같은 의미 이다.
		// 그럼 메서드의 멤버 변수를 활용해서 그림을 그릴 수 있다.
//		g.drawString(lotto[0]+"", 50, 200); 		// <--여기서 오류 나는 이유는 뭘까? lotto는 int 인데 g.drawString은 문자열이라서 +""붙여주면 됨
//		g.drawString(lotto[1]+"", 150, 200);
//		g.drawString(lotto[2]+"", 250, 200);
//		g.drawString(lotto[3]+"", 350, 200);
//		g.drawString(lotto[4]+"", 450, 200);
//		g.drawString(lotto[5]+"", 550, 200);

		for (int i = 0, x = 50; i < lotto.length; i++, x+=100) {		// 이런 방법은 안쓰는거 권유
				g.drawString(lotto[i] + "", x, 200);
			
		}
	}

	public int[] getLottoNumber() {
		//int[] lotto = new int[6];
		Random r = new Random();

		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			// 중복 값 확인을 위해 다시 반복문을 생성
			for (int e = 0; e < i; e++) {
				// 조건
				if (lotto[i] == lotto[e]) {
					// 중복 발생
					i -= 1;
					break;
				}
			}
		}
		// 오름차순으로 정렬
		Arrays.sort(lotto); // 배열을 정렬해주는 기능
		return lotto;
	}

	// Test Code
	public static void main(String[] args) {
		new LottoFrame();
//		a.getLottoNumber();
//		// a.getLottoNumber()[i]
//		// lotto[0]
//		// lotto[1]
//		for (int i = 0; i < a.getLottoNumber().length; i++) { // a.getLottoNumber()의 리턴타입이 배열임
//			System.out.println(a.getLottoNumber()[i]);
		// }
	}// end of main
}// end of class

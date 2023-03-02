package ch09;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;

// 기능
// 랜덤번호 발생하는 클래스 1~45까지
// get,set 필요하면 생성
// 6개 번호를 리턴하는 기능
// 정렬까지 책임
public class LottoRandomNumber extends JFrame {

	int[] lotto = new int[6];
	Random r = new Random();

	// 난수 6개 생성, 오름차순 정렬
	public int[] getLottoNumbers() {

		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			for (int e = 0; e < i; e++) {
				if (lotto[i] == lotto[e]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}

}

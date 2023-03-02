package ex01;

import java.util.Arrays;
import java.util.Random;

// 6개의 난수 발생해서 배열을 리턴하는 기능

public class LottoRandomNumber {

	final int LOTTO_NUMBERSIZE = 6;

	public int[] createNumber() {

		int[] lottoWinNum = new int[LOTTO_NUMBERSIZE];
		Random random = new Random();

		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;
			// 중복 검증
			// 1. i 값이 0일 때 내부 for문은 실행이 안된다.
			// 2. i값이 난수 10과 20일 때 실행 된다.
			// 현재 j=0이고 i=1이다.
			// j는 한번 실행 된다.
			// lottoNumber[0] = 10이 들어가있는 상태
			// lottoNumber[1] = 20이 들어가있는 상태
			// ===========================
			// lottoNumber[0] = 10
			// lottoNumber[1] = 10
			// 같을 때 i 값 : 1이니까 i -= 1하게되면
			// 다시 난수 발생하게 한다.
			for (int j = 0; j < i; j++) {
				// 현재 i값 : 1, 현재 j값 : 0
				// lottoNumber[1] = 20이다.
				// 20과 10을 비교해서 같나?
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i --;
					break;
				}
			}
		}
		Arrays.sort(lottoWinNum); 		// 오름 차순 정렬
		return lottoWinNum;
	}

}

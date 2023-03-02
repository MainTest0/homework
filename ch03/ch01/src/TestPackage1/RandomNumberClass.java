package TestPackage1;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberClass {

	int lotto[] = new int[6];
	Random r = new Random();

	public void randomNumber() {
		System.out.println("추첨 번호는");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					return;
				}
			}
		}
		Arrays.sort(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}

	public static void main(String[] args) {
		RandomNumberClass r = new RandomNumberClass();
		r.randomNumber();	
	}
}

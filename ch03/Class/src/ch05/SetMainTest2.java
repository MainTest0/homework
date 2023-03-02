package ch05;

import java.util.HashSet;
import java.util.Random;

public class SetMainTest2 {

	public static void main(String[] args) {

		// 무조건 6개 사이즈를 가지는 numberSet을 구성하시오
		// 반복문 사용
		int cnt=0;

		HashSet<Integer> numberSet = new HashSet<>();
		
		for(int i = 0; numberSet.size() < 6; i++) {
			numberSet.add(getRandomNumber());
			cnt++;
		}
		System.out.println(numberSet.size());
		System.out.println(numberSet.toString());
		System.out.println("반복횟수 : " +cnt);
		
//		for (int i = 0; numberSet.size() < 6; i++) {
//			numberSet.add(getRandomNumber());
//		}
//		System.out.println(numberSet.size());
//		System.out.println(numberSet.toString());

	}

	public static int getRandomNumber() {

		Random rand = new Random();

		return rand.nextInt(45) + 1;
	}

}

package Ex10;

import java.util.Random;
import java.util.Scanner;

public class GiveAway {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		Pick car = new Pick();
		Pick bear = new Pick();
		Pick money = new Pick();

		Pick giveAway[] = new Pick[4];
		int userNum;
		boolean temp = true;
		int randNum;

		giveAway[1] = car;
		giveAway[2] = bear;
		giveAway[3] = money;

		while (temp) {
			randNum = rand.nextInt(3) + 1;
		
			System.out.println("숫자 1~3을 입력하시면 뽑기가 진행됩니다. 0을 누르면 종료가 됩니다.");
			userNum = sc.nextInt();

			if (userNum == 1 && randNum == 1) {
				giveAway[randNum].PickCar();

			} else if (userNum == 2 && randNum == 2) {
				giveAway[randNum].PickBear();

			} else if (userNum == 3 && randNum == 3) {
				giveAway[randNum].PickMoney();
				
			} else if (userNum != randNum && userNum != 0) {
				System.out.println("꽝 입니다.");
			}
			if (userNum == 0) {
				System.out.println("종료");
				temp = false;
			}
		} // end of while

	}// end of main
}// end of class

class Pick extends GiveAway {
	public void PickCar() {
		System.out.println("장난감 자동차를 뽑으셨습니다.");
	}

	public void PickBear() {
		System.out.println("곰인형을 뽑으셨습니다.");
	}

	public void PickMoney() {
		System.out.println("축하합니다! 돈을 뽑으셨습니다.");
	}

}

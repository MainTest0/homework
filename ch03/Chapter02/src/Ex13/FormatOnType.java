package Ex13;

public class FormatOnType {

	public static void main(String[] args) {

		// 자동정렬하기
		int temp = 0;
		int[] myNumbers = new int[10];
		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;

		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < myNumbers.length; j++) {
				if (myNumbers[i] < myNumbers[j]) {
					temp = myNumbers[i];
					myNumbers[i] = myNumbers[j];
					myNumbers[j] = temp;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(myNumbers[i]);
		}
	}

}

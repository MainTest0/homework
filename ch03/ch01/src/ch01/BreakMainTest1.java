package ch01;

public class BreakMainTest1 {
	
	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			System.out.println("i : " + i);
			// 만약 i값이 소수 7이면 멈춰라 !
			// 소수 : 나누었을때 0이되는것
			if (i % 7 == 0) {	//중간에 멈추고 반복문 하나를 빠져나옴
				break;
			}
		}

	} // end of main

} // end of class

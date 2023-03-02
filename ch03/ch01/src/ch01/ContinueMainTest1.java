package ch01;

public class ContinueMainTest1 {

	public static void main(String[] args) {

		// 무시하고 계속 진행하는 continue 문
		
//		for (int i = 1; i < 11; i++) {
//
//			if (i % 7 == 0) {		//continue문을 만나게되면 출력코드 무시함
//				continue;
//			}
//			System.out.println("현재값 i : " + i); // 7이면 출력하고 싶지 않음
//		}
//		

		// 3의 배수면 출력하지마시오
		for (int i = 1; i < 11; i++) {

			if (i % 3 == 0) {		//continue문을 만나게되면 출력코드 무시함
				continue;
			}
			System.out.println("현재값 i : " + i); // 7이면 출력하고 싶지 않음
		}

	}

}

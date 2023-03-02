package ch05;

import java.util.Scanner;

public class MainTest02 {

	public static void main(String[] args) {

		int user;
		boolean userChoise = true;

		// 객체 생성
		Student student = new Student("홍길동", 10_000);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Bus bus402 = new Bus(402);
		Bus bus482 = new Bus(482);

		// 1단계 - 사용해보기

		student.takeBus(bus402);
		bus402.showInfo();
		student.showInfo();

		student.takeSubway(subway2);
		subway2.showInfo();
		student.showInfo();

		// 2단계 - 실행 흐름 만들어보기
		// 스캐너 받아서 1호선 타시겠습니까 2호선 타시겠습니까

		Scanner sc = new Scanner(System.in);
		while (userChoise == true) {
			System.out.println("1호선 타시겠습니까 2호선 타시겠습니까(버스를 타려면 다른숫자를 눌러주세요)");
			user = sc.nextInt();
				if (user == 1) {
					student.takeSubway(subway1);
					subway1.showInfo();
					student.showInfo();
				} else if (user == 2) {
					student.takeSubway(subway2);
					subway2.showInfo();
					student.showInfo();
				} else  {
				System.out.println("버스를 타시겠습니까? (yes면 true, no면 false)");
				userChoise = sc.nextBoolean();
				if (userChoise == true) {
					System.out.println("402번 버스를 타시겠습니까? 482번 버스를 타시겠습니까?");
					user = sc.nextInt();
						if (user == 402) {
							student.takeBus(bus402);
							bus402.showInfo();
							student.showInfo();
						} else if (user == 482) {
							student.takeBus(bus482);
							bus482.showInfo();
							student.showInfo();
						} else {
							System.out.println("걸어가세요");
							break;
						}
				} else {
					System.out.println("걸어가세요");
					break;
				}

			} // end of while
		}
	} // end of main
}// end of class

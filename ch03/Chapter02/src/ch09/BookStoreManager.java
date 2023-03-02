package ch09;

import java.util.Scanner;

public class BookStoreManager {
	public static void main(String[] args) {
		// 책을 저장하는 기능을 만들고
		// 정보를 출력하는 프로그램을 만들어 주세요.
		// 스캐너사용

		// while문을 사용해서 CRUD의 개념 조사하고
		// 0번누르면 프로그램 종료
		// 1번누르면 책 저장
		// 2번누르면 전체 책 조회
		// 3번 누르면 선택 조회
		// 4번누르면 전체 삭제

		Book books[] = new Book[20]; // 배열 선언 (메모리 공간 만들어 주기)

		books[0] = new Book("플러터 UI실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명");
		books[2] = new Book("흐르는 강물처럼.", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하라.", "이지성");
		books[4] = new Book("사피엔스", "유발 하라리");
		books[7] = new Book("7번째", "배열");
		books[9] = new Book("홍길동전", "허균");

		Scanner sc = new Scanner(System.in);

		int userNum = 1;
		String userBookTitle;
		String userBookAutor;
		String userCheck;

		while (userNum != 0) {
			System.out.println("번호를 입력해주세요(0.프로그램종료 1.책 저장 2.전체 책 조회 3.선택 조회 4.전체 삭제");
			userNum = sc.nextInt();

			if (userNum == 0) {
				System.out.println("프로그램 종료");
				userNum = 0;
			}
			if (userNum == 1) {
				System.out.println("저장하려는 책 제목을 입력해주세요");
				sc.nextLine();
				userBookTitle = sc.nextLine();
				System.out.println("저장하려는 책의 저자를 입력해주세요");
				userBookAutor = sc.nextLine();
				System.out.println(userBookTitle + userBookAutor);

				for (int i = 0; i < books.length; i++) {
					if (books[i] == null) {
						books[i] = new Book(userBookTitle, userBookAutor);
						break;
					} else if (books[i] != null) {
						continue;
					}
				} // end of for

				System.out.println("저장 되었습니다.");
			}

			if (userNum == 2) {
				System.out.println("============전체 책 조회===============");
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfo();
					} else if (books[i] == null) {
						continue;
					}
				} // end of for
			} // end of if(userNum == 2)

			if (userNum == 3) {
				System.out.println("조회하려는 책 제목을 입력해주세요");
				sc.nextLine();
				userCheck = sc.nextLine();

				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						if (books[i].getTitle().equals(userCheck)) {
							System.out.println(
									"조회한 책의 제목은 " + books[i].getTitle() + " 저자는 " + books[i].getAutor() + "입니다");
							break;
						} else if (books[i] == null && books[i] != null) {
							continue;
						}
					} // end of for
				}
			}
			if (userNum == 4) {
				System.out.println("책이 모두 삭제됩니다.");
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i] = null;
					}
				}
			}
		}

		// TIP
		// 값을 비교하는 연산자 ==
		// 문자열을 비교할 때는 equals연산자를 쓴다.
//		String temp = "안녕";
//		if(temp.equals("안녕")) {
//			System.out.println("같은값확인");
//		}else {
//			System.out.println("값이 달라요");
//		}
//		
//		if("반가워".equals("안녕")) {
//			System.out.println("같은값확인");
//		}else {
//			System.out.println("값이 달라요");
//		}

	}
}

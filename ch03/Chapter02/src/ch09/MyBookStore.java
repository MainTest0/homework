package ch09;

import java.util.Scanner;

/*
 * 	이치승
 * 	북 객체를 관리하는 프로그램
 * 	C R U D  ->  구글링 정의, 확인하기
 */

public class MyBookStore {

	public static void main(String[] args) {

		// 준비물
		Scanner sc = new Scanner(System.in);
		// 배열은 먼저 배열의 길이를 지정해 줘야한다.
		Book[] books = new Book[100];
		boolean flag = true;
		int lastIndexNumber = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		// 다 완성되면(to do) 추후 삭제 예정
		// 임시 데이터
		books[0] = new Book("플러터 UI실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명");
		books[2] = new Book("흐르는 강물처럼.", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하라.", "이지성");
		books[4] = new Book("사피엔스", "유발 하라리");

		// 실행의 흐름 만들어 보기
		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1. 저장 2. 전체 조회 3. 선택 조회 4. 전체 삭제 0. 종료");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				
				// lastIndexNumber : 지역변수라서 함수가 실행되고 난 후 리턴안해주면 계속 5가 저장되있어서
				// 지역변수에서 lastIndexNumber가 6으로 1더해진걸 반환해서
				// lastIndexNumber에 6을 넣어준다.
				lastIndexNumber = saveBook(books, sc, lastIndexNumber);			//저장하는 함수

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				readAll(books);		// 조회하는 함수

			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				readByTitle(sc, books);		//선택조회 하는 함수

			} else if (selectedNumber.equals(DELETE_ALL)) {
				deleteAll(books, lastIndexNumber);		//전체 삭제하는 함수

			} else if (selectedNumber.equals(END)) {
				System.out.println(">>>프로그램 종료<<<");
				flag = false;
			} else {
				System.out.println("잘못된 입력 값 입니다.\n다시 선택 바람");
			}

		}

	} // end of main
	
	// 저장하기 기능
	public static int saveBook(Book[] books, Scanner sc, int lastIndexNumber) {
		System.out.println(">>>저장하기<<<");
		System.out.println("책 제목을 입력하세요\n");
		String bookTitle = sc.nextLine();
		System.out.println("저자 이름을 입력하세요\n");
		String bookAuthor = sc.nextLine();
		Book book = new Book(bookTitle, bookAuthor);
		// 비어있는 배열을 찾는법
		// 반복문 쓰는법
		// 인덱스 번호를 관리하기
		// lastIndexNuber = 5로 되있고
		// lastIndexNuber++; 해주면 됨
		books[lastIndexNumber] = book;
		lastIndexNumber++;
		System.out.println(bookTitle + "책을 저장했어요");
		return lastIndexNumber;
	}
	
	// 전체 조회하기 기능
	public static void readAll(Book[] books) {
		System.out.println(">>>전체 조회하기<<<");
		// 반복 횟수 100번
		// 임시데이터는 5개
		// 99 = 인덱스의 길이 i <= books.length하게되면 101번 도는거라서 오류
		for (int i = 0; i < books.length; i++) {
			// 타이틀 + 이름
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + ", " + books[i].getAutor() + "\n");
			}
		}
	}
	
	// 선택 조회하기 기능
	public static void readByTitle(Scanner sc, Book[] books) {
		System.out.println(">>>선택 조회하기<<<");
		System.out.println(">>>책 제목을 입력 해주세요<<<");
		String bookTitle = sc.nextLine();
		boolean isFind = false; // 찾았다

		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // ************************
				// books[0] --> 객체.title을 조회할수 있겠죠.equals
				if (books[i].getTitle().equals(bookTitle)) {
					System.out.println(books[i].getTitle() + ", " + books[i].getAutor() + "\n");
					isFind = true;
					break;
				}
			}
		}
		if (isFind == false) {
			System.out.println("아쉽지만 없는 책입니다.");
		}
	}
	
	// 전체 삭제하기
	public static void deleteAll(Book[] books, int lastIndexNumber) {
		System.out.println(">>>전체 삭제<<<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i] = null;
			}
			lastIndexNumber = 0;
		}
	}
	
} // end of class

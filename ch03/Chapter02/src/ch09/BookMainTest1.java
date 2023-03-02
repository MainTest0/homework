package ch09;

import java.util.Iterator;

public class BookMainTest1 {

	public static void main(String[] args) {

		// 연관된 하나의 데이터를 통으로 관리하고 싶다면 배열, 자료구조를 사용하면 된다.
		Book books[] = new Book[10]; // 배열 선언 (메모리 공간 만들어 주기)

		books[0] = new Book("플러터 UI실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명");
		books[2] = new Book("흐르는 강물처럼.", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하라.", "이지성");
		books[4] = new Book("사피엔스", "유발 하라리");
		books[7] = new Book("7번째", "배열");
		books[9] = new Book("홍길동전", "허균");

		// 배열을 만들 때 주의할 점
		// 배열의 크기와 실제 들어가있는 값의 개수는 다를 수 있다.
		// book[6]으로 해놓고 반복문에서 book.length를 하게되면
		// 실제 들어있는 값은 5개밖에없는데 6번째를 실행할 때 NPE(Null Point Exception)가 일어난다.
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 방어적 코드 짜기
				System.out.println(books[i].getTitle() + books[i].getAutor());
			}
		}

		// index의 크기는 n-1개다
		// 배열의 길이와 index의 길이는 다르다
		// 배열의 길이 : 5 index의 길이 : 4

		// 문제1
		// double 배열[4] 선언해서 임의 값 넣고 출력해주세요
		// 3번째 인덱스는 값 할당하지 마시오( 방어적 코드 짜셈)
		// 출력은 for문
		double arr[] = new double[4];

		arr[0] = 2.578;
		arr[1] = 2.535424;
		arr[2] = 2.3545;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}

		// 문제2
		// 8번째 인덱스에 있는 녀석과 인덱스 2번째 녀석의 값을 스왑해주세요
		System.out.println("======================");

		Book temp = books[0];
		books[0] = books[2];
		books[2] = temp;
//		for (int i = 0; i < books.length; i++) {
//			if (books[i] != null) {
//				books[8] = books[1];
//				books[1] = books[7];
//				books[7] = books[8];
//				books[8] = null;
//				System.out.println(books[i].getTitle() + books[i].getAutor());
//			}
//		}

		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + books[i].getAutor());
			}
		}

		// 문제3
		// 인덱스 3번의 값을 삭제 해주세요

	}

}

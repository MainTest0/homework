package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		// 키보드에서 데이터를 프로그램 안으로 넣기
		System.out.println("알파벳 하나 쓰고 Enter를 누르세요.");
		// out 화면쪽으로 이러한 글자를 보내는것
		int i;

		// System.in.read(); 한 바이트씩 키보드의 값을 입력받아 읽어라
		try {
			// 입력
			i = System.in.read();
			// 출력
			System.out.println(i);
			// 컴퓨터에는 사람들이 쓰기위해서 문자표라는 미리 약속해둔 녀석이 있다.
			// 이녀석들은 0101 바이트 단위인데 중간에 문자표를 미리 만들어두고 쓰는 것
			// 인코딩 : 정수값을 문자열로 변환 이 반대는 디코딩
			System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end of main

}// end of class

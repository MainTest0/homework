package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) {

		// 기반 스트림 + 보조 스트림
		// 키보드에서 각 입력 받는 것 복습
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// System.out.print("입력 : ");
		try {
			String input = reader.readLine();
			System.out.println("input : " + input);

			// 메인 쓰레드 1개 일하는 중
			while (input != null) {
				System.out.print("입력 : ");
				input = reader.readLine();
				System.out.println("입력 한 값 : " + input);

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end of main

}// end of class

package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample2EX {

	public static void main(String[] args) {

		// 기반 스트림 + 보조 스트림
		// 키보드에서 각 입력 받는 것 복습

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input = reader.readLine();
			System.out.println("입력된 값 : " + input);

			while (input != null) {
				input = reader.readLine();
				System.out.println("입력된 값 : " + input);
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

	public void run() {
		BufferedWriter fw = null;
		try {
			fw = new BufferedWriter(new FileWriter("output1EX.txt"));
			
			while(fw!=null) {
				System.out.println("출력된 값 : " + fw);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}// end of class

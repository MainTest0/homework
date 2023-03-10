package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {

		// 글자를 만들어 두고 파일에다가 출력 하기
		// 출력 스트림 필요, 파일, 문자 단위
		// 기반 + 보조

		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter("output1.txt")); // 보조스트림 writer + 기반스트림 FileWriter

			writer.write("Hello world");
			writer.newLine(); // 한줄 띄우는 명령어
			writer.write("안녕하세요");
			// 습관적으로 물을 내려주는 것이 좋다
			// 버퍼는 입시적으로 공간을 만들어 뒀다가 차곡차곡 쌓아진 녀석들을
			// 내려줘야 됨 flush()
			writer.flush();

		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end of main

}// end of class

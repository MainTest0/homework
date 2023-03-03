package ch01;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample2EX {

	public static void main(String[] args) {

		// 글자를 만들어 두고 파일에다가 출력 하기
		// 출력 스트림 필요, 파일, 문자 단위
		// 기반 + 보조

		BufferedWriter fw = null;

		try {
			fw = new BufferedWriter(new FileWriter("output1EX.txt"));

			fw.write("안녕하세요");
			fw.newLine();
			fw.write("hello world");
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 습관적으로 물을 내려주는 것이 좋다
		// 버퍼는 입시적으로 공간을 만들어 뒀다가 차곡차곡 쌓아진 녀석들을
		// 내려줘야 됨 flush()

	}// end of main

}// end of class

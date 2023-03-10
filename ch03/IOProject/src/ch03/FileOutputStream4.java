package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream4 {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		// 파일이 없다면 FileOutputStream은 파일을 먼저 생성해준다.
		try {
			// 응용
			byte[] bs = new byte[26];
			byte myData = 65;
			fos = new FileOutputStream("output2.txt", true);	// true를 적으면 추가적으로 글을 쓰는 동작을 함
			// 파일에다가 A부터 Z까지 알파벳을 출력하고 싶다면 코드 작성 방법은?
			// 반복횟수가 정해져있음 -> for문
			for (int i = 0; i < bs.length; i++) {
				//fos.write(myData);
				bs[i] = myData;
				myData++;
				// myData(65) -> +1씩 올리려면
			}
			fos.write(bs);
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end of main

}// end of class

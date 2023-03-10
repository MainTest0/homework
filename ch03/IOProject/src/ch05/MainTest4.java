package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest4 {

	public static void main(String[] args) {

		long milliSecond = 0;

		// 1단계 1바이트씩 데이터를 읽어들이는 기반 스트림

		FileReader fileReader = null;
		int count = 0;

		try {
			File file = new File("output2.txt");
			fileReader = new FileReader(file);
			// 한줄씩 읽어라
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			// 파일에다가 출력 하기
			FileWriter writer = new FileWriter("myText.txt");
			writer.write(bufferedReader.readLine());	// read() : 한글자씩, readLine() : 한줄씩
			writer.flush();		// flush()를 해줘야 완료를 찍어준다.
			
			
			int i;
//		while((i=fileReader.read()) != -1) {
//			System.out.println((char)i);
//			count++;
//		}
//			while((i=bufferedReader.read()) != -1) {
//				System.out.println((char)i);
//				count++;
//			}
			bufferedReader.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end of main

}// end of class

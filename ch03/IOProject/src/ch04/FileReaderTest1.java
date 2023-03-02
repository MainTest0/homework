package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {

		// 문자 단위로 읽어 들이는 스트림
		FileReader fr= null;		//reader는 최소 2byte씩 읽어들여서 한글도 안깨진다.
		
		try {
			fr = new FileReader("output2.txt");
			int temp = fr.read();
			System.out.println("temp : " + (char)temp);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}// end of main

}// end of class

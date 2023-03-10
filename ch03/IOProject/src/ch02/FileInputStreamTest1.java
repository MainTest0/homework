package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		// FileInputStream 객체라서 메모리에 올려야된다 -> new 떄려야됨 
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");	//파일을 찾았다 -> 빨대를 꽂아놓은 상태 -> 명령어를 통해서 한 byte씩 읽을 수 있다.
//			int temp = fis.read();
//			System.out.println(temp);
//			System.out.println((char)temp);
			// 게임만들었던 순위를 파일만들어서 저장할 수 있게된다.
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 스트림을 열어두는건 메모리낭비
			// fis 스트림을 닫을거임 fis.close();
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("여기 코드가 올까요?");	//예외처리 했기때문에 온다
		
	}// end of main

}// end of class

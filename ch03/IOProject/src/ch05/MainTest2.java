package ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {

		long  milliSecond = 0;
		
		//1단계 1바이트씩 데이터를 읽어들이는 기반 스트림
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("a.zip");
			fos = new FileOutputStream("Bubble.zip");
			int i;
			milliSecond = System.currentTimeMillis();
			while(( i = fis.read()) != -1) {
				// 2단계 i라는 공간안에 읽고있는 중
				fos.write(i); 		//쓰는중
			}
			
			milliSecond = System.currentTimeMillis()  - milliSecond;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일 복사 시 소요 시간 : " + milliSecond);
		
	}// end of main

}// end of class

package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest3 {

	public static void main(String[] args) {

		long  milliSecond = 0;
		
		//1단계 1바이트씩 데이터를 읽어들이는 기반 스트림
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("Bubble.zip");
			fos = new FileOutputStream("BubbleCoppy.zip");
			// 보조스트림 활용하기
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			int i;
			milliSecond = System.currentTimeMillis();
			while(( i = bis.read()) != -1) {
				bos.write(i);
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

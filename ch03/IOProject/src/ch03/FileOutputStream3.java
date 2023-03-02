package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {

	public static void main(String[] args) {

		//output3.txt
		// hello world를 띄어주세요
		
		FileOutputStream fos = null;

		// 파일이 없다면 FileOutputStream은 파일을 먼저 생성해준다.
		try {
			// 응용
			byte[] bs = new byte[26];
			String myString = "hello world";
			
			int myData = Integer.parseInt(myString);	
			
			fos = new FileOutputStream("output3.txt");
			//fos.write(myData);
			System.out.println(myData);
		} catch (IOException e) {

			e.printStackTrace();
		} 

	}// end of main

}// end of class

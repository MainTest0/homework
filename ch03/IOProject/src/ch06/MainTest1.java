package ch06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest1 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("data.txt");
			// 보조 기반 스트림 활용
			DataOutputStream dos = new DataOutputStream(fos);	// 보조 기반스트림이라서 기반 스트림 넣어줌
			
//			dos.write(10);
			// 데이터를 보조기반 스트림으로 바로 썻구요
			// 보조기반 스트림이라서 기능이 더 많다
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14F);
			dos.writeUTF("Test UTF-8");
			dos.flush(); 	//잊지말자!!!
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 데이터 단위로 읽어보자
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data.txt");
			// 보조 스트림
			DataInputStream dis = new DataInputStream(fis);
			
			char a = dis.readChar();
			int b = dis.readInt();
			float c = dis.readFloat();
			String d = dis.readUTF();
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	} //end of main

} // end of class

package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyArticle1 {

	public static void main(String[] args) {
		// 파일 입출력을 활용해서 코드를 작성해 주세요
		// 입력 대상 : article1.txt
		// 출력 대상 : today_article.txt

		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr=new FileReader("article1.txt");
			fw =new FileWriter("today_article.txt");
			// 더이상 읽을거리가 없다면 -1을 return한다.
			// Reader 기반은 2byte 이상 처리 가능하다. -> 한글이 깨지지 않아요
			// 동작이 끝났으면 finally를 해줘야 파일에 올라감
			// fw.writer를 작성할 때 스트림이 열려있으면 잠시 버퍼라는 공간에 담아두었다가
			// 스트림이 종료되거나, flush라는 메서드를 만나면 실제로 file에 출력한다.
			int i;
			fw.write("MVC 뉴스\n\n");
			while( (i = fr.read()) != -1) {
//				System.out.print((char)i);
				fw.write(i);
			}
			fw.write("\n작성자 : 이치승");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 순서대로 닫아주는게 좋다.
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end of main

} // end of class

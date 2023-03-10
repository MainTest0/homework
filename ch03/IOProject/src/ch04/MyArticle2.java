package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyArticle2 {

	public static void main(String[] args) {
		// 파일 입출력을 활용해서 코드를 작성해 주세요
		// 입력 대상 : article1.txt
		// 출력 대상 : today_article.txt

		int i;
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article.txt");
			fw.write("뉴스 제목 : MVC\n\n");
			while ((i = fr.read()) != -1) {
				// System.out.print((char)i);
				fw.write((char) i);
			}
			fw.write("\n작성자 : 이치승");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end of main

} // end of class

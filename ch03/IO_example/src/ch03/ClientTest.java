package ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientTest {
	
	// 통신을 하기 위해 소켓이 필요 + 주소(IP필요) + 포트번호
	Socket socket;

	final String IP = "localhost";
//	final String IP = "192.168.0.88";
	final int PORT = 10000;

	BufferedReader reader;
	BufferedWriter writer;

	public ClientTest() {
		initData();
	}

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, PORT);
			// 클라이언트와 서버 연결 완료 상태
			// 키보드에서 데이터를 입력받고 싶다

			reader = new BufferedReader(new InputStreamReader(System.in)); // 키보드와 연결해둔 상태

			// 하고싶은거 : 소켓통신을 통해서 데이터를 출력하고싶다.
			// 출력 스트림 연결, 대상은 소켓

			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.println("키보드 입력 대기");
				String input = reader.readLine(); // 여기까지 키보드에서 데이터 입력 받음
				writer.write(input);
				writer.newLine(); // 문장의 끝을 알려줘야한다.
				writer.flush(); // 물내려
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ClientTest();
	}// end of main

} // end of class

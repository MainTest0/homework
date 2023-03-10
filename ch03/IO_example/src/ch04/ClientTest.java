package ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientTest {

	// 서버에서도 메시지를 보내게 하고싶다
	// 서버에 writer, 클라이언트에 reader필요 - 양방향 통신
	// 통신을 하기 위해 소켓이 필요 + 주소(IP필요) + 포트번호
	Socket socket;

//	final String IP = "localhost";
	final String IP = "192.168.0.75";
	final int PORT = 10000;

	BufferedReader keyboardReader;
	BufferedWriter writer;

	public ClientTest() {
		initData();
	}

	// 소켓 통신을 통해 들어온 데이터를 입력 받아야 해
	// 입력 스트림이 필요하다.
	BufferedReader socketReader;

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, PORT);
			// 클라이언트와 서버 연결 완료 상태
			// 키보드에서 데이터를 입력받고 싶다

			keyboardReader = new BufferedReader(new InputStreamReader(System.in)); // 키보드와 연결해둔 상태

			// 하고싶은거 : 소켓통신을 통해서 데이터를 출력하고싶다.
			// 출력 스트림 연결, 대상은 소켓

			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 소켓과 입력 스트림 연결하기(초기화)
			// 입력 스트림 연결 완료
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 익명클래스로 만들어보자
			new Thread(new ReadThread()).start();
			
			
			while (true) {
				System.out.println("키보드 입력 대기");
				String input = keyboardReader.readLine(); // 여기까지 키보드에서 데이터 입력 받음
				writer.write(input);
				writer.newLine(); // 문장의 끝을 알려줘야한다.
				writer.flush(); // 물내려
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				keyboardReader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // end of initData
		// 내부 클래스

	class ReadThread implements Runnable {

		// 작업자 생성
		// 추상 메서드를 구현 메서드로 변경
		// 해야할 일
		// 소켓통신으로 들어온 데이터를 읽어야함
		@Override
		public void run() {
			while (true) {
				try {
					String serverMsg = socketReader.readLine();
					System.out.println("서버로부터 온 메시지 : " + serverMsg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		new ClientTest();
	}// end of main

} // end of class

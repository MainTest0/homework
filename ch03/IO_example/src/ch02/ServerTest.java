package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
//당방향 통신
public class ServerTest {

// 서버 소켓 필요

	// 클라이언트로 연결받는 소켓
	ServerSocket serverSocket;
	// 실제 통신을 담당할 소켓 필요
	Socket socket;

	public ServerTest() {
		initData();
	}

	private void initData() {
		try {
			// 서버 소켓 생성
			serverSocket = new ServerSocket(10000);
			// 클라이언트 접속 대기
			// 들어올 때까지 대기 중 -> 클라이언트가 들어오면 -> 소켓 반환
			System.out.println("클라이언트 접속 대기");
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");
			// 스트림 연결 : 입력 스트림? 출력 스트림?
			// 입력 스트림 연결 대상은 소켓이다.
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 소켓 연결했으니까 데이터가 들어올 때 까지 기다림
			// 데이터를 읽는 명령어 BufferedReader
			System.out.println(reader.readLine() + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ServerTest();
	}// end of main

}// end of class

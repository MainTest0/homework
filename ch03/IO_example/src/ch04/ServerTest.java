package ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	// 서버에서도 메시지를 보내게 하고싶다
	// 서버에 writer, 클라이언트에 reader필요 - 양방향 통신
	// 서버 소켓 필요

	// 클라이언트로 연결받는 소켓
	ServerSocket serverSocket;
	// 실제 통신을 담당할 소켓 필요
	Socket socket;
	// 입력 스트림 - 소켓 담당
	BufferedReader reader;

	// 출력 스트림 (양방향 통신에 필요)
	BufferedWriter bufferedWriter;

	// 서버측에서 키보드 데이터를 받기위해 입력 스트림이 필요하다.
	// 키보드에 대한 입력 데이터를 담당
	BufferedReader keyboardReader;

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
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 키보드에 연결, 스트림 준비
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));

			// 클라이언트 측으로 데이터를 보내기 위해 출력 스트림 연결
			// 대상 소켓과 스트림 연결
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 새로운 작업자 생성해서 일해라고 명령하기
			WriterThread writerThread = new WriterThread();
			// Runnble 타입을 시작 시키는 방법
			// start메서드는 thread에 있다
			Thread thread = new Thread(writerThread);
			thread.start();

			// 데이터 읽는 명령 - main thread
			while (true) {
				String msg = "클라이언트에서 온 메시지 : " + reader.readLine() + "\n";
				System.out.println(msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end of initData
		// 메인 쓰레드가 키보드 계속 받는걸로 하고
		// WriterThread이 출력 담당
		// 내부 클래스 생성

	class WriterThread implements Runnable {

		// 새로운 작업자가 해야할 일을 정의한다.
		@Override
		public void run() {
			// 여기서 해야할 일
			// 키보드에서 데이터를 입력받아
			// 소켓 출력 스트림을 통해서 데이터를 보내주어야 한다.
			while (true) {
				try {
					String serverMsg = "서버 : " + keyboardReader.readLine(); // 키보드 데이터를 받을 수 있다.
					// 출력 스트림을 통해서 데이터 보내기
					// 어디에 연결된 ? 소켓
					bufferedWriter.write(serverMsg + "\n");
					bufferedWriter.flush();
					System.out.println("서버가 작성한 문구 확인 : ");

				} catch (Exception e) {
					e.printStackTrace();
				}

			} // end of while

		}// end of run

	} // end of WriterThread

	public static void main(String[] args) {
		new ServerTest();
	}// end of main

}// end of class

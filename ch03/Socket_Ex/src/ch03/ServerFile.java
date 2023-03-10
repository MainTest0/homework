package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 소켓 통신을 구현
// 1. 서버축과 클라이언트 축은 통신을 통해 데이터를 주고 받는다.
// 서버측 만들 때 서버 소켓을 준비 해야한다......
// 소켓은 양 끝단에 포트 번호를 달아야 한다.
// 0 ~ 65335번 까지 포트 번호를 사용할 수 있다.
// 그 중에 0 ~ 1023번 포트번호까지는 잘 알려진 포트 번호라서 가능한 사용 안하는 것이 좋다.

public class ServerFile {
// Client 연결만 받는 소켓
	// server 소켓
	ServerSocket serverSocket;
	Socket socket;
	
	BufferedReader bufferedReader;

	public ServerFile() {
		System.out.println(">> 1. 서버 소켓 시작<<");
		// 임의로 포트번호 만들어 낼 수 있음

		try {
			serverSocket = new ServerSocket(11000);

			socket = serverSocket.accept();
			System.out.println("2. 클라이언트 연결 완료");
			
			bufferedReader 
			= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String getMsg = bufferedReader.readLine();
				System.out.println("받은 메시지 : " +getMsg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("여기에 코드가 내려왔나요?");
	}// end of 생성자

	public static void main(String[] args) {
		new ServerFile();
	}

}// end of class

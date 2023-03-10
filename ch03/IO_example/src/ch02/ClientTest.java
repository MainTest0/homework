package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

//당방향 통신
public class ClientTest {

	// 통신을 하기 위해 소켓이 필요 + 주소(IP필요) + 포트번호
	Socket socket;
	// 서버를 만들어야 할 때 누구나 내 컴퓨터에 접속을 할 수 있게
	// 사설ip 임대업자가 임시로 제공해주는 ip (언제든지 바뀔 수 있음)
	// 실제 서비스할려면 공인 ip구매해야함
	// ip가 고정되서 프로그램 만들면 그 주소로 접근가능
	// 다른 사람도 편하게 접근할 수 있도록 도메인을 붙여놓음
	// 사설 ip : 입대받은 ip
	// 공인 ip : 고정된 ip
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
			String input = reader.readLine(); // 여기까지 키보드에서 데이터 입력 받음

			// 하고싶은거 : 소켓통신을 통해서 데이터를 출력하고싶다.
			// 출력 스트림 연결, 대상은 소켓
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			writer.write(input);
			writer.newLine(); // 문장의 끝을 알려줘야한다.
			writer.flush(); // 물내려

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

package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// 클라이언트 축 코드
// 소켓 통신을 하려면 소켓이 필요하다.
// 서버측 연결을 담당하는 포트번호를 알야아한다.

public class ClientFile {
//	final String IP = "192.168.0.78";
	final String IP = "localhost";	// 자기 IP주소

	Socket socket;
	BufferedWriter bufferedWriter;
	public ClientFile() {
		try {
			System.out.println("1. 클라이언트 소켓 프로그램 시작");
			socket = new Socket(IP, 11000);
			System.out.println("2. 소켓으로 연결 완료");
			
			// 소켓에다가 버퍼스트림 연결
			bufferedWriter 
			= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			bufferedWriter.write("안녕 글 잘 가니?" + "\n");	//문장의 끝 확인
			bufferedWriter.flush();		//버퍼 내리기
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ClientFile();
	}
}// end of class

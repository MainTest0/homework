package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;

public class ServerTest2EX {

	ServerSocket serverSocket;
	Socket socket;
	BufferedReader bufferedReader;
	BufferedWriter writer;
	BufferedReader keyboardReader;

	public ServerTest2EX() {
		initData();
	}

	private void initData() {
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("접속대기");
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");

			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			WriterThread writerThread = new WriterThread();

			Thread thread = new Thread(writerThread);
			thread.start();

			while (true) {
				String msg = "클라이언트 >>> " + bufferedReader.readLine() + "\n";
				System.out.println(msg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end of initData

	class WriterThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					String serverMsg = keyboardReader.readLine();
					writer.write(serverMsg + "\n");
					writer.flush();
					System.out.println("서버가 작성한 문구 확인 : ");

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		new ServerTest2EX();
	}// end of main

}// end of class

package com.tenco.myblog.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	private static final String HOST = "localhost";
	private static final String PORT = "3306";
	private static final String DATABASE_NAME = "myblog";
	private static final String CHARSET = "UTF-8";
	private static final String USERNAME = "bloguser";
	private static final String PASSWORD = "1q2w3e4r5t";

	// 접근 권한 만들어주기(접근 주체)
	private Connection conn;

	// 생성자 만들기
	public Connection getConnection() {

		if (conn == null) {
			// 한번도 생성하지 않았다면 동작!
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, HOST, PORT, DATABASE_NAME, CHARSET);

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
				System.out.println(">> DB 연결 완료 <<");
			} catch (Exception e) {
				System.out.println(">> DBHelper에서 오류가 발생했어! <<");
				e.printStackTrace();
			}
		}

		return conn;
	}

	public void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 가비지 컬렉터 제거 대상이 된다.
		conn = null;
	}

} // end of class

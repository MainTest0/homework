package ch05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {

	private static final String HOST = "localhost";
	private static final String PORT = "3306";
	private static final String DATABASE_NAME = "employees";
	private static final String CHARSET = "UTF-8";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1234";

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	// 싱글톤 패턴 객체 만들기
	// 1 단계 자기자신 넣기
	private static DBHelper dbHelper;

	// 2단계 생성자 생성
	private DBHelper() {

	}

	// 3단계
	public static DBHelper getInstance() {
		// 방어적 코드
		// 아무도 안썼으면 null
		// 어디선가 쓰면 null이 아니고 원래 있는 dbHelper값을 리턴한다.
		if (dbHelper == null) {
			dbHelper = new DBHelper();
		}
		return dbHelper;
	}

	// 커넥션 메서드 만들기
	public Connection getConnection() {
		// 아직 커넥션을 new한적 없다.
		if (conn == null) {
			// 커넥션의 주소가 null이면 실행
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			// jdbc:mysql://localhost:3306/employees?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
			String url = String.format(urlFormat, HOST, PORT, DATABASE_NAME, CHARSET);

			// 위 녀석을 사용하기 위해서 Class.forname 사용

			try { // try문에서 connection 객체를 뽑아낼 수 있다.
				Class.forName("com.mysql.cj.jdbc.Driver"); // 동적으로 객체를 올려주는 녀석(동적 로딩) - 리플렉션 기법
				// jar 파일 받았을 때 선언했던 라이브러리
				conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
				System.out.println("Connection Success");
			} catch (Exception e) {
				System.err.println("Connection Faild");
				e.printStackTrace();
				// 여기서 예외가 발생하면 conn 닫기
				try {
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		// 아무곳에서도 안쓰이면 conn 리턴
		return conn;
	}

	// 닫는 메서드
	public void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}// end of class

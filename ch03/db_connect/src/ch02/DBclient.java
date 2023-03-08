package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBclient {

	private static final String DB_HOST = "localhost";
	// 포트번호 따로 관리
	private static final int DB_PORT = 3306;
	// 사용할 데이터 베이스
	private static final String DB_NAME = "mydb";
	// 문자열 어떤거를 쓸지
	private static final String DB_CHARSET = "UTF-8";
	// 계정 정보와 패스워드 넣기
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "1234";

	// db 접근하기
	// 1. 커넥션
	private Connection conn;
	// 2. statement 쿼리문을 만들어주고 실행시켜주는 녀석
	private Statement stmt;
	// 3. 결과를 담을 resultset
	private ResultSet rs;

	public DBclient() {

	}

	// 리턴 타입은 커넥션 객체를 리턴하는 메서드
	// 이 메서드를 호출할 때 우리는 커넥션 객체를 던져주는 녀석을 만들어야됨
	public Connection getConnection() {
		// 방어적 코드
		if (conn == null) {
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			// urlFormat에서 형식을 만들어줌
			// 쓰는 방법은 localhost 데이터타입이 문자열이라서 %s
			// 포트번호는 int 라서 %d
			// urlForman에 넣어주기만 하면됨
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_NAME, DB_CHARSET);
			
			try {
				// 커넥션 객체를 뽑을 드라이버 객체 로드
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
				// 커넥션 성공 출력
				System.out.println(">>> Connection Success <<<");
			} catch (Exception e) {
				// 커넥션 실패 출력
				System.out.println(">>> Connection Fail <<<");
				e.printStackTrace();
			}
		}
		return conn;
	} // 연결만 시켜주는 메서드기때문에 close 안함
	
	// 접근 제어지시자는 public
	public void connectionClose() {
		// 방어적 코드
		// null이 아닐 때 닫는다
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
}// end of class

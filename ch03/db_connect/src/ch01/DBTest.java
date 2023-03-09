package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	// 준비물
	// 자바코드에서 mysql서버로 접속을 해야하기 때문에 필요한 사항이
	// 계정 정보, 비밀번호
	// 접속 경로 : URL(주소)

	// mysql 연결 주소
	// "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	// 프로토콜 // 자기자신// 3306포트번호 // db이름 // 아시아서버 // UTF-8을 쓸거야
	// mysql 이름, 비번
	private static final String USERNAME = "root";
	private static final String PASSWROLD = "1234"; // 본인 pw작성
	// 경로
	private static final String URL =
			"jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	// DB 접근 기술 필요한 클래스들이 있다.
	static Connection connect; // DB 커넥션 연결 객체
	// 2번째 준비물
	// sql 쿼리문을 생성해줌, 문자열들을 SQL로 변경하거나 명령문을 실행 시켜주는 녀석
	static Statement stmt;
	// 3번째 준비물
	static ResultSet rs;

	public static void main(String[] args) {

		// 드라이버를 로드 해야함
		// 자바에서 sql 로드해주는 녀석을 메모리에 올려야함
		// 컴파일 시점에 선언해서 사용하는 방법을 사용해왔는데 sql은 이렇게 하면 안됨
		// 동적 로딩으로 해야함
		// 동적로딩은 실행시점에 메모리에 객체를 올리는 것을 말함

		try {
			// 드라이버 로드 이 코드는 그냥 외우셈
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Driver <- 동작시켜야 함 sql화면으로 들어갔다 생각하면됨
			connect = DriverManager.getConnection(URL, USERNAME, PASSWROLD);
			// 연결 객체에서 Statement 녀석을 뽑아낼 수 있음
			stmt = connect.createStatement();

			String sql = "select * from userTBL ";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String userName = rs.getString("userName");
				String birthYear = rs.getString("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");
				System.out.println(userName + "," + birthYear + "," + addr + "," + mobile);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// end of main

}// end of class

package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// User Data Access Object 는 객체 필요
// DBclient 복붙해서 shopdb 사용
public class UserDAO implements IUserDAO {

	private DBclient dbClient;

	// 생성자 만들기
	public UserDAO() {
		initData();
	}

	private void initData() {
		dbClient = new DBclient();
	}

	// 밖에서 select 메서드 실행하면 ArrayList 반환
	@Override
	public ArrayList<UserDTO> select() {
		ArrayList<UserDTO> list = new ArrayList<>();

		// 코드 구현
		// 데이터베이스 빼내는 연습
		Connection conn = dbClient.getConnection();
		// finally 닫을려고 null 값 주고 밑에서 초기화
		Statement stmt = null;
		ResultSet rs = null;
		// 쿼리문 만들기
		try {
			// db연결 안될 수도있어서 예외처리
			stmt = conn.createStatement();
			// 실행하면 결과집합 완성, 완성된 결과 rs에 넣어주기
			rs = stmt.executeQuery("SELECT * FROM userTBL "); // 마지막에 한칸 띄어주기

			while (rs.next()) {
				String userName = rs.getString("username");
				int birthYear = rs.getInt("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");

				// 다중행 결과 나오니까 DTO 만들어둔거있음
				UserDTO dto = new UserDTO(userName, birthYear, addr, mobile);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public int insert(UserDTO dto) {

		String sqlFormat = "INSERT INTO " 
				+ "                        userTBL(userName, birthYear, addr, mobile) "
				+ "                        VALUES('%s', %d, '%s', '%s') ";
		// 테스트한 데이터베이스에서 값 들고오기
		// 포매팅 해야되는 애들 티모, 2000, 대구...
		// 외부에서 호출할 때 userDTO 넣으니까
		String sql = String.format(sqlFormat, dto.getUserName(), dto.getBirthYear(), dto.getAddr(), dto.getMobile());

		int resultRowCount = 0;
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.err.println("잘 확인해주세요");
//			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return resultRowCount;
	}

	@Override
	public int update(UserDTO dto, String targetUserName) {

		String sqlFormat = "UPDATE userTBL " 
				+ "	SET birthYear = %d, " 
				+ "			addr = '%s', "
				+ "       		mobile = '%s' " + "WHERE userName = '%s' ";

		String sql = String.format(sqlFormat, dto.getBirthYear(), 
				dto.getAddr(), dto.getMobile(), targetUserName);

		int resultRow = 0;

		// 우리가 쓰면 자동으로 닫아주는 것이 autoClosed
		try (Connection conn = dbClient.getConnection(); 
				Statement stmt = conn.createStatement();) {
			// body안에 넣어주자
			resultRow = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultRow;
	}

	@Override
	public boolean delete(String username) {
		boolean isOk = true;
		String sqlFormat = "DELETE FROM userTBL "
				+ "WHERE username = '%s' ";
		String sql = String.format(sqlFormat, username);
		
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			isOk = false;
			// 여기 실행의 흐름이 여기로 빠졌을 경우
			// 구매 테이블에 데이터가 남아있어서 유저 테이블에서 삭제가 불가능하다.
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isOk;
		
	}

}// end of class

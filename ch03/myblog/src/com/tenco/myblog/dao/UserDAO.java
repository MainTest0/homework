package com.tenco.myblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.myblog.dto.UserDTO;
import com.tenco.myblog.utils.DBHelper;

//유저와 관련된 것만
//블로그와 관련된 것은 blogDAO 이런식으로 나눌거임
/*
* 이 클래스의 기능
* User와 관련된 DB 서버 연결 로직 처리
*/

public class UserDAO implements IUserDAO {

// DBHelper 가져오기
	private DBHelper dbHelper;
	// 공통으로 쓸 수 있게 멤버변수 정리
	// 쓰고나면 null로 초기화 됨
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	// 사용자 정보를 저장시키는 기능 만들기
	@Override
	public int saveUser(UserDTO user) {
		// insert 구문
		String query = " INSERT INTO user " 
				+ " (username, password, email, address, " 
				+ "	userRole, createDate) "
				+ " VALUES(?, ?, ?, ?, ?, now()) ";
		
		int resultRow = 0;
		
		// statement 가져오기
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getUserRole());
			resultRow = pstmt.executeUpdate();	//insert, update, delete 시 사용
			
		} catch (SQLException e) {
			System.out.println(">> saveUser 함수에서 오류가 발생했어 <<");
			e.printStackTrace();
		}
		return resultRow;
	}
	
	// 사용자 정보를 ID와 PW의 값을 확인해서 찾는 기능 만들기
	@Override
	public UserDTO selectUserByUserUsernameAndPassword(String username, String password) {
		UserDTO resultUser = null;
		String query = " SELECT *  "
				+ " FROM user "
				+ " WHERE username = ? "
				+ "	AND password = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			// 여기서 DB에서 넘겨주는 정보를 자바에서 해주는 기술 필요
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUserName(rs.getString("username"));
				dto.setEmail(rs.getString("email"));
				resultUser = dto;
			}
		} catch (Exception e) {
			System.out.println(">> userDAO 회원찾기시 에러 발생 <<");
			e.printStackTrace();
		}
		
		return resultUser;
	}

	

} // end of class

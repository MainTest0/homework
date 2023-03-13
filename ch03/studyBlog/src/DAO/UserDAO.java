package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.UserDTO;
import Utils.DBClient;

public class UserDAO implements IUserDAO{
	
	private DBClient dbc;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbc = new DBClient();
		conn = dbc.getConnection();
	}
	
	@Override
	public int saveUser(UserDTO user) {

		String query = " INSERT INTO user "
				+ " (username, password, email, address, "
				+ "	userRole, createDate) "
				+ " VALUES(?, ?, ?, ?,?, "
				+ " now()) ";
		int row = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getUserRole());
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("UserDAO:saveUser에서 오류 발생");
			e.printStackTrace();
		}
		
		return row;
	}
	
	// 로그인 기능
	@Override
	public UserDTO selectUserNameAndPassword(String username, String password) {
		UserDTO result = null;
		String query = " SELECT *  "
				+ " FROM user "
				+ " WHERE username = ? "
				+ "	AND password = ? ";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUserName(rs.getString("username"));
				dto.setEmail(rs.getString("email"));
				result = dto;
			}
		} catch (SQLException e) {
			System.out.println("UserDAO:로그인기능에서 오류발생");
			e.printStackTrace();
		}
		
		
		return result;
	}


}// end of class

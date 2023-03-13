package com.tenco.myblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.myblog.utils.DBHelper;

public class BlogDAO implements IBlogDAO{
	
	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public BlogDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	
	@Override
	public int save(String title, String content, int userId) {
		
		int resultRow = 0;
		// 글 저장 기능 만들기
		String query = " INSERT INTO board(title, content, userId) "
				+ "VALUES "
				+ "	(?, ?, ?) ";
		// 쿼리를 던지기 위해서는 pstmt
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, userId);
			resultRow = pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(">> blogDAO: save()에서 오류 발생 <<");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int boardId) {
	
		String query = " DELETE FROM board WHERE id = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardId);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(">> blogDAO:delete 에러 발생 <<");
			e.printStackTrace();
		}
		
	}
	
	
}// end of class

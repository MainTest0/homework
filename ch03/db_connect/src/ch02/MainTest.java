package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {

	public static void main(String[] args) {

		DBclient client = new DBclient();
		// 활용도 높이면서 다시 땡겨옴
		Connection conn = client.getConnection();
		try {
			// 이 녀석으로 쿼리문 생성할 수 있고 실행시킬 수 있음
			Statement stmt = conn.createStatement();
			// 결과물 받기
			String queryStr = "SELECT * FROM student";
			// 결과가 ResultSet에 담김
			ResultSet rs = stmt.executeQuery(queryStr);
			// 결과를 뽑는 기술 5행 정도 나옴
			// rs.next()뽑을거리가 있다면
			while (rs.next()) {
				// 컬럼명 넣어주기
				int id = rs.getInt("student_id");
				String name = rs.getString("student_name");
				String grade = rs.getString("grade");
				int schoolId = rs.getInt("school_id");
				System.out.print("id : " + id);
				System.out.print("\t" + "name : " + name + "\t");
				System.out.print("\t" + "grade : " + grade + "\t");
				System.out.print("\t" + "schoolId : " + schoolId + "\t");
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}

	}// end of main

}// end of class

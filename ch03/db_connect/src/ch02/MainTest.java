package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		
		// 자료구조 만들어서 while문 돌때마다
		ArrayList<Student> list = new ArrayList<>();

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
				Student student = 
						new Student(rs.getInt("student_id"), rs.getString("student_name"),
								rs.getString("grade"), rs.getInt("school_id"));
				// 한번 돌때마다 list에 저장
				list.add(student);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}

		for(int i = 0; i < list.size(); i++) {
			// 0번째 인덱스에있는 student 주소값
			// 주소값을 오버라이딩 해놓음
			// toString 메서드 오버라이딩
			System.out.println(list.get(i));
			System.out.println(list.get(i).getName());
		}
		
	}// end of main

}// end of class

//int id = rs.getInt("student_id");
//String name = rs.getString("student_name");
//String grade = rs.getString("grade");
//int schoolId = rs.getInt("school_id");

class Student{
	
	private int id;
	private String name;
	private String grade;
	private int schoolId;
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", schoolId=" + schoolId + "]";
	}

	public Student(int id, String name, String grade, int schoolId) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.schoolId = schoolId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	
	
	
}








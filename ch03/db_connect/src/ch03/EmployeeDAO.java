package ch03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDAO implements IEmployeeDAO {
	// employees 계속 쓸거같아서 변수로 넣기
	private static final String TABLE_NAME = "employees";

	// insert나 select 한번 할때마다 이녀석을 써야함
	private DBclient dbClient;
	private Connection conn;
	
	public EmployeeDAO() {
		dbClient = new DBclient();
	}

	@Override
	public void insert(EmployeeDTO dto) {
		// insert 기능 날릴 때 DB 연결 정보 필요

	}

	@Override
	public ArrayList<EmployeeDTO> select(int empNo) {
		
		ArrayList<EmployeeDTO> list = new ArrayList<>();

		// 맨뒤에 한칸씩 습관적으로 띄우기 (employees)
		// where이랑 붙어서 버그생김
		// 하드코딩 안되게 %s, %d
		String sqlFormat = "SELECT * FROM %s " + "WHERE emp_no = %d";
		// 첫번째 두번째 녀석 포맷팅 해줘야함
		String sql = String.format(sqlFormat, TABLE_NAME, empNo);	//문자열 형식
		conn = dbClient.getConnection();
		
		// 쿼리문을 만들기 위해서 Statement필요함		
		try {
			Statement stmt = conn.createStatement();
			// 쿼리 실행하면 결과집합 반환 해줌
			stmt.execute(sql);
			// 결과집합을 담을 resultset 필요
			// resultset 변수만 선언
			ResultSet rs;
			// 여기서 new 때리는거임
			// 여기서 생성된 녀석을 rs로 담음
			rs = stmt.executeQuery(sql);
			
			// while문 돌려서 결과 찍어보기
			while(rs.next()) {	//조회된게 있는동안 반복
				
				// 주의 : 데이터베이스 세상에있는 컬럼명과 이름이 똑같아야 함
				int mEmpNo = rs.getInt("emp_no");
				String birthDate = rs.getString("birth_date");
				String fristName = rs.getString("first_name");
				String gender = rs.getString("gender");
				String hireDate = rs.getString("hire_date");
				EmployeeDTO dto = new EmployeeDTO(mEmpNo, birthDate, fristName, "", gender, hireDate);
				
				list.add(dto);
			}
			
//			for(int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void select(String lastName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(String gender) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int empNo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String LastName) {
		// TODO Auto-generated method stub

	}
	
}// end of class

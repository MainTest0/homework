package ch03;

import java.util.ArrayList;

public interface IEmployeeDAO {
	// 기능만 정의하는 녀석
	// 어떤 기능만들지는 몰라도 CRUD구조로 만들 수 있음
	// CRUD 구조로 만들기
	
	//삽입 -> null허용값이 하나도 없어서 다 적어줘야함 -> 좀더 간편하게 줄이는 방법?
	// 묶음으로 바라보자 클래스로 설계 해놓음
	// void insert(int empNo, String date String firstName ...); 맞는 방법이긴함
	void insert(EmployeeDTO dto);
	// SELECT * FROM employees
	// WHERE emp_no = 10002; 이런 기능 만들고싶음
	ArrayList<EmployeeDTO> select(int empNo);		//조회
	void select(String lastName);		//조회
 
	void update(String gender);	//수정
	// 오버로딩으로 기능 먼저 정의
	void delete(int empNo);	//삭제
	void delete(String LastName);	//삭제
	
	// 이런식으로 인터페이스 정의
	// 인터페이스가 있으면 우리는 구현해줘야함
	// 구현하는 클래스 만들기
	
}

package test;

import java.util.ArrayList;

public interface IEmployeeDAO {
	
	// 해당 직합의 이름을 입력 받아, 직원이름을 출력
	// 어떻게 만드냐?
	
	// 원하는 결과집합 받아야함(다중행)
	// 직함을 입력하면 직원을 출력해야함
	// 리턴타입이 하나만 나오면	
//	EmployeeDTO showTitleEmpInfo();
	
	// 다중행이면	
	ArrayList<EmployeeDTO> showTitleEmpInfo(String title);
	ArrayList<EmployeeDTO> showTitleEmpInfo(String firstName, String LastName);
	
	int insert(EmployeeDTO dto);
	
	int delete(int empNo);
	
	
}

package ch03;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {

		// DB 접근해서 기능 수행하는 녀석 -> employeeDAO
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
		employeeDAO.select(10005);
		// 메서드 리턴하면 ArrayList 타입이 반환
		ArrayList<EmployeeDTO> list = employeeDAO.select(10005);
		
		// 여기 코드부터 스윙 화면이라면
		// 여기서 db 정보를 빼내고 싶다.
		System.out.println("여기는 main");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	
	}// end of main

} // end of class

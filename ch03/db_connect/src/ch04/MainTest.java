package ch04;

public class MainTest {

	public static void main(String[] args) {
		
		UserDAO userDAO = new UserDAO();
		
		Boolean isDelete = userDAO.delete("유진스");
		System.out.println("isDelete : " +isDelete);
//		
//		if(isDelete == false) {
//			System.out.println("구매테이블에 이력이 남아있을 수 있습니다.");
//		}
		
		// insert 확인
//		UserDTO dto = new UserDTO("야스오", 1995, "부산", "010-2222-2222");
		
		// =========================================================
		
//		int updateRowCount = userDAO.update(dto, dto.getUserName());
//		System.out.println("updateRowCount : " + updateRowCount);
		
		// =======================================================
		
//		int rowCount = userDAO.insert(new UserDTO("아이즈원", 2020,"경기도","010-1234-1234"));
//		System.out.println("rowCount : " + rowCount);
		
		// 만들고 싶은 기능
		// 데이터베이스 접근해서 userTBL에 대한 정보
		// 데이터베이스 접근해서 buyTBL에 대한 정보
		
		// 인터페이스 먼저 구현
		//========================================
		
//		ArrayList<UserDTO> list = userDAO.select();
//		
//		for(int i = 0; i < list.size(); i++ ) {
//			System.out.println(list.get(i).getUserName());
//			System.out.println(list.get(i).getBirthYear());
//			System.out.println(list.get(i).getAddr());
//			System.out.println(list.get(i).getMobile());
//			System.out.println("-------------------------");
//		}
		
		
	}// end of main

}// end of class

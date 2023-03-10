package ch04;

public class MainTest {

	public static void main(String[] args) {

		UserDAO userDAO = new UserDAO();

		Boolean isDelete = userDAO.delete("나문희");
		System.out.println("isDelete : " +isDelete);
		
		if(isDelete == false) {
			System.out.println("구매테이블에 이력이 남아있을 수 있습니다.");
		}

		// insert 확인
//		UserDTO dto = new UserDTO("야스오", 2023, "부산", "010-0101-1010");
//
//		// =========================================================
//
//		int updateRowCount = userDAO.update(dto, dto.getUserName());
//		System.out.println("updateRowCount : " + updateRowCount);

		// =======================================================

//		int rowCount = userDAO.insert(new UserDTO("나문희", 1959,"서울","010-3333-3333"));
//		System.out.println("rowCount : " + rowCount);

		// 만들고 싶은 기능
		// 데이터베이스 접근해서 userTBL에 대한 정보
		// 데이터베이스 접근해서 buyTBL에 대한 정보

		// 인터페이스 먼저 구현
		// ========================================

//		ArrayList<UserDTO> list = userDAO.select();
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUserName());
//			System.out.println(list.get(i).getBirthYear());
//			System.out.println(list.get(i).getAddr());
//			System.out.println(list.get(i).getMobile());
//			System.out.println("-------------------------");
//		}

	}// end of main

}// end of class

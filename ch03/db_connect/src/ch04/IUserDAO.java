package ch04;

import java.util.ArrayList;

public interface IUserDAO {

	// 멤버 TBL 전체 조회 기능
	// 결과값을 메인함수에서 리턴받게 하고싶다.
	// void는 안에서만 돌고 리턴하는 기능이없음
	ArrayList<UserDTO> select();
	// 위 녀석을 구현하는 클래스 필요함 (UserDAO)
	
	// return타입 받아도되고 안받아도됨
	// user 정보 삽입 기능
	int insert(UserDTO dto);
	
	// user 정보 수정 기능
	// sql에서 UPDATE구문은 오류 안나고 다 성공이라고 떠서
	// 몇개 성공했는지 받아줄려고 int 반환
	// WHERE 절에 들어가는 녀석이 뭔지 적어주기 (targetUserName)
	int update(UserDTO dto, String targetUserName);
	
	// user 정보 삭제 기능
	boolean delete(String username);

}

package com.tenco.myblog.service;

import com.tenco.myblog.dao.UserDAO;
import com.tenco.myblog.dto.UserDTO;

//서비스의 개념
	// 레스토랑이나 점원이 있는 음식점을 감
	// 점원이 우리한테 서비스 제공
	// (주문받고, 물주고, 디저트 제공하는 일을 함) <- 이걸 통으로 묶으면 서비스라 봄
	// 고객응대 서비스, 컨설팅 서비스 등
	// 유저 서비스는 일을 담당하는 녀석들인데
	// 회원가입기능, 로그인, 회원탈퇴, 이름바꾸는 기능들을 묶어서 서비스라고 부를거임
	// 사용자와 관련된 로직들을 처리

	// 흐름 : Controller -> service객체 -> DAO

public class UserService {

	private UserDAO dao;
	
	public UserService() {
		dao  = new UserDAO();	//heap 메모리 영역에 태어났음
	}
	
	// 회원 가입 로직 처리
	public String signUp(UserDTO user) {
		String msg = "";
		// 사용자가 던진 값이 유효한지 확인하는 것을 validation 처리라고 한다.
		// 회원가입할 때 사용자가 이름 안넣고 요청하는 경우
		// 비밀번호 사이즈 확인 <- 이런것도 서비스로 묶을 수 있음
		if(user.getUserName().equals("")) {
			msg = "사용자 이름을 입력해주세요.";
			System.out.println(msg);
			return msg;	//실행의 흐름이 반환된다. 내가 호출한 코드로 돌아간다.
		}
		// userRole이라는 개념은 사용자가 알필요 없음
		// 그러므로 여기서 직접 만들어줌
		// 사용자 계정인지 관리자 계정인지 모르니까 프로그램에서 세팅해주는거
		user.setUserRole("USER");	
		int resultRow = dao.saveUser(user);
		
		return resultRow + "";	// 자동으로형변환
	}
	
	// 회원정보 찾기 - 로그인 로직 구현
	public UserDTO checkUser(String username, String password) {
		boolean isValid =true;
		if(username.equals("")) {
			isValid = false;
		}else if(password.equals("")) {
			isValid = false;
		}
		
		UserDTO userDTO = null;
		if(isValid) {
			userDTO = dao.selectUserByUserUsernameAndPassword(username, password);
		}
		dao.selectUserByUserUsernameAndPassword(username, password);
		
		return userDTO ;
	}
	
	
	
} // end of class

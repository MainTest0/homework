package com.tenco.myblog;

import com.tenco.myblog.controller.UserController;
import com.tenco.myblog.dto.UserDTO;

		//main -> UserController 생성 -> 기능 : 회원가입 기능, 로그인 기능
		// 회원가입할 때 필요한 데이터들 기입(유저이름, 닉네임, 이메일)
		// 로그인도 마찬가지로 유저 아이디와 pw, 두 정보가 맞으면 로그인 해주는 기능
		// UserController : 사용자와 관련된 요청 코드들을 여기에다가 처리할거임
		// 블로그도 블로그의 기능 1번게시물 보여주세요, 게시물 삭제해주세요 이런 요청을 받울 수 있음
		// dog 컨트롤러로 그룹화 시킬 수 있음
		// 서비스 패키지 만들기

public class MainTest1 {

	public static void main(String[] args) {

		// 회원가입 진행을 mysql 서버까지 보내야한다.
		UserDTO dto = new UserDTO("야스오", "5678", "b@nate.com", "부산"); 
		
		UserController controller = new UserController();
		
		String result = controller.requestSignUp(dto, "localhost");
		System.out.println(result);
		
		// 로그인 요청
//		UserDTO responseUser = controller.requestSignIn(dto.getUserName(), dto.getPassword());
//		if(responseUser == null) {
//			System.out.println("로그인 실패했습니다.");
//		} else {
//			System.out.println("당신은 인증된 유저가 맞습니다. 로그인 성공");
//		}
		
	}// end of main

}// end of class

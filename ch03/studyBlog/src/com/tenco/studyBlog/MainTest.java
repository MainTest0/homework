package com.tenco.studyBlog;

import Controller.UserController;
import DTO.UserDTO;

public class MainTest {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO("차무식", "1357", "musick@naver.com", "부산");
		UserController controller = new UserController();
//		String result = controller.requestSignUp(dto, "localhost");
//		System.out.println(result);
		
		UserDTO responseUser = controller.requestSignIn(dto.getUserName(),
				dto.getPassword());
		if(responseUser == null) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
	}
	
	

}

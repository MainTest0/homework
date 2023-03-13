package com.tenco.myblog.controller;

import com.tenco.myblog.dto.UserDTO;
import com.tenco.myblog.service.UserService;

// main -> UserController로 요청
public class UserController {
	// 외부에서 요청한 일을 수행하고 결과를 리턴한다.
	// 사용자 정보를 받아 회원가입 처리를 한다.

	// 회원가입 서비스 기능 구현하려면 userService가 가지고있음
	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}

	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원가입이 안됩니다.";

		if (host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}
	// 로그인 요청 기능
	public UserDTO requestSignIn(String username, String password) {
		UserDTO responseUserDTO = userService.checkUser(username, password);
		
		return responseUserDTO;
	}

}// end of class

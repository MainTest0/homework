package Controller;

import DTO.UserDTO;
import Service.UserService;

public class UserController {
	
	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서 회원가입이 안됩니다.";
		
		if(host.equals("localhost")) {
			response = userService.signUp(user);
		}
		
		return response;
	}

	public UserDTO requestSignIn(String username, String password) {
		UserDTO responseUserDTO = userService.Login(username, password);
		
		return responseUserDTO;
	}
	
}

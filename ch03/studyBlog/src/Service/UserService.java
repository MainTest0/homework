package Service;

import DAO.UserDAO;
import DTO.UserDTO;

public class UserService {
	
	private UserDAO dao;
	
	public UserService() {
		dao = new UserDAO();
	}
	// 회원가입
	public String signUp(UserDTO user) {
		String msg = "";
		
		if(user.getUserName().equals("")) {
			msg="사용자 이름을 입력해주세요.";
			System.out.println(msg);
			return msg;
		}
		user.setUserRole("USER");
		int row = dao.saveUser(user);
		
		return row + "";
	}
	
	// 로그인
	public UserDTO Login(String username, String password) {
		boolean isLogin = true;
		if(username.equals("")) {
			isLogin = false;
		}else if(password.equals("")) {
			isLogin = false;
		}
		
		UserDTO dto = null;
		if(isLogin) {
			dto = dao.selectUserNameAndPassword(username, password);
		}
		dao.selectUserNameAndPassword(username, password);
		
		return dto;
	}
	
	public UserDTO serviceLogin(String username, String password) {
		boolean isLogin = true;
		if(username.equals("")) {
			isLogin = false;
		}else if(password.equals("")) {
			isLogin = false;
		}
		UserDTO dto = null;
		if(isLogin) {
			dto = dao.selectUserNameAndPassword(username, password);
		}
		dao.selectUserNameAndPassword(username, password);
		
		return dto;
	}

} // end of class

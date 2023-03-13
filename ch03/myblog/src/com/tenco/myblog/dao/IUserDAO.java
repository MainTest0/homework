package com.tenco.myblog.dao;

import com.tenco.myblog.dto.UserDTO;

public interface IUserDAO {

	// 가독성을 높이기 위해서 DTO에서 만들기
	// 인터페이스안에는 추상 메서드만 사용가능 하다.
	
	int saveUser(UserDTO user);
	//사용자 찾기
	UserDTO selectUserByUserUsernameAndPassword(String username, String password);
	

}
package com.tenco.myblog.dao;

public interface IBlogDAO {
	// 이녀석이 하는일을 표준화 시키고 싶다. -=> 인터페이스
	
	int save(String title, String content, int userId);
	void select();
	void update();
	void delete(int boardId);

}

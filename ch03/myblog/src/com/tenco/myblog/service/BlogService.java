package com.tenco.myblog.service;

import com.tenco.myblog.dao.BlogDAO;
import com.tenco.myblog.dto.BlogDTO;

public class BlogService {
	// dao를 부르는 녀석

	BlogDAO blogdao;

	public BlogService() {
		blogdao = new BlogDAO();
	}

	// 블로그 저장 기능 로직 구현
	public int saveBoard(String title, String content, int userId) {
		// 방어적코드
		// 타이틀이 공백이라면, 또는 사이즈가 2미만이면
		int resultRowCount = 0;
		if (title.equals("") || title.length() < 2) {
			// 메서드의 흐름을 종료 처리
			return resultRowCount;
		}
		resultRowCount = blogdao.save(title, content, userId);
		return resultRowCount;
	}

	// 게시글 삭제하는 로직 구현
	public void deleteByBoardId(int boardId, int userId) {
		BlogDTO blogDTO = selectByBoardId(boardId);
		if (userId == blogDTO.getUserId()) {
			blogdao.delete(boardId);
		}

		// 삭제하려는 컨텐츠가 직접 쓴 글이 맞는지 확인하는 과정 필요

		// 삭제요청 쿼리 작성 예정
	}

	// 하나의 게시글을 찾는 로직 구현
	public BlogDTO selectByBoardId(int boradId) {
		// blogDAO에서 select기능 호출 예정
		// 응답은 resultset에 담겼다가 이 녀석을 우리는 편하게 쓰기위해서
		// 클래스화하는 연습함
		// 데이터베이스에서 응답하는 녀석을 클래스화하기위해서는
		// blogDTO를 설계하는게 편하다.

		BlogDTO blogDTO = null;

		return blogDTO;

	}

}// end of class

package com.tenco.myblog;

import com.tenco.myblog.controller.BlogController;
import com.tenco.myblog.controller.UserController;
import com.tenco.myblog.dto.UserDTO;

public class MainTest2 {
	public static void main(String[] args) {
		
		UserDTO dto = new UserDTO("티모", "5678", "b@naver.com", "부산");
		// 출발은 객체가 생성해서 던질 때 함
		// 서비스를 만들어놓아서 응답받을 수 있다.
		// 이 말이뭐냐면 유저컨트롤러 기능으로 로그인 요청가능함
		UserController userController = new UserController();
		// 넘겨받아야할 데이터만 딱 담길거에요
		// 값 넘어오면 데이터베이스에서는 유저아이디가 3번이다.
		// 준비물이 유저아이디가 필요하다
		// 이상황이 마치 로그인 성공과 같다.
		// 로그인 성공
		BlogController blogController = new BlogController();
		UserDTO loginUser = userController.requestSignIn("티모", "5678");
		System.out.println("userId : " + loginUser.getId());
		if(loginUser.getId() != 0) {
			// 로그인 한 사용자가 맞다면 requestsaveboard에서 
			int response = blogController.reqSaveBoard("MVC 패턴의 이해2" , "Model-View-Controller" , loginUser.getId());
			if(response == 0) {
				System.out.println("글쓰기에 실패 하였습니다.");
			}else {
				System.out.println("글쓰기에 성공 하였습니다.");
			}
		}
		
		// 필요한 컬럼 : 아이디, 타이틀, 컨텐트, 리드카운트, 유저아이디
		// 타이틀 넘겨줄거고 내용 컨텐트 넘겨주면되고
		// 리드카운트도 지금 글쓸 때 필요없음
		// 유저아이디는 필요함(누가 글작성하는건지)
		// 필요한거 userId, title, content
		// 1. String으로 하나씩 지정
		// 2. 클래스를 만들어서 넘기는 방법

	}// end of main
}// end of class

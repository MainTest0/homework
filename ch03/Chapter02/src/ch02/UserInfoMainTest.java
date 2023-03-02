package ch02;

public class UserInfoMainTest {

	public static void main(String[] args) {
		// 기본 생성자는 사용자 정의 생성자가 있으면
		// 만들어 주지 않는다.

		UserInfo userInfo = new UserInfo();

		userInfo.userId = "아이디";
		userInfo.userName = "이름";
		userInfo.phone = "번호";

		UserInfo userInfo1 = new UserInfo("1234", "아이디", "이름");
		UserInfo userInfo2 = new UserInfo("아이디", "이름");
		UserInfo userInfo3 = new UserInfo("아이디");

		System.out.println(userInfo1.phone+ userInfo1.userId+ userInfo1.userName);
		System.out.println(userInfo2.userId+ userInfo2.userName);
		System.out.println(userInfo3.userId);
		
		

	}

}

package ch05;


// 클래스를 사용하는 쪽 코드 작성
public class UserMainTest {
	// 메인함수
	public static void main(String[] args) {
		
		// 메모리 올리고
		// 값을 할당
		// 화면에 값을 출력

		User user = new User();
		user.name = "이치승";
		user.age = 28;
		user.live = "김해";
		user.height = 186;
		user.weight = 75;

		System.out.println(user.name);
		System.out.println(user.age);
		System.out.println(user.live);
		System.out.println(user.height);
		System.out.println(user.weight);

	}// end of main

}// end of class

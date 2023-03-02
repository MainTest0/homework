package ch05;

public class MainTest2 {
	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		
		// new를 쓰게되면 객체생성한거고
		Warrior warrior1 = new Warrior();
		// 객체에 접근할 때는 . 연산자를 쓴다.
		// 멤버 변수의 값을 초기화(할당)하고 있다.
		warrior1.name = "티모";
		warrior1.power = 100;
		warrior1.color = "갈색";
		warrior1.height = 50;

		System.out.println(warrior1.name);
		System.out.println(warrior1.power);
		System.out.println(warrior1.color);
		System.out.println(warrior1.height);
		
		// 객체를 만든다 = 메모리에 올린다.
		System.out.println("======================");
		
		Warrior warrior2 = new Warrior();
		warrior2.name = "애쉬";
		warrior2.power = 120;
		warrior2.color = "파란색";
		warrior2.height = 100;

		System.out.println(warrior2.name);
		System.out.println(warrior2.power);
		System.out.println(warrior2.color);
		System.out.println(warrior2.height);
		
	} // end of main

} // end of class

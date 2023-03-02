package ch01;

public class MainTest01 {

	public static void main(String[] args) {

		//무엇이든 담을 수 있는 제네릭 프로그래밍
		// 자바 5.0 버전부터 사용하기 시작
		
		// 제네릭 프로그래밍을 사용하는 이유
		// 우리가 변수를 사용한다고 하면 변수에 항상 자료형을 먼저 지정하게 되어있다.
		// 하지만 같은 변수 이름하고 데이터 타입만 달라지는 경우를 만난다면
		// 제네릭 프로그래밍을 생각하자
		
		// ex) 아래 상황처럼 변수이름이 같은 경우가 생길 때
		// double result;
		// int result;
		// float result;
		// --> a.java, b.java, c.java 따로 파일을 만들어야 한다.
		
		// 하지만 제네릭을 이용하면 위와 같은 상황을 해결할 수 있다.
		// 다양한 자료형이 적용될 수 있는 클래스를 만드는 것이
		// 제네릭 프로그래밍 방식이라고 한다.
		
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDPrinter2 threeDPrinter2 = new ThreeDPrinter2();
		// 재료 넣기
		
		threeDPrinter2.setMaterial(plastic);
		//재료 꺼내보기
		Plastic usePlastic = (Plastic)threeDPrinter2.getMaterial();
		
		// Object <-- 불편한 점들이 존재한다.
		// 다운 캐스팅 처리를 해야하고
		// 런타임 시점에 잘못된 처리를 하게되면 예외를 발생시킬 수 있다.

	}// end of main

}// end of class

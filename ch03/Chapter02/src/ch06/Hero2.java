package ch06;

public class Hero2 {
	// 개발자들이 많이하는 실수

	// 1. 식을 바로 사용할 수 없다
	// 2. 메서드 선언을 중첩으로 할 수 없다.

	// public String getName() {
	// public void printArticle() {
	//
	// }
	// return this.name;
	// } <---메서드 안에 메서드를 선언할 수 없다, 중괄호의 범위를 잘 확인해야한다.

	// 3. 생성자에는 리턴타입이 없다.(선언부)

	// 클래스 스코프(범위) 안에 사용할 수 있는 문법
	// 변수 사용 가능
	// 생성자 사용 가능
	// 메서드 사용 가능
	// 함수 사용 가능
	// 내부 클래스 -> 추후 공개

	// 함수이다.
	public static int addNumber(int n1, int n2) {
		return n1 + n2;
	} // -> 클래스 스코프 범위 밖에는 문법을 작성할 수 없다.

	private String name; // = 1 + 2 * 3;<---사용 불가(메서드 안이나 생성자 안에서 연산 가능)
	private int hp;
	private int power;
	private double defense;
	private boolean die;
}
//함수이다.
//	public static int addNumber(int n1, int n2) {
//		return n1+n2;
//	} // -> 클래스 스코프 범위 밖에는 문법을 작성할 수 없다.
package ch08;

public class NumberPrinter2 {

	public static int waitNumber;
	private int id;
	
	public NumberPrinter2(int id) {
		this.id = id;
		//this.waitNumber = 1;		//노란줄(경고) : 객체가 생성될 때 동작하는 코드
	}
	
	public void printWaitNumber() {
		System.out.println(" 대기 순번 : " + waitNumber);
		waitNumber++;
	}
	
	// static이 붙으면 함수라고 생각하자.
	// static 메서드 안에서는 멤버 변수를 사용할 수 없다.
	// 이유 : 객체가 메모리에 올라 갔다라는 보장을 하지 못하기 때문이다.
	public static int getWaitNumber() {
		// id = 100;
		return waitNumber;
	}
	
	// 테스트 코드(노란밑줄)
	
	public static void main(String[] args) {
		// 정적(static) 변수는 클래스 이름으로 접근 가능하다.
		NumberPrinter2.waitNumber++;
		NumberPrinter2.waitNumber++;
		NumberPrinter2.waitNumber++;
		System.out.println(NumberPrinter2.waitNumber);
		
		NumberPrinter2 numberPrinter2 = new NumberPrinter2(1);
		System.out.println(NumberPrinter2.waitNumber);
		System.out.println("======================");
		System.out.println(numberPrinter2.getWaitNumber());
		
		// 클래스 이름을 static 메서드에 접근해서 호출할 수 있다.
		// 객체가 생성되기 전에 사용이 가능하다.
		NumberPrinter2.getWaitNumber();
	}
	
}// end of class

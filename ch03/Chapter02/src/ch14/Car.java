package ch14;

public abstract class Car {

	/*
	 * 템블릿 메서드 패턴을 구현 핵심 run() 메서드 이다.
	 */
			
	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnoff() {
		System.out.println("시동을 끕니다.");
	}
	public abstract void wiper();

	public void washCar() {
		//아무것도 구현하지 않음 -> 일반 메서드이다.
	}

	// 실행의 흐름을 만들어 둔다.
	final public void run() {		// 메서드 앞에 final을 쓰면 재정의 할 수 없게 설계한다. -> final
		// 하위 클래스에서 재정의 될 수 없음
		startCar();
		drive();
		wiper();
		stop();
		turnoff();
		washCar();
	}
	
	
}

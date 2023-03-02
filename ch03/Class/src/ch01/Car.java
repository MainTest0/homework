package ch01;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine) {
		// 자동차 클래스는 엔진클래스에 의존한다.
		// 즉, 엔진 클래스가 있어야 생성된다.
		this.engine = engine;
	}
	
	public void start() {
		// 자동차가 가려면 먼저 엔진이 스타트 되야한다.
		engine.start();		//생성자에서 this안해주면 NPE 발생
		System.out.println("Car started");
	}

}

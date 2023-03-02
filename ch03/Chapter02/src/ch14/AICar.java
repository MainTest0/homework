package ch14;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 잡습니다.");

	}

	@Override
	public void wiper() {
		System.out.println("스스로 빗물 제거");

	}
	
	public void washCar() {
		System.out.println("스스로 세차를 합니다.");
	}

}

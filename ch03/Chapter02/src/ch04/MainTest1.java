package ch04;

public class MainTest1 {

	// 코드의 시작점
	public static void main(String[] args) {

		Bus bus = new Bus(100);
		bus.run();
		bus.take(1); // 태우다
		bus.take(1); // 태우다
		bus.take(3); // 태우다
		bus.takeOff(1); // 내리기
		bus.showInfo();

		Subway subway = new Subway(2);
		subway.run();
		subway.take(5);
		subway.takeOff(2);
		subway.showInfo();

	}// end of main

}// end of class

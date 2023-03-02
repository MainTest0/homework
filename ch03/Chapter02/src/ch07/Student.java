package ch07;

public class Student {

	// James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
	private String name;
	private int money;
	// James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.

	// Tomas는 10000원을 가지고 있었고, 1호선 지하철을 타면서 1200원을 지불합니다.

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(name+"의 남은 돈 : " + this.money);
	}

}

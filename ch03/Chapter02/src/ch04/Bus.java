package ch04;

public class Bus {

	// 상태
	// 버스번호, 승객 수, 수익금

	int busNumber; // 버스 호선
	int passangerCount; // 승객수
	int money; // 수익금

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 기능
	// 달린다
	public void run() {
		System.out.println("버스가 출발합니다.");
	}

	// 승차 시키다
	public void take(int count) {
		System.out.println("승객을 태웁니다.");
		// this.passangerCount++;
		// this.money += 1_000;

		this.passangerCount += count;
		this.money += (count * 1_000);
	}

	// 하차 시키다
	public void takeOff(int count) {
		this.passangerCount -= count;
		System.out.println(count + "명의 승객이 내립니다.");
	}

	public void showInfo() {
		System.out.println("상태 창");
		System.out.println("버스 번호 : " + this.busNumber+"번");
		System.out.println("승객 수; " + this.passangerCount);
		System.out.println("수익금 ; " + this.money);

	}

}

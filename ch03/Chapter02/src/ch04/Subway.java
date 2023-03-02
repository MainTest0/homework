package ch04;

public class Subway {

	// 상태
	int lineNumber; // 지하철 호선
	int passangerCount; // 승객수
	int money; // 수익금

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	// 기능
	// 달린다
	public void run() {
		System.out.println("지하철이 출발합니다.");
	}

	// 승차 시키다
	public void take(int count) {
		System.out.println(count + "명의 승객이 탑니다.");
		this.passangerCount += count;
		this.money += (count * 1_350);
	}

	// 하차 시키다
	public void takeOff(int count) {
		System.out.println(count + "명의 승객이 내립니다.");
		this.passangerCount -= count;
	}

	public void showInfo() {
		System.out.println("상태 창");
		System.out.println("지하철 호선 정보 ; " + this.lineNumber+"호선");
		System.out.println("지하철 승객 수; " + this.passangerCount+"명");
		System.out.println("지하철 수익금 ; " + this.money+"원");
	}
	// 기능
}

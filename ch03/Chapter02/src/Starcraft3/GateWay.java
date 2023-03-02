package Starcraft3;

public class GateWay {

	private String name;

	public GateWay() {
		this.name = "게이트웨이";
	}
	
	// 배열 ( 자료구조 ) - new Zealot을 하나하나씩 넣기위함
	// 질럿 생산 하기
	public Zealot[] createZealot(int count) {
		// 배열 생성
		Zealot[] arr = new Zealot[count];
		System.out.println("질럿을 생산 합니다.");
		// index 값
		// 모든 프로그래밍에서 index 시작은
		// 0번부터 시작한다.
		for (int i = 0; i < count; i++) {
			arr[i] = new Zealot("질럿1");
		}

		return arr;
	}

	// 드라군 생산 하기

}

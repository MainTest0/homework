package Starcraft3;

public class GateWayMainTest {

	public static void main(String[] args) {

		GateWay gateway1 = new GateWay();
		Zealot[] zealots = gateway1.createZealot(30);
		System.out.println(zealots[0]);
		System.out.println(zealots[12]);
		System.out.println(zealots[25]);



	}

}

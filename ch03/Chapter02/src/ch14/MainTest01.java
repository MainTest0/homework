package ch14;

public class MainTest01 {

	public static void main(String[] args) {
		
		Car aicar = new AICar();
		aicar.run();
		System.out.println("======================");
		ManualCar manualCar = new ManualCar();
		manualCar.run();

	}

}

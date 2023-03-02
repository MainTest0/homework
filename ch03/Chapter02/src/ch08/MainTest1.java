package ch08;

public class MainTest1 {
	// 메인 함수 코드의 시작점
	public static void main(String[] args) {
		
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(1);
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		System.out.println("========================");
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();

	}// end of main

}// end of class

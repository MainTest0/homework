package ch03;

public class GenericPrinterMainTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 사용 방법
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		
		// 재료 넣기
		// 최상위 클래스인 Object를 활용하는 것보다 안정적인 코드를 만들 수 있다.
		// 또한 가독성도 높여준다.
		//gericPrinter.setMaterial(plastic);		// 컴파일 시점에 오류가 남
		
		genericPrinter.setMaterial(powder);
		
		// 재료 꺼내기
		// 다운 캐스팅을 할 필요가 없다.
		Powder userPowder = genericPrinter.getMaterial();
		//Plastic userPowder = genericPrinter.getMaterial();		// 잘못된 데이터 타입을 대입하면 컴파일 시점에 오류를 잡아준다.
		// 결론 : 보다 가독성 높고 안정적인 프로그래밍을 만들 수 있다.
		// 어떨 때 ?  : 같은 변수 이름, 같은 기능 이라면 제네릭으로 프로그램을 설계하면 된다.
	}

}

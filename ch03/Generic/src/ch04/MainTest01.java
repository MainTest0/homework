package ch04;

public class MainTest01 {

	public static void main(String[] args) {

		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		//	GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();		// water클래스에 Material을 상속안받아서 오류남

		// 재료넣기
		genericPrinter1.setMaterial(new Powder());
		genericPrinter2.setMaterial(new Plastic());
		
		// 문제
		// 제네릭을 활용한 프로그램을 작성하고 테스트 해주세요
		// 크게 코드 안짜도 됨

	}

}

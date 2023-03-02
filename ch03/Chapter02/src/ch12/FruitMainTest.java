package ch12;

public class FruitMainTest {
	public static void main(String[] args) {
		// 다양한 형태로 클래스(타입) 바라 볼 수 있다.
		Fruit fruit1 = new Banana(); // 업 캐스팅
		// 부모타입으로 선언되었지만 자식상태로 유한 상태
		// 컴파일 시점에는 컴파일러가 앞에 선언된 데이터 타입만 확인한다.
		Fruit fruit2 = new Peach();

		Fruit[] fruits = new Fruit[2];
		fruits[0] = fruit1;
		fruits[1] = fruit2;

		// 다운 캐스팅 개념을 알자!!

		String bananaOrigin = ((Banana) fruit1).origin; // 강제 형 변환과 같다. = 다운캐스팅 한다.
		System.out.println("다운캐스팅 된 값 확인 : " + bananaOrigin);

		// 반복문
		for (int i = 0; i < fruits.length; i++) {
			fruits[i].showInfo();

			if (fruits[i] instanceof Banana) {
				String origin = ((Banana) fruits[i]).origin;
				System.out.println("바나나 원산지는 : " +origin);
			}
			// 바나나이면 원산지를 출력하시오.
//			if(fruits[i] == fruit1) {		//여기 주소값이랑 여기 주소값이 같니라고 물어보는거
//				System.out.println(((Banana)fruit1).origin);
//			}
			System.out.println("===============");
		}

	}// end of main
}// end of class

package ch03;

//새로운 기법을 배울 때
// 문법 HOW에 대한 부분
// 사용하는 이유 WHY
// Type 의 약자 T
public class GenericPrinter <T>{
	
	// T라는 대체 문자를 사용한다.(데이터 타입이 정해지지 않았을 때)
	// E는 Element의 약자로 쓰고
	// K는 Key
	// V는 Value
	// 아무 문자열 다 가능하다.
	// 제네릭 자료형이라고 부른다.
	private T material;		//T 자료형으로 선언한 변수 : material
	
	// 제네릭 메서드라고 부른다.
	// 풀어서 설명하면 자료형을 반환하는 제네릭 메서드
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
}

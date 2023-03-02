package ch11;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		// 부모클래스에 사용자 정의 생성자가 있다면
		// 부모클래스르 반드시 호출 해야한다.
		// 아래코드 오류 : 부모 정의 생성자가 있으면 먼저 호출해줘야한다.
		//	System.out.println("111111111");
		// super키워드를 먼저 써야지 추가적인 코드를 쓸 수 있다.
		super(name, hp);		//super() : 부모클래스를 호출하는 메서드이다.
		System.out.println("Warrior 생성자 마지막 줄 코드");
	}
	
	public void ComboAttack() {
		System.out.println(name+"가 2단 공격을합니다.");
	}
	// 테스트 코드
	public static void main(String[] args) {
		Warrior war = new Warrior("야스오", 100);
		war.ComboAttack();
		
		// 메서드 오버로딩
		// System.out.println이다.
		// 어떤 데이터 타입을 담을지 미리 설계 되어있다.
		
	}
}

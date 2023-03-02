package ch13;


// 추상 메서드를 포함하면 강제성이 생긴다
// 추상 메서드를 포함한 클래스는 반드시 추상 클래스가 되야한다.
public abstract class Animal {

	// 추상 클래스란? (abstract class)
	// 하나 이상의 추상 메서드를 포함하거나 abstract 
	// 키워드를 가진 클래스를 추상 클래스라고 한다.
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	// abstract : 추상 메서드이다.
	public abstract void hunt();	// 추상 메서드 {}없는것
	
	
}

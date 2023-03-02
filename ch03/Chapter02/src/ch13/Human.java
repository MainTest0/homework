package ch13;

public class Human extends Animal{

	@Override		//어노테이션 (주석 + 힌트)
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("휴먼이 사냥을 합니다.");
	}
	
	// 추상 메서드를 포함하고있으면 그 클래스는 추상 클래스가 되야한다.
	// Animal 추상클래스를 상속받았기 때문에 Human 클래스도 추상메서드가 존재한다.
	
	// 추상 클래스를 상속받는법
	// 1. 추상 메서드를 포함한 추상 클래스를 상속하면 자식 클래스도 추상클래스로 만든다.
	//public abstract class Human extends Animal{
	// 2. 부모 클래스에 있는 추상 메서드를 자식 클래스에서 일반 메서드로 재구현한다.
//	@Override		//어노테이션 (주석 + 힌트)
//	public void hunt() {
//		// TODO Auto-generated method stub
//		System.out.println("사람이 사냥을 합니다.");
//	}

}// end of class

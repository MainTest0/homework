package ch11;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}
	
	void FireArrow() {
		System.out.println(name+"가 불화살 공격합니다.");
	}
	
}

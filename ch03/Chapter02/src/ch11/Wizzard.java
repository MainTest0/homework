package ch11;

public class Wizzard extends Hero{

	public Wizzard(String name, int hp) {
		super(name, hp);
	}

	void Freezing() {
		System.out.println(name+"가 얼음공격을 합니다.");
	}
	
	
}

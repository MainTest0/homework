package ch11;

public class Hero {

	protected String name;
	int hp;

	public Hero(String name, int hp) {
		System.out.println("Hero 클래스 생성합니다.");
		this.name = name ;
		this.hp = hp;
	}

	protected void attack() {
		System.out.println("기본공격 합니다.");
	}
	
}

package ch06;

public class Hero {
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die;
	// boolean은 get, set을 만들 때 -> is라고 쓰는게 일반적이다 ex) isDie

	// get메서드 직접 만들어 보세요(5개)
	public String getName() {
		return name;
	}
	public int gethp() {
		return this.hp;
	}
	public int getpower() {
		return power;
	}
	public double getdefense() {
		return defense;
	}
	public boolean getdie() {
		return die;
	}

	// set메서드 직접 만들어 보세요(5개)

	public void setName(String name) {
		this.name = name;
	}
	public void sethp(int hp) {
		this.hp = hp;
	}
	public void setpower(int power) {
		this.power = power;
	}
	public void setdefense(double defense) {
		this.defense = defense;
	}
	public void setboolean(boolean die) {
		this.die = die;
	}
	
	// 방어적 코드도 추가해보세요
	
	public void setB(int hp, boolean die) {
		if(hp < 0) {
			System.out.println("체력이 부족합니다.");
		}
		if(die == true) {
			System.out.println("캐릭터가 죽었습니다.");
		}
	}
	

}

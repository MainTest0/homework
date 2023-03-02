package Starcraft;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	public Zealot(String name) { // 생성자
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	// getter 메서드 만들기
	public int getPower() {
		return this.power;
	}

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	// 질럿이 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
		System.out.println("질럿이 저글링을 공격합니다.");
		zergling.beAttacked(this.power);

	}

	// 질럿이 마린을 공격합니다. //12마리
	// 질럿 공격력은 현재 5
	public void attackMarine(Marine marine) {
		marine.beAttacked(this.power);
	}

	// 자기 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		if(this.hp <= 0) {
			System.out.println(this.name+"이 사망하였습니다.");
			return;		//리턴 키워드는 값을 반환할 때 사용할 수 있고, 실행의 종료를 시킬 수도 있다.
		}
		System.out.println(this.name + "이 공격을 당합니다.");
		this.hp -= power;
	}

	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}
}

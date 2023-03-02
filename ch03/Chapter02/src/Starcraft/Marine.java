package Starcraft;

public class Marine {
	private String name;
	private int hp;
	private int power;

	public Marine(String name) {
		this.name = name;
		this.hp = 70;
		this.power = 4;
	}

	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	// getter 메소드 만들기
	public int getHp() {
		return this.hp;
	}

	// 마린이 질럿을 공격합니다.
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name+"이"+zealot.getName()+"을 공격합니다.");

	}

	// 마린이 저글링을 공격합니다
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name+"이"+zergling.getName()+"을 공격합니다.");
	}

	// 자기 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		if(this.hp <= 0) {
			System.out.println(this.name+"이 사망하였습니다.");
			return;		//리턴 키워드는 값을 반환할 때 사용할 수 있고, 실행의 종료를 시킬 수도 있다.
		}
		System.out.println(this.name + "이 공격을 당합니다.");
		this.hp -= power;
		
	}public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println("이름 : "+this.name);
		System.out.println("공격력 : "+this.power);
		System.out.println("생명력 : "+this.hp);
	}
}

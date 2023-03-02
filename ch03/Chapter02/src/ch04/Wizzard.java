package ch04;

import java.util.Random;

// 마법사 클래스 설계하기

// 마나가 없어요 마나채우기
// 공격스킬
public class Wizzard {
	int HP = 480;
	int MP = 230;
	int power = 12;
	int damage = 12;
	int damageSum = 0;

	Random rand = new Random();

	// 상태
	// 레벨, 파워, 체력, 마나
	public Wizzard() {
		int randomAttack = rand.nextInt(30);
		this.HP -= randomAttack;
		System.out.println(randomAttack + "의 데미지를 입었다");
	}

	// 기능
	// 기본공격(마나x), q스킬(마나), r스킬(궁)
	public void basicAttack() {
		System.out.println("===========기본공격================");
		System.out.println("기본공격");
		this.MP += 7;
		System.out.println(damage + "데미지");
		this.damageSum += damage;
		System.out.println("마나 7회복");
	}

	public void skillQ() {
		if (this.MP < 55) {
			System.out.println("===============================");
			System.out.println("마나가 없습니다.");
		} else {
			System.out.println("===========Q스킬================");
			System.out.println("불공격");
			this.MP -= 55;
			this.damage = 37;
			System.out.println(damage + "데미지");
			this.damageSum += damage;
		}
	}

	public void skillR() {
		if (this.MP < 130) {
			System.out.println("===============================");
			System.out.println("마나가 없습니다.");
		} else {
			System.out.println("===========R스킬================");
			System.out.println("얼음공격");
			this.MP -= 130;
			this.damage = 210;
			System.out.println(damage + "데미지");
			this.damageSum += damage;
		}
	}

	public void showInfo() {
		System.out.println("===========상태창================");
		System.out.println("현재 체력 : " + this.HP);
		System.out.println("남은 마나 : " + this.MP);
		System.out.println("나의 공격력 : " + this.power);
		System.out.println("총 입힌 데미지 : " + this.damageSum);
		System.out.println("===============================");
	}

}// end of class

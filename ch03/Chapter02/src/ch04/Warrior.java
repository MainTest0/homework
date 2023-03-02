package ch04;

import java.util.Random;

// 전사 클래스 설계하기

// 마나가 없어요 마나채우기
// 공격스킬
public class Warrior {
	int HP = 650;
	int MP = 110;
	int power = 27;
	int damage = 27;
	int damageSum = 0;

	Random rand = new Random();

	// 상태
	// 레벨, 파워, 체력, 마나
	public Warrior() {
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
		if (this.MP < 30) {
			System.out.println("===============================");
			System.out.println("마나가 없습니다.");
		} else {
			System.out.println("===========Q스킬================");
			System.out.println("올려치기");
			this.MP -= 30;
			this.damage = 28;
			System.out.println(damage + "데미지");
			this.damageSum += damage;
		}
	}

	public void skillR() {
		if (this.MP < 80) {
			System.out.println("===============================");
			System.out.println("마나가 없습니다.");
		} else {
			System.out.println("===========R스킬================");
			System.out.println("내려꽂기");
			this.MP -= 80;
			this.damage = 178;
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

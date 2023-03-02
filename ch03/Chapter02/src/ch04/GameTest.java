package ch04;

public class GameTest {

	public static void main(String[] args) {

		Warrior wor = new Warrior();

		wor.skillQ();
		wor.skillR();
		wor.skillQ();
		wor.basicAttack();
		wor.showInfo();

		Wizzard wid = new Wizzard();
		wid.skillQ();
		wid.skillR();
		wid.basicAttack();
		wid.showInfo();

	}

}

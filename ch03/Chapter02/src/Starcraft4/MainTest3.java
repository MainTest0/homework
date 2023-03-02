package Starcraft4;

public class MainTest3 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("돌격대장 질럿1");
		Marine marine1 = new Marine("귀신 잡는 해병은 아님");
		Zergling zergling1 = new Zergling("저글링");
		
		
		
		zealot1.attack(marine1);
		marine1.showInfo();

	}

}

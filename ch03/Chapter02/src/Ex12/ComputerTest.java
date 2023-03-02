package Ex12;

public class ComputerTest {

	public static void main(String[] args) {

		Computer my = new MyNoteBook();
		Computer desc = new DeskTop();
		
		Computer[] computers = new Computer[300];
		
		computers[0] = new DeskTop();
		computers[1] = new DeskTop();
		computers[2] = new MyNoteBook();
		
		// computers.length : 300개
		for(int i = 0; i < computers.length; i++) {
			if(computers[i] != null) {
				computers[i].display();
				if(computers[i] instanceof MyNoteBook) {
					System.out.println("좋은 노트북을 구매했네요");
				}
			}
		}
		
//		my.turnOn();
//		my.turnOff();
//		my.typing();
//		my.display();
//		desc.display();
//		desc.typing();

		
	}	// end of main

}	// end of class

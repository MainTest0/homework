package ch13;

public class MainTest1 {

	public static void main(String[] args) {

		// 기본적으로 추상 클래스는 new 할 수 없다.
		// abstract 키워드를 쓰면 강제성이 붙는데
		// 개발자한테 직접 new를 막아 버린다.
		// 현실세계처럼 적용하는거와 같다.
		// ex) 롤을 생각했을 때
		// Hero라는 클래스를 설계했을 때 화면에 보여지면 안된다.
		// 화면에 보여지는거 : 가렌, 티모, 리븐
		// 리븐 클래스를 설계해서 Hero를 상속해야함.
		
		Animal animalHuman = new Human();
		animalHuman.hunt();
		System.out.println("================");
		Animal animalPerson = new Person();
		animalPerson.hunt(); 		 	// 런타임 시점에 Person에 있는 메서드를 호출한다.
		
		
		// Animal animal = new Animal();		//오류 : 메모리에 올릴 수 없다.

	}	//end of main

}	// end of class

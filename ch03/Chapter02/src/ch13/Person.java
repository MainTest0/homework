package ch13;

public class Person  extends Human{
	
	@Override
	public void hunt() {
		
		// super.hunt();		//	super. 부모클래스 안의 hunt 메서드를 호출
		// 굳이 왜 만들었을까?
		// Human에 hunt 메서드가 한줄이 아니라 천줄에 부모 메서드와 똑같아야 할 때
		// 소스 복붙한 다음 기능을 추가 해야 한다.
		// super.hunt(); 만 해주면 천줄을 복붙할 필요도없고 유지보수도 쉬워진다.
		
	}

}	//end of class

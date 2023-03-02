package ch04;

public class Powder extends Material{

	@Override
	public String toString() {
		return "재료는 파우더입니다.";
	}

	@Override
	public void doprinting() {
		System.out.println("powder 재료로 출력합니다.");
		
	}
	
}

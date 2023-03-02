package Ex06;

public interface Moveable {
	public abstract void left();

	public abstract void right();

	public abstract void up();

	// default 문법 사용해보기
	// 후크 메서드와 같음(구현부만 있고 로직은 없다.)
	// Moveable을 구현하는 클래스에서 필요하다면 재정의해서 사용해 !
	default public void down() {};

}

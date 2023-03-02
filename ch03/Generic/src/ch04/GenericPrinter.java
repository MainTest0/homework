package ch04;

//Material 클래스를 상속받은 애만 들어올 수 있음
public class GenericPrinter <T extends Material> {			

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	
}

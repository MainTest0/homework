package ch10;

public class A {
	String name;
	int height;
	int weight;
	int age;
	
	
	
	// 코드 테스트
	public static void main(String[] args) {
		
		C myc = new C();
		myc.age = 100;
		System.out.println(myc.age);
	}
	
} // end of A class

// 하나의 자바파일에는 public이 하나만 존재
// 하나의 자바파일에는 여러개의 class 만들 수 있음


class B {
	String name;
	int height;
	int weight;
	int age;
	
	int level;
	String nicName;
}// end of B class

class C extends A{
	
	String phone;
	
}





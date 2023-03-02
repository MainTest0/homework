package TestPackage3;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		
		// 문제 
		// d object에 있는 value값을 화면에 출력 해주세요
		System.out.println(a.b.c.d.value);
		for(int i = 0; i < a.b.c.d.arrayList.size(); i++) {
			System.out.println(a.b.c.d.arrayList.get(i));
		}
		
		for (String d : a.b.c.d.arrayList) {
			System.out.println(d);
		}

	}

}

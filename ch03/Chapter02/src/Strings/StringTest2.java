package Strings;

public class StringTest2 {
	public static void main(String[] args) {
		
		// 상수 풀이라는 개념을 이해했다 가정했을 때
		// 실제 주소값을 찍어보자
		// Student sKim = new Student();
		// System.out.println(sKim);  	<===주소값이 찍힘
		// 문자열은 값이 찍힘
		// Object 클래스 할때 확인
		
		String str1 = "반가워"; 							
		String str2 = new String("반가워"); 	
		String str3 = new String("반가워");	
		String str4 = "반가워"; 
		
		// 현재 String에 주소값을 찍어보는 방법을 모름
		
		System.out.println(System.identityHashCode(str1));				//상수풀 메모리 주소 (2024542466)
		System.out.println(System.identityHashCode(str4));				//상수풀 메모리 주소 (2024542466)
		System.out.println(System.identityHashCode(str2));				//heap 메모리 주소 (770189387)
		
		// 상수풀에 한번 생성된 문자열은 불변(immutable)이다.
		str4 = str4 + " 홍길동";
		System.out.println(System.identityHashCode(str4));				//상수풀 메모리 주소 (963522361)
		
		str1 += " 하이";
		System.out.println(System.identityHashCode(str1));				//상수풀 메모리 주소 (175408781)
		//한번 생성된 문자열 값은 변경이 불가능하다.
		// str1 += " 하이"; <- 상수 풀 영역에 새로 생성된다.
		
		// 가, 나 a, 가 다, 마 바.....<- 계속 상수 풀 영역에 메모리를 사용한다.
		// 그래서 메모리를 효율적으로 사용하기 위해서는
		// StringBuilder 클래스와, StringBuffer 클래스를 알아야한다.
		
		
		
	}// end of main
}// end of class

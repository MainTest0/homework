package Strings;

public class StringTest1 {
	public static void main(String[] args) {
		// 문자열이라는 데이터를 사용할 때

		String str1 = "반가워"; 							// 1번 방식 - 상수 풀 영역에 올라간다.
		String str2 = new String("반가워"); 	// 2번 방식 - heap에 메모리가 올라간다.
		String str3 = new String("반가워");	// str2와 str3는 주소값이 같을까요?	: no
		String str4 = "반가워"; 						// str1과 str4는 주소값이 같을까요?	: yes
		
		
		// 값을 출력해보자
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		// 1번 방식과 2번 방식은 메모리를 위치시키는 곳(영역)이 다르다.
		// == 연산은 값을 비교하는 연산자(기본 데이터 타입) , 클래스 타입은 주소값을 비교 한다.
		// 상수풀이라는 영역과 heap이라는 영역이 있다.
		// str2, str3는 heap 영역에 들어간다.
		// 상수풀 영역에는 같은 문자열이 있으면 같은 주소에 넣는다.
		// 결론 : 리터럴값으로 생성한 문자열은(str1, str4) 상수풀 영역에 올라가고
		// 		  동일한 문자열을 사용한다면 새로 생성하지 않고 재활용해서 사용한다.

		// 검증하기1
		if (str1 == str2) { // str1이랑 str2의 주소값이 같니?
			System.out.println("주소값이 같아요");
		} else {
			System.out.println("주소값이 달라요");
		}

		System.out.println("=================");
		// 검증하기2
		if (str2 == str3) { // str2이랑 str3의 주소값이 같니?
			System.out.println("주소값이 같아요");
		} else {
			System.out.println("주소값이 달라요");
		}
		
		System.out.println("=================");
		// 검증하기3
		if (str1 == str4) { // str1이랑 str4의 주소값이 같니?
			System.out.println("주소값이 같아요");
		} else {
			System.out.println("주소값이 달라요");
		}
		
		System.out.println("=================");
		// 검증하기4
		if (str1.equals(str4)) { // str1이랑 str4의 문자열 모양이 같니?
			System.out.println("문자열 모양이 같아요");
		} else {
			System.out.println("문자열 모양이 달라요");
		}
		
		
		
	}// end of main
}// end of class

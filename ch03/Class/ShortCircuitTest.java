package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {

		// 관계 : 논리곱 -- F->F, 논리합 : --T->T
		
		int num1 = 5;
		int i = 0;
		//                                               F                                    T
		boolean value = ( (num1 += 10) < 10 ) && ( ( i += 2 ) < 10 );
		System.out.println(value);
		System.out.println("=====================");
		
		// ShortCircuitEvolution(단축평가)
		// 곱 연산자 앞에서 F가 나왔기 때문에 뒤에있는 연산은 안한다.
		System.out.println(num1);
		System.out.println(i);
		

		System.out.println("=====================");
		//                               T                                T
		value = ( (num1 += 10) > 10 ) || ( ( i += 2 ) < 10 );
		// ShortCircuitEvolution(단축평가)
		// 합 연산자 앞에서 T가 나왔기 때문에 뒤에있는 연산은 안한다.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// 문제 ShortCircuitEvolution 평가 문제를 직접 2문제 만들어주세요.
		// 그리고 카페 도전과제 -> 실습 및 리뷰에 문제&답을 올려 주세요.
		System.out.println("=====================");
		
		// 관계 연산자와 증감연산자를 활용한 논리연산자 문제입니다.
		
		int a = 10;
		int b = 1;
		
		//                                               T                                     F
		boolean result = ( ( a++ ) <= 11 ) && ( ( b /= 10 ) > 0 );
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);	//앞에서 true가 나와서 뒤의 계산은 안함
		System.out.println("=====================");
		
		int a1 = 10;
		int b1 = 20;
		
		//                                                 T                                     F
		boolean result1 = ( ( a1 *= 10 ) <= 101 ) || (  ( b1 %= 10 ) > 0 );
		System.out.println(result1);
		System.out.println(a1);
		System.out.println(b1);	//앞에서 true가 나와서 뒤의 계산은 안함
		

	}// end of main

}// end of class

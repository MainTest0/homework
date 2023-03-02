package ch01;

public class TypeConversion {
	/* 여러줄 주석 
	 * 
	 * 
	 * 
	 * 
	 * */
	// 메인 함수 <-- 한 줄 주석
	public static void main(String[] args) {
		// 형변환
		// 1. 자동 형 변환
		// 2. 강제 형 변환
		
		int iNumber1 = 100;
		System.out.println(iNumber1);
		
		// 자동 형 변환 ( 묵시적 형 변환 )
		double dNumber1 = iNumber1;
		System.out.println(dNumber1);	//형이 변환 되었기때문에 자신에 맞는 형태로 출력 됨
		
		//문제 만들어보기
		
		//강제형변환
		// 쌍따옴표 - 문자열이라고 한다.
		System.out.println("==================================");
		double dNumber2 = 0.0012345;
		System.out.println(dNumber2);
		
		// 강제 형 변환
		// 강제 형 변환의 주의점
		// 개발자가 컴파일러한테 강제로 넣으라고 명령 - 데이터 소실발생
		int iNumber2 = (int)dNumber2;
		System.out.println(iNumber2);
		
		int iNumber3 = (int)10.9;		//강제 형 변환시 소수점 단위는 그냥 버림
		System.out.println(iNumber3);
		
		
		double a;
		int b;
		
		// 1번 a에 값 0.5를 담아보세요
		a = 0.5;
		System.out.println(a);
		// 2번 b에 값 10.5 리터럴 값을 담아보세요
		b = (int)10.5;
		System.out.println(b);
		//강제 형 변환시 데이터 손실이 생길 수 있다.
		
		
	} //end of main
}	// end of class

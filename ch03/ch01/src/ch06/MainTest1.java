package ch06;

public class MainTest1 {

	// 1. 리턴값이 int , 매개변수 n1, n2,n3, 이름이 intAdd
	// 2. 리턴값이 double 매개변수 n1, n2 이름은 doubleAdd
	// 3. 리턴값이 void, 매개변수는 String article, 이름은 printArticle

	static int intAdd(int n1, int n2, int n3) {
		// 지역변수
		//int result = n1 + n2 + n3;
		return n1+n2+n3;		// 매개변수를 활용해서 지역변수를 안쓰는 방법
	}

	static double doubleAdd(double n1, double n2, double n3) {
		double result = n1 + n2 + n3;
		return result;
	}

	static void printArticle(String article) {
		System.out.println(article);
	}

	// 테스트 - 실행코드 main
	public static void main(String[] args) {

		//int n1 = intAdd(1, 3, 5);
		System.out.println(doubleAdd(1,3,5));

		//double n2 = doubleAdd(10, 10, 0.5);
		System.out.println(doubleAdd(10,10,0.5));

		//System.out.println( printArticle("반가워") );		// 오류 : 리턴값이 없다, sysout안에 sysout을 또 쓰는거랑 같음
		
		printArticle("HI");

	}

}

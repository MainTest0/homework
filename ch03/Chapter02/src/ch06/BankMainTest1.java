package ch06;

public class BankMainTest1 {

	public static void main(String[] args) {

		Bank bankB = new Bank();
		bankB.deposit(10_000);
		bankB.withdraw(6_000);

		// 신입 개발자가 옴
		// 입,출금은 기능을 통해서 할 수 있게 해놓았음
		// 실수 -> 멤버 변수에 접근해서 수정

		// bankB.balance = 100_000; //private으로 balance를 선언하는 순간 외부에서 접근 불가

		// 실수 할 가능성이 생긴다.
		// 정보 출력 (4000원이 사라짐)
		bankB.showInfo();
		// 예방 : 접근제어 지시자를 할당한다.(private으로)

		// 현재 금액에 대한 정보만 받고 싶다면
		int currentMoney = bankB.getBalance(); // get 메서드 사용
		System.out.println("currentMoney : " + currentMoney);
		
		// set 메서드 사용해보기
		bankB.setBalance(-200_000);
		bankB.showInfo();
		// 실행의 흐름을 추가시킬 수 있다 = 메서드
		
		// get 메서드 사용해보기

	} // end of main

} // end of class

package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount(); // 잔액이 10만원 있는상태로 태어남

		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount); // 하나의 계좌를 아빠엄마가 공유하고있는 상황

		// 아버지 입금하기
		father.start(); // 아버지 클래스가 thread를 상속받아서 바로 start 가능

		mother.start();

		// 정상 처리 되려면 현재 10만원
		// 아빠 1만원 입금
		// 엄마 5천원 출금
		// 결과는 10만 5천원인 상태가 되야함

	}

}

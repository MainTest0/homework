package ch02;

// 공유하는 자원으로 만들기
// shared resource 상황을 구현해보자
// resource : 자원
// 계좌를 아버지나 어머니가 공유할 수 있는 상황이 될까요?
// 되죠 하나의 계좌를 서로 쓰고 있잖아요
// 생활통장이면 카드를 2개받아서 돈을 빼거나 넣거나
// shared resoruce상태가 될 수 있겠죠
// 아버지 클래스, 어머니 클래스 만들거임
// 밑에 만들고 코드 분리할거임
public class BankAccount {
	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 계좌의 기능 : 출금, 입금, 잔액 조회(getter, setter)
	// synchronized기능을 추가하는 순간 동기화 진행
	// 지금은 synchronized 기능을 왜해야하고 어떻게 구현하는지에 집중
	// 입금기능
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney(); // getMoney() = 현재 계좌 상황
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money); // 현재 계좌 잔액에서 5만원 넣으면 5만원 더해서 setMoney가 들어감
		System.out.println("입금 후 계좌 잔액 : " + getMoney());

	}// end of saveMoney
		// 출금기능

	public synchronized int widthDraw(int money) { // 얼마 출금할지 외부에서 주입
		// 출금할 떄 10만원 상태
		
		synchronized(this) {
			int currentMoney = getMoney();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (currentMoney >= money) {
				setMoney(currentMoney - money);		// 출금 금액 - 현재 금액
				System.out.println("출금후 계좌 잔액 : " + getMoney());
				return money;
			} else {
				System.out.println("잘못된 입력입니다.");
				return 0;
			}
		}
		
		
		
		

	}// end of widthDraw

}

class Father extends Thread{
	BankAccount account; // 계좌를 가짐
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 입금 시키기
		account.saveMoney(10_000);
	}
	
}

class Mother extends Thread{
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		// 출금 시키기
		account.widthDraw(5000);
	}

}
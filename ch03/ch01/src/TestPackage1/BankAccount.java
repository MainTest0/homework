package TestPackage1;

public class BankAccount {
	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 잔액은 : " + getMoney());
	}

	public synchronized void withdraw(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setMoney(currentMoney - money);
		System.out.println("출금 후 계좌 잔액은 " + getMoney());

	}

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount();

		Father f = new Father(bankAccount);
		Mother m = new Mother(bankAccount);

		f.start();
		m.start();

	}
}

class Father extends Thread {
	BankAccount ac;

	public Father(BankAccount ac) {
		this.ac = ac;
	}

	@Override
	public void run() {
		ac.saveMoney(10_000);
	}
}

class Mother extends Thread {
	BankAccount ac;

	public Mother(BankAccount ac) {
		this.ac = ac;
	}

	@Override
	public void run() {
		ac.withdraw(5000);
	}
}
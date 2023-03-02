package ch03;

import java.util.Scanner;

public class CoffeeMain {

	private static Coffee[] coffees = {
			new Coffee("아메리카노", 3000),
			new Coffee("카페라떼", 4000),
			new Coffee("카푸치노", 4500),
	};
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("고객 이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("고객 잔액을 입력하세요");
		int balance = sc.nextInt();
		Customer customer = new Customer(name, balance);
		
		System.out.println(">>>커피 메뉴<<<");
		for(int i = 0; i < coffees.length; i++) {
			System.out.println((i + 1)+". "+ coffees[i].getName()+"<"+coffees[i].getPrice()+"> 원");
		}
		
		System.out.println("커피를 선택하세요");
		int orderNumber = sc.nextInt();
		
		// 1, 2, 3 사용자가 보여지는 부분		<--- 0, 1, 2	실제로 저장되있는 인덱스
		// 어떤 커피를 선택하였는지 알 수 있는 코드를 작성해보면
		
		Coffee coffee = coffees[orderNumber - 1];
		// 고객이 커피를 시킴
		customer.buyCoffee(coffee);
		System.out.println("잔액 확인");
		System.out.println(customer.getBalance());
		sc.close();		// 메모리 해제
		
	}

}

package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest02 {

	public static void main(String[] args) {

		// 자료구조 선언
		ArrayList<Customer> list = new ArrayList<>();

		// 초기값 mydb로 되어있음
		// 데이터베이스는 mydb만 쓸 수 있음
		// set 만들어서 데이터베이스 바꾸는 기능 만들고싶음

		// 코드실행
		DBclient client = new DBclient();
		DBclient.setDB_NAME("shopdb"); // 권장사항은 클래스이름으로 접근해라
//		dbClient.setDB_NAME("shopdb");

		Connection conn = client.getConnection();
		try {
			Statement stmt;
			stmt = conn.createStatement();
			String queryStr = "SELECT * FROM customer";
			ResultSet rs = stmt.executeQuery(queryStr);
			while (rs.next()) {
				Customer customer = new Customer(rs.getInt("customer_id"), rs.getString("name"));
				list.add(customer);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println(list.get(i).getName());
		}

		// 담을 데이터를 클래스로 모델링 ArryList

	}// end of main

}// end of class

class Customer {
	private int id;
	private String name;

	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

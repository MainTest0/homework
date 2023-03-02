package ch08;

public class EmployeeMainTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setName("이순신");
		System.out.println(employee1.serialNum);
		
		Employee employee2 = new Employee();
		employee2.setName("홍길동");
		
		Employee employee3 = new Employee();
		employee3.setName("티모");

		System.out.println(Employee.serialNum);
		
		System.out.println(employee3.serialNum);		// 티모의 사원번호 : 3
		System.out.println(employee2.serialNum);		// 홍길동의 사원번호 : 3
																							// 고유의 사원번호를 가지려면? 변수를 써서 가장 먼저 실행되는 생성자에 
																							// 증감연산자가 실행된 후의 값을 변수에 넣어준다.
		
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee3.getEmployeeId());
		
	}

}

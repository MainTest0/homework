package ch03;

public class EmployeeDTO {
	
	// employee 테이블에서 데이터 긁어오기
	// sql에서 테이블 설계한거 살펴보기
	// DESC employees;
	int empNo;
	String birthDate;
	String firstName;
	String lastName;
	String gender;
	String hireDate;
	
	// 하고자하는거 : 파일을 통해서 정보를 insert,수정,삭제,조회하는 기능 만들기
	// 이런 CRUD기능은 기본적으로 만들어져있음
	// 어떤 기능을 더 만들면 좋을까 -> 인터페이스 써보자 (기능 표준 잡기)
	// 생성자
	public EmployeeDTO(int empNo, String birthDate, String firstName, String lastName, String gender, String hireDate) {
		super();
		this.empNo = empNo;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
	}
	
	// toString
	@Override
	public String toString() {
		return "EmployeeDTO [empNo=" + empNo + ", birthDate=" + birthDate + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", hireDate=" + hireDate + "]";
	}
	
	
	
	
	
}// end of class

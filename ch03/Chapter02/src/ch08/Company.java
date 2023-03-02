package ch08;

// 디자인 패턴
// 싱글톤 패턴 -> 객체 생성하는 코드의 사례
public class Company {
	// 싱글톤 패턴 만드는 방법
	// 1. 생성자를 private으로 선언한다.
	private Company() {
	}
	
	// 2. 자기 자신의 데이터 타입을 선언해준다.(private + static)
	private static Company company;
	
	// 3. 외부에서 접근 가능한 static 메서드를 만들어 둔다.
	public static Company getInstence() {
		// 4. 코드 구현하기
		if(company == null) {		//최초에 null이면
			company = new Company();		//객체 생성
		}
		return company; 
	}
	
}

package ch04;

// 데이터만 받는 녀석
// Data Trans Object
public class UserDTO {

	// DTO 설계
	String userName;
	int birthYear;
	String addr;
	String mobile;
	
	public UserDTO(String userName, int birthYear, String addr, String mobile) {
		this.userName = userName;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile = mobile;
	}

	public String getUserName() {
		return userName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public String getAddr() {
		return addr;
	}

	public String getMobile() {
		return mobile;
	}
	
	
	
}

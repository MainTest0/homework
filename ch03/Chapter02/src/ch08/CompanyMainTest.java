package ch08;

public class CompanyMainTest {

	public static void main(String[] args) {

		//Company company = new Company();		//사용 불가
		Company company = Company.getInstence();
		System.out.println(company);
		//ch08.Company@12c8a2c0
		Company company2 = Company.getInstence();
		Company company3 = Company.getInstence();
		System.out.println(company2);		//주소값이 다 똑같다.
		System.out.println(company3);		//닌자가 때리고 숨었다가 다시 때리러 나왔을 때 체력이 같기위한 느낌

	}

}

package ch04;

public class Student {
	
	// 상태
	String name;
	int grade;
	
	
	// 기능
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		System.out.println("학생의 이름은 : " +name);
		System.out.println("학생의 학년은 : " +grade);
	}
	
	
	public void eat() {
		System.out.println("급식 먹기");
	}
	public void rest() {
		System.out.println("쉬는시간");
	}
	public void study() {
		System.out.println("공부하기");
	}
	
	public void showInfo() {
		System.out.println("##상태창##");
		System.out.println(this.name+" 입니다.");
		System.out.println(this.grade+" 학년 입니다.");
	}
	

}

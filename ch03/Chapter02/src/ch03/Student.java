package ch03;

public class Student {

	int studentId;
	int grade;
	//참조 입니다.
	String name;
	//성적 (수강 과목이 계속 늘어나고 그 과목의 시험성적도 늘어나는경우
	// 클래스를 하나 더만들어서 클래스 자체가 데이터타입이 될 수 있다.
	//참조 타입
	Subject korea;
	Subject math;
	
	public Student(int studentId, int grade, String name) {
		this.studentId = studentId;
		this.grade = grade;
		this.name = name;
		
		this.korea = new Subject();
		this.math = new Subject();
	}
	// 메서드
	
	public void showInfo() {
		System.out.println("##상태창##");
		System.out.println(this.name+" : 입니다.");
		System.out.println(this.grade+" 1학년 입니다.");
		System.out.println(this.studentId+"  1번 입니다.");
		System.out.println(this.korea.subjectName+ "의 점수는 " +this.korea.score);
		System.out.println(this.math.subjectName+ "의 점수는 " +this.math.score);
	}
	
	
	
	// 학번
	// 이름
	// 국어 성적
	// 수학 숭적
	// 수강하는 과목

}

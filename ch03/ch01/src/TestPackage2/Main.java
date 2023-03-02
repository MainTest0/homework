package TestPackage2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// 학생 생성
		Student student1 = new Student(1, "Alice", "alice@example.com");
		Student student2 = new Student(2, "Bob", "bob@example.com");

		// 과정 생성
		Course course1 = new Course(1, "Math", "introduction to Mathatics");
		Course course2 = new Course(2, "English", "introduction to English");

		// 1번 학생이 수학과 영어 과정을 등록한다.
		Enrollment enrollment1 = new Enrollment(1, student1, course1);
		Enrollment enrollment3 = new Enrollment(1, student1, course2);
		// 2번 학생이 영어 과정을 등록한다.
		Enrollment enrollment2 = new Enrollment(2, student2, course2);

		// 학생의 데이터에 내가 등록한 정보를 저장 시킬 수 있다.
//		ArrayList<Enrollment> list = new ArrayList<>();
//		student1.setEnrollments(enrollment1);
//		// 통으로 list를 저장하는 녀석 쓸려면 ArrayList 선언해야됨
//		// 하나씩 기록하는 기능을 만들어야 한다.

		// 위 방식으로 안쓰고 학생의 기능을 이용할거임
		student1.addEnrollment(enrollment1); // 0번째 인덱스에 저장
		student1.addEnrollment(enrollment3); // 자료구조에 저장
		student2.addEnrollment(enrollment2);

		// 엘리스와 밥이신청한 과정의 이름을 화면에 출력하시오
		System.out.println(student1.getEnrollments().get(0).getCourse().getName());
		System.out.println(student2.getEnrollments().get(0).getCourse().getName());

		// 힌트 : 학생으로 접근
		System.out.println("===========================");

		for (int i = 0; i < student1.getEnrollments().size(); i++) {
			String studentName = student1.getName();
			Course course = student1.getEnrollments().get(i).getCourse();
			String CourseName = course.getName();
			System.out.println(studentName + ", courseName : " + CourseName);
		}
		// 위 코드는 학생과 과목을 등록(Course)이라는 클래스를 통해서 연결하는 예제 코드이다.

		// enrollment1을 이용해서 학생정보와 과목 정보를  출력
		// 학생 이름 : 이름
		// 수강 과목 : 과목 이름
		// ---------------

		System.out.println("학생이름 : " + enrollment1.getStudent().getName());
		System.out.println("수강과목 : " + enrollment1.getCourse().getName());
		System.out.println("-------------------------------------");
		
		// ArrayList를 생성해서 Enrollment를 지정해주세요
		ArrayList<Enrollment> enrollments = new ArrayList<>();
		enrollments.add(enrollment1);
		enrollments.add(enrollment2);
		enrollments.add(enrollment3);
		
		for(Enrollment e : enrollments) {
			System.out.println(e.getStudent().getName());
			System.out.println(e.getCourse().getName());
			System.out.println("-------------------------------------");
		}
		
		// for each 문 써서 엘리스가 수강하고있는 과목이름을 다시한번 더 출력하시오
		// student1로 접근하기
		
		for (Enrollment enrollment: student1.getEnrollments()) {
			System.out.println(enrollment.getCourse().getName());
		}

	}

}

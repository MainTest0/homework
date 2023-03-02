package ch07;

public class TakeTransMainTest {

	public static void main(String[] args) {

		Student std1 = new Student("James", 5000);
		Student std2 = new Student("Tomas", 10_000);
		
		Bus bus = new Bus(100);
		Subway sub = new Subway(1);
		
		std1.takeBus(bus);
		std1.takeSubway(sub);
		std2.takeBus(bus);
		std2.takeSubway(sub);
		
		std1.showInfo();
		std2.showInfo();

	}

}

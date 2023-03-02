package Ex13;

import java.util.Random;

public class RandNum {

	Random rand = new Random();
	
	private int ranNum;
	private String[] std = {"편용림", "김효린", "배진석", "강민정","한범진", "손주이", "김유주", "김미정", "김지현", "박성희", "이지운", "정다운", "이치승", "이서영", "전대영", "김현우", "김민우", "이현서"};
	
	
	public void rand() {
		ranNum = rand.nextInt(17);
		System.out.println(std[ranNum]);
	}
	
}

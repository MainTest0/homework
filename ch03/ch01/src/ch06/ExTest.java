package ch06;

import java.util.Random;
import java.util.Scanner;

public class ExTest {
	
	static int Rand() {
		Random r = new Random();
		
			int rd = r.nextInt(45)+1;
		
		return rd;
	}

	public static void main(String[] args) {

		for(int i=1;i<7;i++) {
			System.out.println(Rand());
		}
		
		
	}

}

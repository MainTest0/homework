package ch05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class SetMainTest {

	public static void main(String[] args) {

		// set 계열은 순서가없고 중복 불가 (주머니), 특징 기억
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(20);
		set1.add(100);
		set1.add(200);
		set1.add(1);
		set1.add(1);

		System.out.println(set1.toString());
		System.out.println(set1.size());

		// 삭제하는 방법
		set1.remove(500);
		set1.remove(1000); // 없는 요소를 삭제요청 하더라도 오류발생 하지않음
		//set1.clear(); // 요소 전체 삭제
		System.out.println(set1.toString());
		System.out.println(set1.size());
		System.out.println("=========================");
		// set계열을 반복문 처리할 때 Iterator타입으로 변환해서 처리할 수 있다.

		Iterator<Integer> iter = set1.iterator(); // 반복자로 형 변환 처리
		// hasNext(), next() 이 두개만 써도 실무가서 배울게 없음
		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		try {
			System.out.println("next 사용1 : " +iter.next());
			System.out.println("next 사용2 : " +iter.next());
			System.out.println("next 사용3 : " +iter.next());
		} catch (NoSuchElementException e) {
			System.out.println("자료구조 안에 값이 없어");
		}

	}
}

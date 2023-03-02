package ch05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// List 계열
		List list0;
		// 순서가 있고(=index 번호가 있다), 중복이 가능하다.(= 똑같은 데이터들이 들어올 수 있다)
		// 배열대신 편하게 쓰라고 만든게 ArrayList
		// 자동으로 배열크기를 정해줌 기본은 10개
		ArrayList<Integer> list = new ArrayList<>(); // 자료구조 선언 (정수를 담을 수 있는 메모리 공간 선언)
		ArrayList<Student> members = new ArrayList<>();
		ArrayList<String> strings = new ArrayList<String>(); // 뒤쪽 String은 생략 가능

		// CRUD : 생성, 조례, 수정, 삭제, 추가하는 방법
		// 값 추가 방법
		list.add(3); // 자동으로 인덱스 0번에 할당
		list.add(null); // 인덱스 1번에 null 할당
		list.add(100); // 인덱스 2번에 null 할당
		// 저장된 값 : 3, null, 100
		list.add(1, 20); // 인덱스 1번째에 20을 넣어라
		// 내 예상 3, 20, 100
		System.out.println(list.toString()); // 3,20,null,100
		System.out.println(list.size()); // 3,20,null,100
		// ArrayList add(index,value) <-- 이 메서드는 끼워넣기다

		// 값 삭제 방법
		list.remove(2);		// 해당하는 요소에 접근해서 제거
		System.out.println("값삭제");
		System.out.println(list.toString()); // 3,20,100
		System.out.println(list.size()); 
		// 매번 삭제할려면
//		list.remove(0);
//		list.remove(1);
//		list.remove(2);

		//list.clear(); //전체삭제
		System.out.println(list.toString());
		System.out.println(list.size()); 
		
		// 값을 화면에 출력하는 방법
		System.out.println("========================");
		System.out.println(list.get(2));			// 배열은 인덱스 연산처리, ArrayList get() 연산을 호출
		System.out.println(list.get(0));
		//System.out.println(list.get(20));
		
		System.out.println("========================");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// list -> 3, 20 ,100
		System.out.println("========================");
		for (int abc상관없음 : list) {		// 증감식을 안쓰고있다 -> index번호를 안쓰고있다.
			System.out.println("변수명 아무거나 됨"+abc상관없음);
		}
		
		// 각 검색 기능 사용해보기
		// 리스트 안에 값이 있는지 없는지 확인하기
		// 3, 20, 100 중 70이라는 값이 있는지 보려면
		// for문 돌려서 0부터 하나하나 다 돌려봐야됨
		// 그렇게 안해도 되는 방법
		// 70은 Wrapper클래스(자동으로 형변환 해주는 클래스)
		// containds는 요소안에 값이 있는지 없는지 판별(true,false 반환)
		
		System.out.println(list.contains(70));	// false:  list라는 자료구조안에는 70이 없어
		System.out.println(list.contains(100));	// true
		
		// 100이라는 값이 몇번째 인덱스에 있는지 알고싶을 때가 있음
		// indexOf
		
		System.out.println(list.indexOf(100));		// 값이 있으면 해당 인덱스 번호를 리턴한다.
		// 만약에 값이 없으면 무엇을 반환 할까?
		System.out.println(list.indexOf(3000));	//-1
		// 값이 없으면 -1을 반환한다.
		
		// 추가
		Iterator<Integer> iter = list.iterator();		//list만 쓰면 탑미스매치 뜨는데 list.iterator을 쓰면 반복자 녀석으로 형변환 해줌
		while(!iter.hasNext());
		System.out.println("값 확인 방법 : " + iter.next());

		
	}

}

class Student {

}
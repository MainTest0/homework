package ch05;

import java.util.HashMap;
import java.util.Map;

public class MainTest3 {
	public static void main(String[] args) {
		// map 자료구조 이용해서 전화번호를 저장 해주세요
		// 1 - String, String
		// 2 - String, Object(Person)
		
		Map<String, String> map = new HashMap<>();
		map.put("철수", "010-1111-2222");
		
		String phoneNum = map.get("철수");
		
		// key값은 중복될 수 없다.
		System.out.println(phoneNum);
		
	}
	
	
}

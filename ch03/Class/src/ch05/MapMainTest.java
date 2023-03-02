package ch05;

import java.security.Key;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class MapMainTest {

	public static void main(String[] args) {

		// HashMap, HashTable
		// 내가 다루어야하는 데이터값에 null이 들어간다 -> HashMap
		// null이 안들어간다 -> HashTable

		Map map;
		// Map : Key와 Value 구조로 데이터를 저장한다.
		Map<String, String> map1 = new HashMap<>(); // V - null 값 허용
		Hashtable<String, String> map2 = new Hashtable<>(); // V - null 값 허용 안함

		// C R U D
		// 순서가 없다
		map1.put("A01", "김포공항 정문");
		map1.put("A02", "김포공항 후문");
		map1.put("A03", "김포공항 로비");
		map1.put("B01", "인천공항 정문");
		map1.put("B02", "인청공항 후문");
		map1.put("B03", "인청공항 로비");
		map1.put("C01", null);

		// map 자료구조 전체 값 확인하기
		// 주소값이 나와야하는데 toString 재정의 되있음
		System.out.println(map1);

		// 값 꺼내는 방법 - key 값을 통해서 값을 꺼낼 수 있다.
		System.out.println(map1.get("B03"));
		System.out.println(map1.get("C01"));
		System.out.println(map1.get("b01")); // 문자열 B01과 b01은 다른 녀석임, 없는 key값을 요청하면 null이 반환된다.

		// 사이즈 확인 map1.size();
		System.out.println("size : " + map1.size());

		for (int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}

		// Map은 순서가 없지만 key값으로 for문 정도는 활용할 수 있다.
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(0, "A");
		map3.put(1, "B");
		map3.put(2, "C");
		map3.put(3, "D");
		map3.put(4, "E");

		for (int i = 0; i < map3.size(); i++) {
			System.out.println("Value : " + map3.get(i));
		}

		// 삭제하는 방법
		map1.remove("C01"); // 하나씩 삭제
		//map1.clear(); // 모두삭제
		System.out.println(map1.toString());
		
		// 자료구조는 반복문과 if문을 많이 활용한다.
		// map 계열을 for문과 활용하는 방법
		// map1<String, String>
		//Entry<String, String> entry1 = Entry<String, String> map1.entrySet();
		
		// key value를 한번에 꺼낼 수 있다. - 반복하면서
		for(Entry<String, String> entry2 : map1.entrySet()) {
			System.out.println("key : "+entry2.getKey());
			System.out.println("value : "+entry2.getValue());
			System.out.println("==================================");
		}
		
		System.out.println("#(######################");
		
		map1.keySet().size();
		System.out.println(map1.keySet().size());
		// map 값을 꺼낼 때 key값으로 접근!! --> value
		//String str = map1.get("A01");
		
		for(String key : map1.keySet()) {
			System.out.println(key);		//여기는 key값을 반복 돌면서 확인
			System.out.println("key : " + key);
			System.out.println("value : " + map1.get(key));
		}
		
		
		

	}

}

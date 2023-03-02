package ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMain {
	public static void main(String[] args) {
		// while 0. 종료 1. 저장 2. 전체조회 3. 선택조회 4. 선택삭제 5. 전체삭제
		// Tip -> 데이터 입력
		// 샘플 데이터 만들어서 활용
		Map<String, String> save = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int user = -1;
		String name;
		String phoneNum;
		while (user != 0) {
			System.out.println("기능을 선택해주세요");
			System.out.println("0. 종료 1. 저장 2. 전체조회 3. 선택조회 4. 선택삭제 5. 전체삭제");
			user = sc.nextInt();
			if (user > 5 || user < 0) {
				System.out.println("번호 0 ~ 5사이 숫자만 입력해주세요");
				continue;
			}
			if (user == 0) {
				System.out.println("종료");
			}
			if (user == 1) {
				System.out.println("이름을 입력해주세요"); // 같은 이름 있는지 조회
				sc.nextLine();
				name = sc.nextLine();
				System.out.println("번호를 입력해주세요 ('-'를 뺀 11자리를 입력해주세요)"); // 같은 번호있는지 조회
				phoneNum = sc.nextLine();
				if (save.containsValue(phoneNum) == true) {
					System.out.println("같은 전화번호가 존재합니다. 번호를 확인해주세요.");
					continue;
				}
				if (phoneNum.length() != 11) {
					System.out.println("잘못 입력하셨습니다.");
				} else if (phoneNum.matches(phoneNum) == true) {
					save.put(name, phoneNum);
					System.out.println("저장되었습니다.");
				}
			}
			if (user == 2) {
				if (save.keySet().size() == 0) {
					System.out.println("조회 목록 없음");
				} else {
					for (String key : save.keySet()) {
						System.out.println("이름 : " + key + "번호 : " + save.get(key));
					}
				}
			}
			if (user == 3) {
				System.out.println("조회하려는 사람의 이름을 입력해주세요");
				sc.nextLine();
				name = sc.nextLine();
				if (save.get(name) == null) {
					System.out.println("없는 이름입니다.");
				} else {
					save.get(name);
					System.out.println(name + "의 번호는 " + save.get(name) + " 입니다.");
				}
			}
			if (user == 4) {
				System.out.println("삭제하려는 사람의 이름을 입력해주세요");
				sc.nextLine();
				name = sc.nextLine();
				if (save.get(name) == null) {
					System.out.println("없는 이름입니다.");
				} else {
					save.remove(name);
					System.out.println("삭제 되었습니다.");
				}
			}
			if (user == 5) {
				if (save.isEmpty()) {
					System.out.println("저장된 번호가 없습니다.");
					continue;
				}
				save.clear();
				System.out.println("전체 삭제 되었습니다.");
			}
		}
	}
}
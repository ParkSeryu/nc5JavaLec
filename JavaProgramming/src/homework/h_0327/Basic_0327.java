package homework.h_0327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Basic_0327 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basic_0327 basic = new Basic_0327();
		// basic.problem1();
		// basic.problem2();
		basic.problem3();
	}

	void problem1() {
		// 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고
		// 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		ArrayList list = new ArrayList();
		while (list.size() < 5) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
	}

	void problem2() {
		// 정수형 데이터를 저장할 수 있는 LinkedList를 생성하고
		// 사용자가 입력한 5개의 정수를 저장하고
		// index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
		List<Integer> list = new LinkedList<Integer>();
		while (list.size() < 5) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		list.set(3, 100);
		list.set(4, 200);
		System.out.println(list);
	}

	void problem3() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 65; i <= 90; i++) {
			String convertChar = String.valueOf((char)i);
			map.put(convertChar, i);
		}
		
		for(int i = 97; i <= 122; i++) {
			String convertChar = String.valueOf((char)i);
			map.put(convertChar, i);
		}
		
		System.out.println(map);

	}
}

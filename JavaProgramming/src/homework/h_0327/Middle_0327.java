package homework.h_0327;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import chap98_homework.nc230316.PhoneInfo;

public class Middle_0327 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Middle_0327 middle = new Middle_0327();
		// middle.problem1();
		middle.problem2();
	}

	void problem1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + "번째 학생 이름 점수 입력");
			map.put(sc.next(), sc.nextInt());
		}

		// Map에 어떤 데이터가 들어있는지 확인할 때
		// Entry의 Set을 생성하고 Iterator를 꺼내서
		// Key, Value를 하나씩 확인한다.
		Set<Entry<String, Integer>> mapSet = map.entrySet();

		Iterator<Entry<String, Integer>> it = mapSet.iterator();

		String maxKey = null;
		int maxValue = 0;

		while (it.hasNext()) {
			Entry<String, Integer> ent = it.next();
			if (maxValue < ent.getValue()) {
				maxKey = ent.getKey();
				maxValue = ent.getValue();
			}
		}

		System.out.println("최고는 : " + maxKey + " " + maxValue);

	}

	void problem2() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int[] intArray = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < intArray.length; i++) {
			int sumKey = intArray[i];
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (i == j)
					continue;
				for (int k = 0; k < i; k++) {
					if (j == k) break;
					if (intArray[j] + intArray[k] == sumKey) {
						cnt++;
					}
				}
			}
			if (cnt > 0) {
				map.put(String.valueOf(sumKey), cnt);
			}
		}
		System.out.println(map);
	}

}

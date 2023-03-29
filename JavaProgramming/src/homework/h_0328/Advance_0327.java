package homework.h_0328;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import homework.h_0327.member.Member;

public class Advance_0327 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Advance_0327 advance = new Advance_0327();
		// advance.problem1();
		// advance.problem2();
		 advance.problem3();
		//advance.problem4();
	}

	void problem1() {
		String str = sc.next();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				int cnt = map.get(ch) + 1;
				map.replace(ch, cnt);
			} else {
				map.put(ch, 1);
			}

		}

		System.out.println(map);
		char maxKey = ' ';
		int maxValue = 0;
		// Map에 어떤 데이터가 들어있는지 확인할 때
		// Entry의 Set을 생성하고 Iterator를 꺼내서
		// Key, Value를 하나씩 확인한다.
		Set<Entry<Character, Integer>> mapSet = map.entrySet();
		Iterator<Entry<Character, Integer>> it = mapSet.iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> ent = it.next();
			if (maxValue < ent.getValue()) {
				maxKey = ent.getKey();
				maxValue = ent.getValue();
			}
		}

		System.out.println(maxKey + " " + maxValue);
	}

	void problem2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int array[] = { 51, 22, 43, 14, 55 };
		for (int a : array) {
			list.add(a);
		}

		int sumMax = 0;
		int index1 = 0;
		int index2 = 0;

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) + list.get(i + 1) > sumMax) {
				sumMax = list.get(i) + list.get(i + 1);
				index1 = list.get(i);
				index2 = list.get(i + 1);
			}
		}
		System.out.println(index1 + " " + index2);
	}

	void problem3() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> sumList = new ArrayList<Integer>();
		ArrayList<Integer> test = new ArrayList<Integer>();

		int array[] = { 1, 2, 3, 4, 5, 6 };
		for (int a : array) {
			list.add(a);
		}

		Set<Integer> resultSet = new HashSet<Integer>();

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (i == j)
					continue;
				sumList.add(array[i] + array[j]);
			}
		}

		System.out.println(sumList);

		for (int i = 0; i < sumList.size(); i++) {
			int each = sumList.get(i);
			if (sumList.indexOf(each) == sumList.lastIndexOf(each)) {
				resultSet.add(each);
			}
			else {
				test.clear();
				test.add(each);
				i--;
				sumList.removeAll(test);
			}
		}

		System.out.println(resultSet);

	}

	void problem4() {
		List<Member> memList = new ArrayList<Member>();

		Member m;
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 02, 02);
		m = getNewMember(1, "h", "홍길동", new Date(cal.getTimeInMillis()));
		memList.add(m);
		
		cal.set(2021, 02, 02);
		m = getNewMember(2, "j", "장길산", new Date(cal.getTimeInMillis()));
		memList.add(m);
		
		cal.set(2023, 02, 02);
		m = getNewMember(2, "j", "장길산", new Date(cal.getTimeInMillis()));
		memList.add(m);
		
		System.out.println(
				m.getNo() + " " + m.getId() + " " + m.getName() + "" + m.getLastLoginDate() + " " + m.getStatus());
		int cnt = 0;
		for (int i = 0; i < memList.size(); i++) {
			if (memList.get(i).getStatus() == "N") {
				cnt++;
			}
		}

		System.out.println("정지된 회원의 수는 " + cnt + "명");
	}

	Member getNewMember(int no, String id, String name, Date lastLoginDate) {
		Member m = new Member();
		m.setNo(no);
		m.setId(id);
		m.setName(name);
		m.setLastLoginDate(lastLoginDate);
		return m;
	}
}

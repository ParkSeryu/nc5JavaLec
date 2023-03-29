package coding_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class noWanju_0329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String participant[] = { "leo", "kiki", "eden" };
//		String completion[] = { "eden", "kiki" };
		String participant[] = { "mislav", "stanko", "mislav", "ana" };
		String completion[] = { "stanko", "ana", "mislav" };
		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		List<String> pList = new LinkedList<String>(Arrays.asList(participant));

		List<String> cList = new LinkedList<String>(Arrays.asList(completion));
		Collections.sort(pList);
		Collections.sort(cList);

		for (String c : cList) {
			if (!(pList.contains(c))) {
				return c;
			}
			pList.remove(c);
		}
		System.out.println(pList);
		return "";
	}
}

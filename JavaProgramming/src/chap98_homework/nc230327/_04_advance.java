package chap98_homework.nc230327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _04_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//	    (Map<Character, Integer> 형태의 Map과 Entry 사용)
		Scanner sc = new Scanner(System.in);
	
		
//	    2. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
//	    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
//	    ex) [1, 2, 3, 4, 5] => 4, 5 출력


//	    3. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//	    두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//	    ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)
		List<Integer> intList2 = 
				new ArrayList<Integer>();
		
		for(int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
		}
		
		List<Integer> sumList = 
						new ArrayList<Integer>();
		
		Map<String, Integer> sumMap = 
					new HashMap<String, Integer>();
		
		for(int i = 0; i < intList2.size(); i++) {
			for(int j = i + 1; j < intList2.size(); j++) {
				if(j != i) {
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		}
		
		for(int i = 0; i < sumList.size(); i++) {
			int sumCnt = 1;
			
			for(int j = 0; j < sumList.size(); j++) {
				if(i != j) {
					if(sumList.get(i) == sumList.get(j)) {
						//System.out.println(sumList.get(i));
						sumCnt++;
					} 
				}
			}
			
			if(sumCnt > 0)
				sumMap.put(String.valueOf(sumList.get(i)), sumCnt);
		}
			Set<Entry<String, Integer>> entrySet = sumMap.entrySet();
			
			Iterator<Entry<String, Integer>> it = entrySet.iterator();
			
			Set<Integer> intSet = new HashSet<Integer>();
			
			while(it.hasNext()) {
				Entry<String, Integer> ent = it.next();
				System.out.println(ent.getKey());
				if(ent.getValue() == 1) {
					intSet.add(Integer.parseInt(ent.getKey()));
				}
			}
			
		
		
		System.out.println(intSet);
		sc.close();
	}
}

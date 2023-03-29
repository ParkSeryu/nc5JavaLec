package homework.h_0328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import homework.h_0328.clazz.GenericCla;

public class Basic_0328 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method s4 tub

		Basic_0328 basic = new Basic_0328();
		basic.problem1_3();

	}

	void problem1_3() {
		// 1
		GenericCla<String> genericA = new GenericCla<String>();
		genericA.setT("test");

		GenericCla<Integer> genericB = new GenericCla<Integer>();
		genericB.setT(30);

		// 2
		System.out.println(GenericCla.add(genericA.getT(), genericB.getT()));

		// 3
		List<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		System.out.println(GenericCla.add(strList));

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		System.out.println(GenericCla.add(intList));

		// 4
		GenericCla.printArr(strList);
		GenericCla.printArr(intList);

		// 5
		String[] strArray = { "1", "2", "3", "4", "5" };
		Integer[] intArray = { 11, 22, 33, 44, 55 };
		//GenericCla.getMin(strArray); error
		System.out.println(GenericCla.getMin(intArray));
		
		// 6
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("1", 1000L);
		GenericCla.printOverTen(map);
	}

}

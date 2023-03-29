package homework.h_0328.clazz;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GenericCla<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static <T> String add(T t1, T t2) {
		return t1.toString() + t2.toString();
	}

	public static Integer add(List<?> list) {
		int sum = 0;
		for (Object obj : list) {
			if (obj instanceof Integer) {
				sum += (Integer) obj;
			}
		}
		return sum;
	}

	public static void printArr(List<?> list) {
		for (int i = 0; i < list.size(); i++) {
			if ((i + 1) % 3 == 0) {
				System.out.println(list.get(i));
			}
		}

	}

	public static <T extends Number> Integer getMin(T[] arr) {
		int min = 99999;
		for (T t : arr) {
			if (t.intValue() < min) {
				min = t.intValue();
			}
		}
		return min;

	}

	public static void printOverTen(Map<?, ?> map) {

		for (Entry<?, ?> ent : map.entrySet()) {
			if(ent.getValue().toString().length() >= 1) {
				System.out.println(ent.getKey());
			}
		}

		
		
	}

}

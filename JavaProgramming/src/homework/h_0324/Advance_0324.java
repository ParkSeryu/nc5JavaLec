package homework.h_0324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Advance_0324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Advance_0324 advance = new Advance_0324();
		 advance.problem1();
		 advance.problem2();
		advance.problem3();
	}

	void problem1() {
		Calendar cal = Calendar.getInstance();
		cal.set(2001, 11, 19);

		int end_year = 2022;
		while (cal.get(cal.YEAR) < end_year) {
			if (isLeap(cal.get(cal.YEAR))) {
				cal.add(cal.DATE, 1);

			}

			cal.add(cal.YEAR, 1);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(cal.getTime()));
	}

	public static boolean isLeap(int year) {
		// 400으로 나눠떨어지거나
		// 4로 나눠떨어지고 100나눠떨어지지 않는것
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		}
		return false;
	}

	void problem2() {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		sb.append(sc.next());
		char ch = sb.charAt(0);
		for (int i = 1; i < sb.length();) {
			if (ch == sb.charAt(i)) {
				sb.deleteCharAt(i);
			} else {
				ch = sb.charAt(i++);
			}

		}
		System.out.println(sb.toString());
		// System.out.println(sb.toString());

	}

	void problem3() {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		try {
			cal1.setTime(sdf.parse(str1));
			cal2.setTime(sdf.parse(str2));
			if (cal1.compareTo(cal2) > 0) {
				while (cal1.compareTo(cal2) != 0) {
					System.out.println(sdf.format(cal2.getTime()));
					cal2.add(cal2.DATE, 1);
				}
			} else {
				while (cal1.compareTo(cal2) != 0) {
					System.out.println(sdf.format(cal1.getTime()));
					cal1.add(cal1.DATE, 1);
				}
			}
			System.out.println(sdf.format(cal1.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
		}
	}
}

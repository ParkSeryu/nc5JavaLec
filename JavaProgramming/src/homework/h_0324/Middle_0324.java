package homework.h_0324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Middle_0324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Middle_0324 middle = new Middle_0324();
		 middle.problem1();
		// middle.problem2();
		middle.problem3();
	}

	void problem1() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(sdf.parse(str));
			cal.add(cal.DATE, 3);
			System.out.println(sdf.format(cal.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
		}

	}

	void problem2() {
		Calendar cal = Calendar.getInstance();

		String[] days = { "", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			cal.setTime(sdf.parse(str));
			System.out.println(days[cal.get(Calendar.DAY_OF_WEEK)]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
		}
	}

	void problem3() {
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		d1.set(2023, 2, 15, 20, 31, 45);
		d2.set(2021, 6, 8, 11, 58, 04);
		long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
		diff /= 1000;
		long hour = diff / 3600;
		long min = diff % 3600 / 60;
		long sec = diff % 3600 % 60;
		System.out.println(diff + "초 이므로" + hour + "시간" + min + "분" + sec + "초");
	}

}

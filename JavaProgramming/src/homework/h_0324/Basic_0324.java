package homework.h_0324;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Basic_0324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic_0324 basic = new Basic_0324();
		basic.problem1();
		basic.problem2();
	}

	void problem1() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(cal.YEAR) + " " + (cal.get(cal.MONTH) + 1) + " " + cal.get(cal.DATE));
		cal.set(2020, 3, 8);
		System.out.println(cal.get(cal.YEAR) + " " + (cal.get(cal.MONTH) + 1) + " " + cal.get(cal.DATE));
		cal.add(cal.YEAR, 5);
		cal.add(cal.MONTH, 2);
		cal.add(cal.DATE, 3);
		System.out.println(cal.get(cal.YEAR) + " " + (cal.get(cal.MONTH) + 1) + " " + cal.get(cal.DATE));
	}

	void problem2() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(cal.getTime()));
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(cal.getTime()));
	}
}

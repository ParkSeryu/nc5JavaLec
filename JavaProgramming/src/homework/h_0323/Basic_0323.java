package homework.h_0323;

import java.util.Scanner;

public class Basic_0323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basic_0323 basic = new Basic_0323();
		// basic.problem1();
		basic.problem2();
		// basic.problem3();
		//basic.problem4();
	}

	void problem1() {
		Scanner sc = new Scanner(System.in);
//		String str1 = sc.next();
//		String str2 = sc.next();
//		String str3 = sc.next();

		String str1 = "bit";
		String str2 = "가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하";
		String str3 = "가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하";
//		
		StringBuffer sb1 = new StringBuffer();

		sb1.append(str1);
		sb1.append(str2);
		sb1.append(str3);
		System.out.println(sb1.capacity() + " " + sb1.length());

		System.out.println(sb1.toString());

		sc.close();
	}

	void problem2() {
		StringBuffer sb1 = new StringBuffer(30);
//		System.out.println(sb1.capacity());
//		System.out.println(sb1.length());
		sb1.append("hello");
		while (sb1.length() != sb1.capacity()) {
//			System.out.println(sb1.length());
//			System.out.println(sb1.capacity());
			sb1.append("a");
		}
		System.out.println(sb1.toString());
	}

	void problem3() {
		double a = 16.459;
		System.out.println((double) Math.round(a * 100) / 100);
	}

	void problem4() {
		String a = "145.987";
		String b = "-563.11";

		double c = Double.valueOf(a);
		double d = Double.valueOf(b);

		System.out.println(a + b);
		System.out.println(c + d);

	}
}

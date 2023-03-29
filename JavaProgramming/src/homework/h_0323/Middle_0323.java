package homework.h_0323;

import java.util.Scanner;

public class Middle_0323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Middle_0323 middle = new Middle_0323();
		// middle.problem1();
		// middle.problem2();
		// middle.problem3();
		middle.problem4();
	}

	void problem1() {
		StringBuffer sb1 = new StringBuffer(30);
		sb1.append("hello");
		String repeat[] = { "b", "i", "t" };
		int i = 0;
		while (sb1.capacity() != sb1.length()) {
			sb1.append(repeat[i++]);

			if (i == repeat.length)
				i = 0;
		}

		System.out.println(sb1.toString());
	}

	void problem2() {
		StringBuffer sb1 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		String str = sb1.reverse().toString();
		Scanner sc = new Scanner(System.in);
		System.out.println(str);
		int inputNum = sc.nextInt();
		System.out.println(str.charAt(inputNum));
		sc.close();

	}

	void problem3() {
		int initMoney = 10000;
		double rate = 0.1;
		int year = 10;
		// 복리 계산법
		// 금액 = 원금 * (1+연이자율/이자 발생 빈도(월, 분기, 년 등)^전체 투자 기간(연 단위)
		double total = initMoney * (Math.pow(1 + rate, year));
		System.out.printf("만기 금액 : %f 원", total);

	}

	void problem4() {
		Scanner sc = new Scanner(System.in);
		//int input = sc.nextInt();
		int input = 5;
		int sum = recur_sum(input);
		System.out.println(sum);
	}

	int recur_sum(int n) {
		if(n > 0) {
			System.out.println(n);	
			return n + recur_sum(n - 1);
			
		}
		else {
			
			return n;
		}
		 
	}
}

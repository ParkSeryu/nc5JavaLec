package homework.h_0320;

import java.util.Scanner;

import homework.h_0320.mamal.Lion;
import homework.h_0320.mamal.Tiger;

public class Basic_0320 {
	public static void main(String[] args) {
		Max3 max = new Max3();
		//max.start();
		
		Median median = new Median();
		//median.start();
		
		Lion Q3 = new Lion("박사자", "갈기사자", true, "큰꼬리", "독수리", 12);
		Q3.checkType();
		Q3.howManyTeeth();
		
		Tiger Q4 = new Tiger("김호랑이", "백호", false, "작은꼬리", "멧돼지", 13);
		Q4.checkType();
		Q4.howManyTeeth();
		Q4.getTypes();
	}
}

class Max3 {
	public void start() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");
		int a = stdIn.nextInt();
		System.out.print("b의 값：");
		int b = stdIn.nextInt();
		System.out.print("c의 값：");
		int c = stdIn.nextInt();
		int max = a;
		/*
		 * 이곳에 적절한 코드를 넣으세요
		 */
		// int max = Math.max(Math.max(a, b), c);
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		System.out.println("최댓값은 " + max + "입니다.");
	}
}

class Median {
	static int med3(int a, int b, int c) {
		int A = a - (a + b + c) / 3;
		int B = b - (a + b + c) / 3;
		int C = c - (a + b + c) / 3;
		if (A < 0)
			A = -A;

		if (B < 0)
			B = -B;

		if (C < 0)
			C = -C;

		if (A <= B && A <= C) {
			return a;
		}

		else if (B <= A && B <= C) {
			return b;
		}

		else {
			return c;
		}
	}

	public void start() {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을구합니다.");
		System.out.print("a의 값：");
		int a = stdIn.nextInt();
		System.out.print("b의 값：");
		int b = stdIn.nextInt();
		System.out.print("c의 값：");
		int c = stdIn.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
}

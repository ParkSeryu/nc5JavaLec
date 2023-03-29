package homework.h_0315;

import java.util.Scanner;

public class advance_0315 {
	public static void main(String[] args) {
		advance_0315 c = new advance_0315();
		// c.problem1(); // 돈의 액수
		// c.problem2(); // 369게임
		//c.problem3(); // 조합구하기
		 c.problem4(); // 피라미드
	}

	void problem1() {
		System.out.println("돈의 액수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int change[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 }; // 나누는 수
		int cal[] = new int[change.length]; // 몫

		for (int i = 0; i < change.length; i++) {
			if (money > change[i]) {
				cal[i] = money / change[i];
				money = money % change[i];
			}
			if (change[i] >= 1000)
				System.out.println(change[i] + "원 " + cal[i] + "매");
			else
				System.out.println(change[i] + "원 " + cal[i] + "개");
		}

	}

	void problem2() {
		System.out.println("1 ~ 99 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		String convertIntToString = Integer.toString(su);
		int count = 0;

		for (int i = 0; i < convertIntToString.length(); i++) {
			char ch = convertIntToString.charAt(i);
			if (ch == '3' || ch == '6' || ch == '9') {
				count++;
			}
		}

		switch (count) {
		case 1:
			System.out.println("박수짝");
			break;
		case 2:
			System.out.println("박수짝짝");
			break;
		}
	}

	void problem3() {
		int A, B;
		int count = 0;
		for (A = 1; A <= 9; A++) {
			for (B = 1; B <= 9; B++) {
				if (A + B == 9) {
					System.out.printf("%d + %d = %d\n", (10 * A + B), (10 * B + A), (10 * A + B + 10 * B + A));
					count++;
				}
			}
		}
		System.out.printf("총 %d개 입니다.", count);
	}

	void problem4() {
		int maxLine = 3;
		int line, star, space;
		for (line = 1; line <= maxLine; line++) {
			for (space = 1; space <= maxLine - line; space++) {
				System.out.print(" ");
			}
			for (star = 1; star <= line * 2 - 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

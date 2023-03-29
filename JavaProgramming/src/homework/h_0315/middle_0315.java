package homework.h_0315;

import java.util.Random;
import java.util.Scanner;

public class middle_0315 {
	public static void main(String[] args) {
		middle_0315 c = new middle_0315();
		// c.problem1(); // while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요 while문내에 조건문을 넣어주면 됨
		// c.problem2(); // 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고, 그 출력된 숫자들의 합을 구하는
		// 프로그램을 작성하세요
		// c.problem3(); // 구구단 출력
		c.problem4(); // 가위, 바위, 보 게임을 만드세요.
	}

	void problem1() {
		int i = 1;
		while (i < 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	void problem2() {
		int i = 1;
		int sum = 0;
		while (i <= 1000) {
			if (i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
				sum += i;
			}
			i++;
		}
		System.out.println("숫자들의 합 = " + sum);
	}

	void problem3() {
		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + j * i + " ");
			}
			System.out.println();
		}
	}

	void problem4() {
		Random rand = new Random();
		int com = rand.nextInt(3);
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 중에 하나 내세요 (0: 가위, 1: 바위, 2: 보)");
		int input = sc.nextInt();
		String transCom = transfer(com);
		String transHuman = transfer(input);

		System.out.println("컴퓨터 : " + transCom + " / " + "사용자 : " + transHuman);

		switch (input) {
		case 0:
			System.out.println(com == 0 ? "비겼습니다." : com == 1 ? "졌습니다." : "이겼습니다.");
			break;
		case 1:
			System.out.println(com == 1 ? "비겼습니다." : com == 2 ? "졌습니다." : "이겼습니다.");
			break;
		case 2:
			System.out.println(com == 2 ? "비겼습니다." : com == 0 ? "졌습니다." : "이겼습니다.");
			break;
		}

	}

	static String transfer(int transWant) {
		switch (transWant) {
		case 0:
			return "가위";
		case 1:
			return "바위";
		case 2:
			return "보";
		default:
			return "error";
		}
	}
}

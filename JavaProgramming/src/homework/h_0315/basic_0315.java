package homework.h_0315;

public class basic_0315 {
	public static void main(String[] args) {
		basic_0315 c = new basic_0315();
		// c.problem1(); // 1. 10 ~ 1까지 거꾸로 while문으로 출력
		// c.problem2(); // 2. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		// c.problem3(); // 3. 10 ~ 1까지 거꾸로 for문으로 출력
		// c.problem4(); // 4. 1 ~ 100까지 합을 while문으로 출력
		c.problem5(); // 5. 1 ~ 100까지 합을 do ~ while문으로 출력
		c.problem6(); // 6. 1 ~ 100까지 합을 for문으로 출력
	}

	void problem1() {
		int i = 10;
		while (i > 0) {
			System.out.println(i--);
		}
	}

	void problem2() {
		int i = 10;
		do {
			System.out.println(i--);
		} while (i > 0);
	}

	void problem3() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}

	void problem4() {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	void problem5() {
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println(sum);
	}

	void problem6() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

package homework.h_0314;

public class middle_0314 {
	public static void main(String[] args) {
		middle_0314 c = new middle_0314();
		c.problem1();
	//	c.problem2();
	}

	void problem1() {
		int age = 29;
		//age = 30;
		System.out.println(20 <= age && age < 30 ? "20대입니다." : "20대가 아닙니다");
	}

	void problem2() {
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.println(i+ ",");
			}
		}
	}
}

package homework.h_0314;

public class basic_0314 {

	public static void main(String[] args) {
		basic_0314 c = new basic_0314();
		// c.problem1();
		c.problem2();
	}

	void problem1() {
		int num = 10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
	}

	void problem2() {
		int a = 10;
		int b = 20;
		System.out.println(b > a);
		System.out.println(a > b);
	}
}

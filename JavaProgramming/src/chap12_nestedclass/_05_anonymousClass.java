package chap12_nestedclass;

import chap12_nestedclass.clazz.Calc;

public class _05_anonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calc cal = new Add();
		// cal.calculator(10, 20);

		// 익명 중첩 클래스 선언
		Calc cal = new Calc() {
			@Override
			public void calculator(int a, int b) {
				System.out.println("결과는 " + (a + b));
			}
		};

		cal.calculator(10, 20);
	}

}

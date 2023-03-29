package chap06_class;

import chap06_class.calc.Multiple;

public class _03_overloading {
	public static void main(String[] args) {
		
		Multiple multi = new Multiple();
		multi.setNum1(4);
		multi.setNum2(3);
		

		System.out.println("매개변수가 없는 multi() : " + multi.multiple());
		System.out.println("매개변수가 하나인 multi() : " + multi.multiple(4));
		System.out.println("매개변수가 두개인 multi() : " + multi.multiple(4, 3));
	}
}

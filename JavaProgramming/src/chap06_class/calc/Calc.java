package chap06_class.calc;

//Calc 라는 설계도
public class Calc {
	public int num1;
	public int num2;
	public int result; //속성 3개
	
	//기능 4개
	public int add(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multi(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}
}

package chap06_class.calc;

public class Divide {
	private int num1;
	private int num2;
	private double result;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public double divide() {
		if (num2 > 0)
		result = (double)num1 / num2;
		return result;
	}
}

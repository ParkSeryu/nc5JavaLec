package homework.h_0321;

import homework.h_0321.calc.Calculator;
import homework.h_0321.calc.Calculator.Add;
import homework.h_0321.calc.Calculator.Div;
import homework.h_0321.calc.Calculator.Mul;
import homework.h_0321.calc.Calculator.Sub;

public class Middle_0321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		Add add = calc.new Add();
		Sub sub = calc.new Sub();
		Mul mul = calc.new Mul();
		Div div = calc.new Div();

		System.out.println(add.add(5, 3));
		System.out.println(sub.sub(5, 3));
		System.out.println(mul.mul(5, 3));
		System.out.println(div.div(5, 3));
	}

}

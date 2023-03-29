package homework.h_0317;

import homework.h_0317.calc.Calc;
import homework.h_0317.calc.Add;
import homework.h_0317.calc.Div;
import homework.h_0317.calc.Mul;
import homework.h_0317.calc.Sub;

public class middle_0317 {
	public static void main(String[] args) {
		Calc[] calcArr = new Calc[5];
		calcArr[0] = new Add();
		calcArr[1] = new Sub();
		calcArr[2] = new Mul();
		calcArr[3] = new Div();
		calcArr[4] = new Calc();
		
		
		for(Calc c : calcArr) {
			c.setValue(3, 4);
			System.out.println(c.calculate()); //사칙연산 실행
		}
	}
}

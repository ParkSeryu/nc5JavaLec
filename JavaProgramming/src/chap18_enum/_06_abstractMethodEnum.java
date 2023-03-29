package chap18_enum;

import chap18_enum.eunms.Calculator;
import chap18_enum.eunms.Season;

public class _06_abstractMethodEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator add = Calculator.PLUS;
		int result = add.calculate(10, 5);
		System.out.println(result);

		int result2 = Calculator.DIVIDE.calculate(10, 2);
		System.out.println(result2);

		
		
		Season[] seasonArr = Season.values();
		
		for(Season s: seasonArr) {
			s.printSeasonMonth();
		}
		

	}

}

package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Divide;
import chap06_class.calc.Minus;
import chap06_class.calc.Multiple;

public class _01_Instance {
	public static void main(String[] args) {
		// 객체화 (인스턴스화)
		Add add = new Add();

		Minus minus = new Minus();
		Multiple multiple = new Multiple();
		Divide divide = new Divide();
		

		// add.num1 = 10;
		// add.num2 = 20;

//		add.setNum1(10);
		add.setNum2(20);
//		add.setResult(add.getNum1() + add.getNum2());

		int resultAdd = add.add(10, 20);
		//System.out.println(resultAdd);

		minus.setNum1(10);
		minus.setNum2(20);
		int resultMinus = minus.minus();
		//System.out.println(resultMinus);

		multiple.setNum1(10);
		multiple.setNum2(20);
		int resultMulti = multiple.multiple();
		//System.out.println(resultMulti);

		divide.setNum1(10);
		divide.setNum2(20);
		double resultDivide = divide.divide();
		//System.out.println(resultDivide);

		// 설계도로 부품을 만드는 작업 == 인스턴스화, 객체화
		// 인스턴스화: 생성자를 통해서 객체를 생성하고 heap 메모리 영역 저장
		// 항상 new 키워드와 함께 써야한다.

		Calc cal = new Calc();
		System.out.println(cal.add(10, 200));
		
		Calc cal2 = new Add();
		System.out.println(cal2.add(4, 3));
		
		Calc cal3 = new Minus();
		System.out.println(cal3.minus(4,3));

		
		int receiveNum = cal.add(10, 20);
		// 리턴값을 받아주는 변수가 없으면 결과가 메모리에 저장되지 않고
		// 연산이 일어난 후 삭제
		cal.add(10, 20);
		//System.out.println(cal.minus(cal.add(10, 20), cal.divide(20, 10)));
		
		
	}

}
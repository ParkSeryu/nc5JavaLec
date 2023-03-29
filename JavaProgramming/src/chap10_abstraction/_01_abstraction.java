package chap10_abstraction;

import chap10_abstraction.academy.Academy;
import chap10_abstraction.academy.ComputerAcademy;
import chap10_abstraction.academy.EnglishAcademy;

public class _01_abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Academy academy = new ComputerAcademy();
		//추상클래스는 인스턴스화 불가
		//academy = new Academy();
		
		academy.teach();
		academy.doHomework();
		academy.takeRest();
		academy.attendance();
		
		academy = new EnglishAcademy();
		
		academy.teach();
		academy.doHomework();
		academy.takeRest();
		academy.attendance();
	}

}
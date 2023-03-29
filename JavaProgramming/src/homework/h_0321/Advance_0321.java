package homework.h_0321;

import java.util.Scanner;

import homework.h_0321.office.Contract;
import homework.h_0321.office.FullTime;
import homework.h_0321.office.OfficeMan;
import homework.h_0321.office.Temporary;

public class Advance_0321 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		boolean isExit = true;
		Advance_0321 ad = new Advance_0321();
		OfficeMan[] om = new OfficeMan[1000];

		while (isExit) {

			System.out.println("***메뉴 선택***");
			System.out.println("1. 정규직 저장");
			System.out.println("2. 임시직 저장");
			System.out.println("3. 계약직 저장");
			System.out.println("4. 전체 정보 출력");
			System.out.println("5. 월급 계산 출력");
			System.out.println("6. 프로그램 출력");

			switch (sc.nextInt()) {
			case 1:
				ad.inputInfo(om, i++, "정규");
				break;
			case 2:
				ad.inputInfo(om, i++, "임시");
				break;
			case 3:
				ad.inputInfo(om, i++, "계약");
				break;
			case 4:
				for (int j = 0; j < i; j++) {
					om[j].showEmployeeInfo();
				}
				break;
			case 5:
				System.out.println("월급 계산을 원하는 직원의 사번을 입력해 주세요.");
				String emp = sc.next();
				
				for (int j = 0; j < i; j++) {
					if (om[j].getEmp().equals(emp)) {
						switch (om[j].getRank()) {
						case "정규":
							System.out.println("정규직은 보너스를 입력 해 주세여");
							System.out.println("월급은 " + om[j].getMonthPay(sc.nextDouble()) + "입니다.");
							break;
						case "임시":
							System.out.println("임시직은 얼마나 일하는지 입력하세요");
							System.out.println("월급은 " + om[j].getMonthPay(sc.nextDouble()) + "입니다.");
							break;
						case "계약":
							System.out.println("계약직은 얼마나 계약했는지 입력하세요");
							System.out.println("월급은 " + om[j].getMonthPay(sc.nextDouble()) + "입니다.");
							break;
						}
					}

				}

				break;
			case 6:
				isExit = false;
				break;
			}
		}

	}

	public void inputInfo(OfficeMan[] om, int index, String workCls) {
		System.out.println("사번을 입력 해 주세요");
		String emp = sc.next();
		System.out.println("이름을 입력 해 주세요");
		String name = sc.next();
		System.out.println("급여를 입력 해 주세요");
		Double pay = sc.nextDouble();
		switch (workCls) {
		case "정규":
			om[index] = new FullTime(emp, name, pay, "정규");
			break;
		case "임시":
			om[index] = new Temporary(emp, name, pay, "임시");
			break;
		case "계약":
			om[index] = new Contract(emp, name, pay, "계약");
			break;
		}
	}

}

package chap06_class;

import java.util.Scanner;

import chap06_class.phone.PhoneInfo;

public class _07_useOfPhoneInfo {
	public static void main(String[] args) {
		PhoneInfo phoneInfo = new PhoneInfo();
		boolean resume = true;
		Scanner sc = new Scanner(System.in);
		while (resume) {
			System.out.println("-----연락처 목록-----");
			System.out.println("1. 정보 입력");
			System.out.println("2. 모든 정보 출력");
			System.out.println("3. 인덱스로 정보 검색");
			System.out.println("4. 종료");

			switch (sc.nextInt()) {
			case 1:
				phoneInfo.insertPhoneNumber(sc.next(), sc.next());
				break;
			case 2:
				phoneInfo.printAllPhoneNum();
				break;
			case 3:
				phoneInfo.printPhoneInfo(sc.nextInt());
				break;
			case 4:
				resume = !resume;
				break;
			default:
				System.out.println("잘못입력함.");
				break;
			}
		}
	}
}

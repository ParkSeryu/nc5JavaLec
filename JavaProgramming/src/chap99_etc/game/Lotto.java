package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class Lotto extends Game{
	// 1~45까지 7개의 난수 (중복제거)
	// 7번째 숫자는 보너스 번호
	private int[] lottoNumber = new int[7];
	private int[] user = new int[6];
	Random rc = new Random();

	// 사용자가 1~45까지 6개 숫자 선택 (중복제거)


	// 1등 : 보너스 번호를 제외한 6개의 숫자가 모두 같을 때
	// 2등 : 보너스 번호와 5개의 번호가 일치할때
	// 3등 : 보너스 번호를 제외한 5개의 숫자가 일치할 때
	// 4등 : 보너스 번호를 제외한 4개의 숫자가 일치할 떄
	// 5등 : 보너스 번호를 제외한 3개의 숫자가 일치할 때
	// 나머지는 꽝

	// 몇등인지 출력
	public void gameStart() {
		createLottoNumber();
		inputUserNumber();
		matchingNumber();
	}

	void createLottoNumber() {
		int a= rc.nextInt();
		for (int i = 0; i < lottoNumber.length; i++) {
			int eachNumber = (int) (Math.random() * 45 + 1);
			lottoNumber[i] = eachNumber;
			for (int j = 0; j < i; j++) {
				if (lottoNumber[j] == eachNumber) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < lottoNumber.length; i++) {
			if (i == lottoNumber.length - 1)
				System.out.print(" 보너스번호:  " + lottoNumber[i]);
			else {
				System.out.print(lottoNumber[i] + " ");
			}
		}
		System.out.println();
	}

	void inputUserNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 번호 입력");
		for (int i = 0; i < user.length; i++) {
			user[i] = sc.nextInt();
		}
	}

	void matchingNumber() {
		int result = 0;

		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < lottoNumber.length - 1; j++) {
				if (user[i] == lottoNumber[j]) {
					result++;
				}
			}
		}

		switch (result) {
		case 6:
			System.out.println("1등당첨!");
			break;
		case 5:
			if (checkBonus()) {
				System.out.println("2등당첨!");
			} else {
				System.out.println("3등당첨!");
			}
			break;
		case 4:
			System.out.println("4등당첨!");
			break;
		case 3:
			System.out.println("5등당첨!");
			break;
		default:
			System.out.println("꽝!!!!!");
			break;
		}
	}

	boolean checkBonus() {
		for (int ui : user) {
			if (ui == lottoNumber[lottoNumber.length - 1]) {
				return true;
			}
		}
		return false;
	}

	

}
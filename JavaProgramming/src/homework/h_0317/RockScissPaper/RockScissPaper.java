package homework.h_0317.RockScissPaper;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {

	// 몇승 몇무 몇패인지 셀 변수
	private int win = 0;
	private int draw = 0;
	private int lose = 0;

	// 승점 담아줄 변수(승:1, 무:0, 패:-1)
	private int score = 0;

	// 승무패 기록을 담아줄 배열
	private int[] wdl;
	Random rand = new Random();

	// 게임 실행 메소드
	public void start() {
		while (true) {
			Scanner sc = new Scanner(System.in);

			// 사용자가 입력한 round 만큼 게임진행
			System.out.print("진행할 게임의 판 수를 입력하세요.");
			int round = sc.nextInt();
			wdl = new int[round];

			// 총 round만큼 진행
			for (int i = 0; i < wdl.length; i++) {
				// 클래스 안에 랜덤 변수를 발생시키는 메소드
				// 1 ~ 3까지 랜덤 변수 발생(1:가위, 2:바위, 3:보)
				int randomVal = generateRandom();
				// int randomVal2 = generateRandom();

				// 사용자 입력 값 받아서 정수형 변환해주는 메소드
				int userNum = convertUserInput(sc);

				if (userNum > 3 || userNum < 0) {
					System.out.println("잘못 입력하셨습니다.");
					// 해당 게임을 다시 진행하기 위해 1 감소
					// for문에서 continue문을 만나면 증감식으로 이동하기 때문
					i--;
					continue;
				}

				// 승, 무, 패 판단해주는 메소드
				// 가위, 바위, 보 비교
				// 무승부
				judgeWdl(userNum, randomVal, i);

			}
			// 승점 계산해주는 메소드
			// 승점 계산
			sumScore();

			if (reGame(sc)) {
				break;
			} else {
				continue;
			}
		}
	}

	// 1~3 중 랜덤 값 발생시키는 메소드
	public int generateRandom() {
		return rand.nextInt(3) + 1;
	}

	// 사용자 입력 값을 정수형을 변환해주는 메소드
	public int convertUserInput(Scanner sc) {
		System.out.println("1: 가위, 2:바위, 3:보");
		return sc.nextInt();
	}

	// 승, 무, 패 판단 메소드
	public void judgeWdl(int userNum, int randomVal, int i) {
		System.out.println(i + "판째 게임 사용자 : " + convertRSP(userNum) + " 컴터 : " + convertRSP(randomVal));
		if (userNum == randomVal) {
			draw++;
			wdl[i] = 0;
			System.out.println("비김!");
		} else if ((userNum == 1 && randomVal == 3) || (userNum == 2 && randomVal == 1)
				|| (userNum == 3 && randomVal == 2)) {
			win++;
			wdl[i] = 1;
			System.out.println("이김!");
		} else {
			lose++;
			wdl[i] = -1;
			System.out.println("짐!");
		}
	}

	public String convertRSP(int num) {
		switch (num) {
		case 1:
			return "가위";
		case 2:
			return "바위";
		case 3:
			return "보";
		}
		return null;
	}

	// 승점 계산 및 출력 메소드
	public void sumScore() {
		for (int s : wdl) {
			score += s;
		}
		System.out.println(win + "승 " + draw + "무 " + lose + "패 " + "승점은: " + score + "점입니다.");
	}

	public boolean reGame(Scanner sc) {
		System.out.println("다시 하려면 1번, 아니면 2번을 눌러주세요");
		while (true) {
			switch (sc.nextInt()) {
			case 1:
				return false;
			case 2:
				return true;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		}
	}
}

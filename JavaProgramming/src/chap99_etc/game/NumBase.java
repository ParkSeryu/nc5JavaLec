package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class NumBase extends Game{
	// 게임 룰 : 컴퓨터가 3개의 랜덤값을 가지고
	// 사용자가 3개의 숫자를 입력(중복불가능)
	// 컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를 비교하는데
	// 비교하는 데 숫자만 같으면 볼로 판정
	// 숫자와 위치까지 모두 같으면 스트라이크로 판정
	// 몇 스트라이크 몇 볼인지 출력
	// 3 스트라이크 게임종료
	// 다시 게임 진행할 지 물어보고(1: 리스타트, 0: 종료)

	// 스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;

	// 몇 번 맞췄는지 세어줄 변수
	private int gameCnt = 0;

	// 컴퓨터 랜덤값 담아줄 배열
	int[] com = new int[3];

	// 사용자 입력값 저장할 배열
	int[] user = new int[3];

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	// 게임 시작 메소드
	public void gameStart() {
		while (true) {
			generateRandom();

			// 컴퓨터 배열 확인
			System.out.println(com[0] + ", " + com[1] + ", " + com[2]);

			while (true) {
				strike = 0;
				ball = 0;

				getUserInput();

				// 사용자 입력값 확인
				System.out.println(user[0] + ", " + user[1] + ", " + user[2]);

				if (judgetStrike()) {
					break;
				} else {
					continue;
				}
			}

			if (reGame()) {
				continue;
			} else {
				break;
			}
		}
		
	}

	// 배열 초기화 메소드
	public void initArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
	}

	// 컴퓨터 랜덤 값 3개 생성해주는 메소드
	public void generateRandom() {
		initArray(com);
		int index = 0;
		int count = 3;

		// 중복체크가 일어나야함.
		while (index < count) {
			int comNum = rand.nextInt(9) + 1;
			if (!checkDuplicate(com, comNum)) {
				com[index++] = comNum;
			}
		}
	}

	// 유저의 입력값을 받아서 배열에 담아주는 메소드
	public void getUserInput() {
		initArray(user);
		int index = 0;
		int count = 3;
		System.out.println("세 수를 입력해 : ");
		while (index < count) {
			// 중복체크가 일어나야함.
			int userInput = sc.nextInt();
			if (userInput >= 10) {
				System.out.println("1부터 9까지만 입력해.");
				continue;
			}
			if (!checkDuplicate(user, userInput)) {
				user[index] = userInput;
				index++;
			} else {
				System.out.println("중복이잖아! 다시입력해");
			}
		}
	}

	// 중복값 체크 메소드
	public boolean checkDuplicate(int[] arr, int num) {
		// 중복 체크 로직
		for (int c : arr) {
			if (c == num) {
				return true;
			}
		}
		return false;
	}

	// 스트라이크 볼 판정하는 메소드
	public boolean judgetStrike() {
		int count = 3;
		for (int comIndex = 0; comIndex < count; comIndex++) {
			for (int userIndex = 0; userIndex < count; userIndex++) {
				if (com[comIndex] == user[userIndex]) {
					if (comIndex == userIndex) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}

		System.out.println(strike + "스트라이크 " + ball + "볼");

		if (strike == 3) {
			gameCnt++;
			return true;
		}

		return false;
	}

	// 재게임 여부
	public boolean reGame() {
		System.out.println("리겜? 1: 리스타트, 0 : 종료");
		if (sc.nextInt() == 1) {
			return true;
		}
		return false;
	}
}

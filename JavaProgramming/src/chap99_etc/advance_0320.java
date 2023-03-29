package chap99_etc;

import java.util.Scanner;

import chap99_etc.game.Game;
import chap99_etc.game.Lotto;
import chap99_etc.game.NumBase;
import chap99_etc.game.RockScissPaper;

public class advance_0320 {

	public static void main(String[] args) {
		boolean isExit = true;
		Scanner sc = new Scanner(System.in);
		Game game = null;
		while (isExit) {

			System.out.println("1.숫자야구");
			System.out.println("2.가위바위보");
			System.out.println("3.로또");
			System.out.println("4.종료");

			switch (sc.nextInt()) {
			case 1:
				game = new NumBase();
				break;
			case 2:
				game = new RockScissPaper();
				break;
			case 3:
				game = new Lotto();
				break;
			case 4:
				isExit = false;
				break;
			default:
				System.out.println("잘못입력");
				break;
			}

			if (!isExit) {
				sc.close();
				break;
			}
			
			

			game.gameStart();
		}

	}
}

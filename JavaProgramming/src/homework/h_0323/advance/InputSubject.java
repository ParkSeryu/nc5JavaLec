package homework.h_0323.advance;

import java.util.Scanner;

public class InputSubject {
	public String subject;
	public int score;

	public void inputSubject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------과목정보 입력------");
		System.out.print("과목을 입력하세요 : ");
		this.subject = sc.next();
		System.out.print("점수를 입력하세요 : ");
		this.score = sc.nextInt();
	}
}

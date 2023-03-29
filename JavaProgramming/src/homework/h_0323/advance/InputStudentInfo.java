package homework.h_0323.advance;

import java.util.Scanner;

public class InputStudentInfo {
	// 학생정보 입력
	public int sno;
	public String name;
	public int major;

	public void inputStudentInfo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("------기본정보 입력------");
		System.out.print("학번 : ");
		this.sno = sc.nextInt();
		System.out.print("이름 : ");
		this.name = sc.next();
		System.out.print("학과 (1: 수학, 2: 영어, 3: 컴퓨터 ) : ");
		this.major = sc.nextInt();
	}

}

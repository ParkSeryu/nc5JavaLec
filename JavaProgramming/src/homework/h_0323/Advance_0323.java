package homework.h_0323;

import java.util.Scanner;

import homework.h_0323.advance.ComStudent;
import homework.h_0323.advance.CommonStat;
import homework.h_0323.advance.EngStudent;
import homework.h_0323.advance.InputStudentInfo;
import homework.h_0323.advance.InputSubject;
import homework.h_0323.advance.MathStudent;
import homework.h_0323.advance.PrintStInfo;
import homework.h_0323.advance.PrintStRank;

public class Advance_0323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isExit = true;
		CommonStat cmst[] = new CommonStat[1000];
		InputStudentInfo st = new InputStudentInfo();
		InputSubject sb = new InputSubject();
		PrintStInfo printStd = new PrintStInfo();
		PrintStRank printStRank = new PrintStRank();
		int index = 0;

		while (isExit) {
			System.out.println("------학적관리------");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 전체출력");
			System.out.println("4. 학과별 성적 순위");
			System.out.println("5. 종료");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("------학생정보 입력------");
				System.out.println("1. 기본정보 입력");
				System.out.println("2. 과목정보 입력");
				switch (sc.nextInt()) {
				case 1:
					st.inputStudentInfo();
					switch (st.major) {
					case 1:
						cmst[index++] = new MathStudent(st.sno, st.name);
						break;
					case 2:
						cmst[index++] = new EngStudent(st.sno, st.name);
						break;
					case 3:
						cmst[index++] = new ComStudent(st.sno, st.name);
						break;
					}
					break;
				case 2:
					System.out.println("과목정보를 입력할 학생의 학번을 입력하세요.");
					int i = findSno(sc, cmst, index);
					if (i != 9999) {
						sb.inputSubject();
						cmst[i].saveInfo(sb.subject, sb.score);
					} else {
						System.out.println("일치하는 학번이 없습니다.");
					}
					break;
				}
				break;
			case 2:
				System.out.println("검색할 학생의 학번을 입력하세요.");
				int i = findSno(sc, cmst, index);
				if (i != 9999) {
					printStd.printStInfo(cmst[i]);
				}
				break;
			case 3:
				for (i = 0; i < index; i++) {
					printStd.printStInfo(cmst[i]);
				}
				break;
			case 4:
				printStRank.printRank(cmst);
				break;
			case 5:
				isExit = false;
				sc.close();
				break;
			default:
				System.out.println("잘못입력했어");
				break;
			}
		}
	}

	private static int findSno(Scanner sc, CommonStat[] cmst, int arrayLength) {
		int sno = sc.nextInt();
		for (int i = 0; i < arrayLength; i++) {
			if (sno == cmst[i].sno) {
				return i;
			}
		}
		return 9999;
	}

}

package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 5개 정수 입력 => 배열에 저장

		// Math.max와 Math.min을 이용하여
		// 최소값, 최대값 구하기

		Scanner sc = new Scanner(System.in);
		int userInputArray[] = new int[5];
		int max = Integer.MIN_VALUE;
		
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < userInputArray.length; i++) {
			System.out.println((i + 1) + "번째 입력");
			userInputArray[i] = sc.nextInt();
			max = Math.max(max, userInputArray[i]);
			min = Math.min(min, userInputArray[i]);
		}

		sc.close();
		System.out.println("최대값 : " + max + " 최소값 : " + min);

	}

}

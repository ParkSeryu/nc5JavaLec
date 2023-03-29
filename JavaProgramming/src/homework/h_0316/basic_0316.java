package homework.h_0316;

import java.util.Random;
import java.util.Scanner;

public class basic_0316 {
	public static void main(String[] args) {
		basic_0316 c = new basic_0316();
		// c.problem1();
		// c.problem2();
		// c.problem3();
		c.problem4();

	}

	void problem1() {
		int array[] = new int[10];
		int i;
		for (i = 0; i < array.length; i++) {
			array[i] = 3 * (i + 1);
		}

		for (--i; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

	void problem2() {
		int array[] = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			sum += array[i];

		}
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("총합 : " + sum);
		sc.close();
	}

	void problem3() {
		int array[] = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10) + 1;
		}
		for (int s : array) {
			if (s % 2 != 0) {
				System.out.print(s + " ");
			}
		}
	}

	void problem4() {
		int array[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int s : array) {
			if(s % 6 == 0) {
				System.out.print(s + " ");
			}
		}
		
		sc.close();
	}
}

package chap99_etc.game;

import java.util.Arrays;
import java.util.Random;

public class SimpleLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int stack[] = new int[6];
		int top = 0;		
		boolean flag = true;

		while (top < stack.length) {
			int lottoNumber = rand.nextInt(45) + 1;
			int pointor = 0;
			do {
				if (lottoNumber == stack[pointor]) {
					flag = false;
					break;
				}
				pointor++;
			} while (pointor <= top);
			if (flag) {
				stack[top++] = lottoNumber;
			}
		}
		
		Arrays.sort(stack);
		
		for(int s: stack) {
			System.out.print(s + " ");
		}
		
		

	}

}

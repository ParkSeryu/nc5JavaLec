package homework.h_0320;

import homework.h_0320.middle.ArrayUtility;
import homework.h_0320.middle.ArrayUtility2;

public class Middle_0320 {
	public static void main(String[] args) {
		int[] intSource = { 1, 3, 5, 7, 9 };
		double[] doubleSource = { 1.1, 3.3, 5.5, 7.7, 9.9 };

		double[] testDouble = new double[intSource.length];
		testDouble = ArrayUtility.intToDouble(intSource);
		
		int[] testInt = new int[doubleSource.length];
		testInt = ArrayUtility.doubleToInt(doubleSource);
		
//		for (int i = 0; i < intSource.length; i++) {
//			System.out.println(testInt[i]);
//		}
		
		int[] s1 = {1, 2, 3, 4, 5};
		int[] s2 = {6, 7, 8, 9, 10};
		int[] s3 = new int[s1.length + s2.length];
		
		s3 = ArrayUtility2.concat(s1, s2);
		for(int i =0; i<s3.length; i++) {
			System.out.print(s3[i]+ " ");
		}
		System.out.println();
		
		s3 = ArrayUtility2.remove(s1, s2);
		for(int i =0; i<s3.length; i++) {
			System.out.print(s3[i]+ " ");
		}
		

	}
}

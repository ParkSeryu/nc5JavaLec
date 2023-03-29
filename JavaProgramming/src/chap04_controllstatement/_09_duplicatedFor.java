package chap04_controllstatement;

public class _09_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삼각형 별 찍기
		/*
		  *
		  **
		  ***
		  ****
		  *****
		 */
		/*
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) { if (i >= j) {
		 * System.out.print("*"); } } System.out.println(); }
		 */

		/*
		      *
		  	 **
		    ***
		   ****
		  *****
		 */

		for (int l = 0; l < 5; l++) {
			for (int space = 4; space >= 0; space--) {
				if (l >= space) {
					System.out.print("*");
				} else {
					System.out.println("");
				}
			}
		}

		/*
		  *****   
		  ****
		  ***
		  **
		  *
		*/

		/*
		  *****   
		   ****
		    ***
		     **
		      *
		*/
	}

}

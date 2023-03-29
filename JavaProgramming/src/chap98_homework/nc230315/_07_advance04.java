package chap98_homework.nc230315;

public class _07_advance04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
	        for (int j = 4; j > i; j--) {
	        	if(i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
	        }
	        System.out.println();
	    }
	}

}

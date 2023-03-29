package homework.h_0320.middle;

public class ArrayUtility2 {

	public static int[] concat(int[] s1, int[] s2) {
		int[] concatArray = new int[s1.length + s2.length];
		int i = 0;
		for (int j = 0; j < s1.length; j++) {
			concatArray[i++] = s1[j];
		}
		for (int k = 0; k < s2.length; k++) {
			concatArray[i++] = s2[k];
		}
		return concatArray;
	}
	
	

	public static int[] remove(int[] s1, int[] s2) {
		int[] removeArray = new int[s1.length + s2.length];
		return removeArray;
	}
}

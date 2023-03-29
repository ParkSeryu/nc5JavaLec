package homework.h_0320.middle;

public class ArrayUtility {

	public static double[] intToDouble(int[] source) {
		double[] doubleArray = new double[source.length];
		for (int i = 0; i < doubleArray.length; i++) {
			doubleArray[i] = (double) source[i];
		}
		return doubleArray;
	}

	public static int[] doubleToInt(double[] source) {
		int[] intArray = new int[source.length];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) source[i];
		}
		return intArray;
	}
}

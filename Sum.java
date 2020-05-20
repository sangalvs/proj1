package myPackage;

public class Sum {
	public static int[] sum(int[] a, int target) {
		if (a.length < 2) {
			throw new ArrayIndexOutOfBoundsException("Array has less than two elements.");
		}
		int [] b = new int[]{-1,-1};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					b[0] = i; b[1] = j;
					break;
				}
			}
		}
		return b;
	}
}

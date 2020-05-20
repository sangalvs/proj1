package myPackage;

import java.util.Arrays;

public class BetterSum {
	public static int[] efficientSum(int[] a, int target) {
		Arrays.sort(a); // using binary removal method for more efficiency in searching elements
		
		if (a.length < 2) {
			throw new ArrayIndexOutOfBoundsException("Array has less than two elements.");
		}
		
		int lowerBound = 0;
		int upperBound = a.length - 1;
		while (lowerBound < upperBound) {
			if (a[lowerBound] + a[upperBound] == target) {
				return new int[] {lowerBound, upperBound};
			} else if (a[upperBound] + a[lowerBound] > target) {
				upperBound--;
			} else {
				lowerBound++;
			}
		}
		return new int[] {-1, -1};
	}
}

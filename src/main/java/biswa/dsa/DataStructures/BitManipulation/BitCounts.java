package biswa.dsa.DataStructures.BitManipulation;

import java.util.stream.IntStream;

import biswa.dsa.Utill.IterationHelper;

/*
 * Given an integer n, return an array ans of length n + 1 such that for each 
 * i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 */
public class BitCounts {

	public static void main(String[] args) {
		int n = 2;

		approach1(n);
		approach2(n);
	}

	public static void approach1(int n) {
		int[] res = new int[n + 1];
		while (n >= 0) {
			int k = n;
			int sum = 0;
			while (k >= 1) {
				sum += k % 2;
				k /= 2;
			}
			res[n--] = sum;
		}
		IterationHelper.iterateIntegerArray(res, "S");
	}
	
	public static void approach2(int n) {
		int[] arr = IntStream.rangeClosed(0, n).map(Integer::bitCount).toArray();
		IterationHelper.iterateIntegerArray(arr, "S");
	}
}

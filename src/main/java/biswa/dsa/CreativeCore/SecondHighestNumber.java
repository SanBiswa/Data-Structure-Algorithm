package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.Comparator;

// Find second highest number from array without using any predefined method
public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] arr = { 100, 40, 20, 25, 10, 50, 5, 34 };
		usingForLoop(arr);
		usingStreanAPI(arr);
	}

	static void usingForLoop(int[] num) {
		int high1 = 0, high2 = 0;
		for (int arr : num) {
			if (arr > high1) {
				high2 = high1;
				high1 = arr;
			} else if (arr > high2 && arr < high1) {
				high2 = arr;
			}
		}
		System.out.println(high2);
	}

	static void usingStreanAPI(int[] num) {
		int res = Arrays.stream(num)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println(res);
	}

}

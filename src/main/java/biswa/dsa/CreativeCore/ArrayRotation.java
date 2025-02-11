package biswa.dsa.CreativeCore;

/* You are given an array, you need to shift the elements or rotate the array N times.
 * Input: [1,2,3,4,5], n = 3
 * Output: [3,4,5,1,2]
 */

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 103;
		usingCoreJava(arr, n);
	}

	static void usingCoreJava(int[] arr, int n) {
		if (n - arr.length == 0) {
			for (int i : arr)
				System.out.print(i + ", ");
			return;
		}

		if (n - arr.length > 0)
			n = n - (arr.length * (n / arr.length));

		for (int i = 0; i < n; i++) {
			int store = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--)
				arr[j] = arr[j - 1];
			arr[0] = store;
		}

		for (int i : arr)
			System.out.print(i + ", ");
	}

}

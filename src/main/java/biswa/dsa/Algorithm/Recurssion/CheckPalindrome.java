package biswa.dsa.Algorithm.Recurssion;

/*
 * Check a string and an array is palindrome or not.
 */
public class CheckPalindrome {

	public static void main(String[] args) {
		String s = "madaam";
		int[] arr = { 1, 2, 2, 2, 1 };

		stringCheck(s);
		arrayCheck(arr);
	}

	// TC: O(n/2) => O(n)
	// SC: O(n)
	public static void stringCheck(String str) {
		stringRecurssion(str, 0);
	}

	public static void stringRecurssion(String str, int index) {
		if (index > str.length() / 2) {
			System.out.println("Palindrome");
			return;
		}
		if (str.charAt(index) != str.charAt(str.length() - 1 - index)) {
			System.out.println("Not Palindrome");
			return;
		}
		stringRecurssion(str, index + 1);
	}

	// TC: O(log n)
	// SC: O(1)
	public static void arrayCheck(int[] arr) {
		arrayRecurssion(arr, 0, arr.length - 1);
	}

	public static void arrayRecurssion(int[] arr, int left, int right) {
		if (left >= right) {
			System.out.println("Plaindrome");
			return;
		}
		if (arr[left++] == arr[right--]) {
			arrayRecurssion(arr, left, right);
		} else {
			System.out.println("Not Palindrome");
			return;
		}
	}

}

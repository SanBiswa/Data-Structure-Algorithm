package biswa.dsa.Algorithm.Sorting.BinarySort;

/*
 * Given an array(may be sorted may not be), where adjacent elements are same but only one
 * element is different, so you need to find out that unique element.
 */
public class FindUniqueElement {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8 };
		approach1(arr);
		approach2(arr);
	}
	
	// Linear Approach
	// TC: O(n)
	// SC: O(1)
	public static void approach1(int[] arr) {
		if (arr.length >= 2) {
			if (arr[0] != arr[1]) {
				System.out.println(arr[0]);
				return;
			}
			if (arr[arr.length - 1] != arr[arr.length - 2]) {
				System.out.println(arr[arr.length - 1]);
				return;
			}
		}
		for(int i=1; i<arr.length; i+=2) {
			if(arr[i] != arr[i-1]) {
				System.out.println(arr[i-1]);
				break;
			}
		}
	}

	// Using binary search
	// TC: O(log n)
	// SC: O(1)
	public static void approach2(int[] arr) {
		if (arr.length >= 2) {
			if (arr[0] != arr[1]) {
				System.out.println(arr[0]);
				return;
			}
			if (arr[arr.length - 1] != arr[arr.length - 2]) {
				System.out.println(arr[arr.length - 1]);
				return;
			}
		}
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
				System.out.println(arr[mid]);
				return;
			}
			if (mid % 2 == 0 && arr[mid] == arr[mid + 1]) {
				left = mid + 2;
			} else {
				right = right - 1;
			}
		}
	}

}

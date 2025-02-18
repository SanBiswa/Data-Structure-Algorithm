package biswa.dsa.DataStructures.Arrays.OneD;

/*
 * Given N array elements, count total no of elements having at least 1 element 
 * greater than itself.
 * Input: [-4, -3, 7, 9, 3, 9, 7, 4]
 * Output: 6
 */
public class OneGreaterElement {

	public static void main(String[] args) {
		int[] arr = {-4, -3, 7, 9, 3, 9, 7, 4};

		approach1(arr);
		approach2(arr);
	}

	// TC: O(n^2)
	// Using two for loops by comparing each elements.
	public static int approach1(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		return count;
	}
	
	// TC: O(n)
	// Find the maximum element, others will obviously smaller than that.
	public static int approach2(int[] arr) {
		int max = Integer.MIN_VALUE, count = 0;
		for(int i : arr) {
			if(i > max) {
				max = i;
				count = 1;
			} else if(i == max) {
				count++;
			}
		}
		max = arr.length - count;
		System.out.println(max);
		return max;
	}
}

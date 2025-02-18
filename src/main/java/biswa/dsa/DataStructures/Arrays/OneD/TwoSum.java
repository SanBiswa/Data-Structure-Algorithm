package biswa.dsa.DataStructures.Arrays.OneD;

/*
 * Given an array and k, you need to find out which two values sum is equal to k.
 * Input: [4, 7, 2, 9, 0, -3, -6, 1], k = 6
 * Output: (4, 2)
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {4, 7, 2, 9, 0, -3, -6, 1};
		int k = 6;

		int n = 7, a = 3, d = 4;
		int sum = (n*(2*a + (n-1) *d))/2;
		System.out.println(sum);
//		approach1(arr, k);
	}
	
	// TC: O(n^2)
	public static void approach1(int[] arr, int k) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == k) {
					System.out.println(arr[i] +", "+ arr[j]);
					return;
				}
			}
		}
		System.out.println("No Pair Found!");
	}

}

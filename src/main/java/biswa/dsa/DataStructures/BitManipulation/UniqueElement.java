package biswa.dsa.DataStructures.BitManipulation;

/*
 * Given an array, every element appears twice except one element which appears once, 
 * find out that unique element?
 * Input: [6, 8, 8, 7, 7, 10, 6]
 * Output: 10
 */
public class UniqueElement {

	public static void main(String[] args) {
		int[] arr = {6, 8, 8, 7, 7, 10, 6};
		
		approach1(arr);
	}

	public static void approach1(int[] arr) {
		int unique = 0;
		for(int i : arr) {
			unique = unique ^ i;
		}
		System.out.println(unique);
	}
}

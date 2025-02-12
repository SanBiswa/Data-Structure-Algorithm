package biswa.dsa.Random;

/*
 * Given a number 'N', you need to find out sum of 1st 'N' whole numbers.
 * Whole Numbers: All positive numbers starts from 0.
 * It indirectly means sum of 1st n-1 natural numbers.
 * Example: Find 1st 5 whole numbers
 * Answer: 0, 1, 2, 3, 4
 */
public class SumofWholeNumbers {

	public static void main(String[] args) {
		int num = 100;
		
		approach1(num);
	}
	
	/*
	 * Formula: (n * (n-1)) / 2
	 */
	public static void approach1(int num) {
		int sum = (num * (num-1)) / 2;
		System.out.println(sum);
	}

}

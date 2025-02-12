package biswa.dsa.Random;
/*
 * Given a number 'N', you need to find out sum of 1st 'N' natural numbers.
 * Natural Numbers: all positive numbers starts from 1.
 * Example: Find 1st 5 natural numbers.
 * Answer: 1, 2, 3, 4, 5
 */
public class SumofNaturalNumbers {

	public static void main(String[] args) {
		int num = 100;
		
		approach1(num);
	}

	/*
	 * formula: (n*(n+1)) / 2
	 */
	public static void approach1(int num) {
		int sum = (num * (num + 1)) / 2;
		System.out.println(sum);
	}
}

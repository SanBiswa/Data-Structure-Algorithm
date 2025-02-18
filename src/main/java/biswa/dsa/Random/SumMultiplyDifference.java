package biswa.dsa.Random;

/*
 * Given a number, you need to find out the difference between product of all digits and
 * sum of all the digits.
 * Input: 234
 * Output: 15
 */
public class SumMultiplyDifference {

	public static void main(String[] args) {
		int num = 234;
		System.out.println(approach1(num));
	}

	public static int approach1(int num) {
		int sum = 0, mul = 1;
		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			mul *= digit;
			num /= 10;
		}
		return mul - sum;
	}

}

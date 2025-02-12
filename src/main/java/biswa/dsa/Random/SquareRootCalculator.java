package biswa.dsa.Random;

/*
 * Given a number, you need to calculate the floor square root of that number without using
 * any predefined methods,
 * Input: 87
 * Output: 9
 */
public class SquareRootCalculator {

	public static void main(String[] args) {
		int num = 87;
		System.out.println(approach1(num));
	}
	
	public static int approach1(int num) {
		int sqrt = 0;
		int start = 1;
		while((start * start) <= num) {
			sqrt = start++;
		}
		return sqrt;
	}

}

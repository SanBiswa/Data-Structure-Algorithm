package biswa.dsa.Random;

/*
 * Given a number, you need to find out how many numbers are divisible by the given number.
 * Input: 36
 * Output: 9 (1, 2, 3, 4, 6, 9, 12, 18, 36)
 */
public class DivisibleCount {

	public static void main(String[] args) {
		int number = 36;
		
		System.out.println(approach1(number));
	}
	
	public static int approach1(int num) {
		int count = 0;
		for(int i=1; i*i<=num; i++) {
			if(num % i == 0) {
				if(num/i != i) {
					count+=2;
				} else {
					count++;
				}
			}
		}
		return count;
	}

}

package biswa.dsa.DataStructures.BitManipulation;

/*
 * Given an integer n, return true if it is a power of two. 
 * Otherwise, return false.An integer n is a power of two, 
 * if there exists an integer x such that n == 2x.
 */
public class IsPowerOfTwo {

	public static void main(String[] args) {
		int n = 2147483647;
		
		System.out.println(approach1(n));
		System.out.println(approach2(n));
		System.out.println(approach3(n));
	}
	
	// TC: O(1)
	public static boolean approach1(int n) {
		int power = 0;
		int i = 0;
		while(i < 31) {
			power = (int) Math.pow(2, i++);
			if(power == n)
				return true;
		}
		return false;
	}
	
	// TC: O(log n)
	public static boolean approach2(int n) {
		if (n == 0)
			return false;
		while(n > 0) {
			if(n == 1)
				return true;
			if(n % 2 != 0)
				break;
			n /=2;
		}
		return false;
	}
	
	// TC: O(1)
	// Multiple of 2 is always divide by 2^30.
	public static boolean approach3(int n) {
		if(n == 0) return false;
		return (1 << 30) % n == 0;
	}

}

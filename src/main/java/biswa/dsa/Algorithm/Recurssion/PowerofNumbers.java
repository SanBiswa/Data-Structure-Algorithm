package biswa.dsa.Algorithm.Recurssion;

public class PowerofNumbers {

	public static void main(String[] args) {
		int number = 2, power = 6;
		System.out.println(approach1(number, power));
		System.out.println(approach2(number, power));
	}

	// TC: O(n)
	public static int approach1(int n, int m) {
		if(m == 1)
			return n;
		return n * approach1(n, m-1);
	}
	
	// TC: O(log n)
	public static int approach2(int n, int m) {
		if(m == 1)
			return n;
		int store = approach2(n, m/2);
		if(m % 2  == 0)
			return store * store;
		else
			return store * store * n;
	}
}

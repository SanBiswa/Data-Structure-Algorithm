package biswa.dsa.Algorithm.Recurssion;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;

		System.out.println(getFactorial(n));
	}

	public static int getFactorial(int n) {
		if(n==0) return 1;
		return n * getFactorial(n-1);
	}
}

package biswa.dsa.Algorithm.Recurssion;

public class FindNthFibonacciSeries {

	public static void main(String[] args) {

		int n = 13;
		getFibonacciSeries(n);
		getPerticularFibonacciNumber(n);
	}
	
	public static void getFibonacciSeries(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();
	}
	
	public static void getPerticularFibonacciNumber(int n) {
		System.out.println(fibonacci(n));
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
//		int i = fibonacci(n - 1);
//		int j = fibonacci(n - 2);
//		return i+j;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	

}

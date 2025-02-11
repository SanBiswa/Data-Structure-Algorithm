package biswa.dsa.Recurssion;

public class FindNthFibonacciSeries {

	public static void main(String[] args) {

		int n = 13; // Get the 13th Fibonacci number
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();
		System.out.println(factorial(5));
	}

	// Recursive method to calculate Fibonacci number
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
//		int i = fibonacci(n - 1);
//		int j = fibonacci(n - 2);
//		return i+j;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static int factorial(int n) {
		if(n==0) return 1;
		return n * factorial(n-1);
	}
}

package biswa.dsa.Algorithm.Recurssion;

public class SumOfFirstNNumbers {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(calculate1(n));
		sum = 0;
		calculate2(n);
		System.out.println(n * (n + 1) / 2);
		System.out.println(calculate3(n));
	}

	static int sum = 0;

	static int calculate1(int n) {
		if (n < 1)
			return 0;
		sum += n;
		calculate1(n - 1);
		return sum;
	}

	static void calculate2(int n) {
		if (n < 1) {
			System.out.println(sum);
			return;
		}
		sum += n;
		calculate2(n - 1);
	}
	
	static int calculate3(int n) {
		if(n == 0)
			return 0;
		return n + calculate3(n-1);
	}
}

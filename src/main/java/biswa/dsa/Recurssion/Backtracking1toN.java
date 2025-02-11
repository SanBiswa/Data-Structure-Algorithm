package biswa.dsa.Recurssion;

public class Backtracking1toN {

	public static void main(String[] args) {
		int n = 10;
		print(n);
	}

	static void print(int n) {
		if (n < 1)
			return;
		print(n - 1);
		System.out.println(n);
	}

}

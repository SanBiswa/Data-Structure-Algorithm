package biswa.dsa.Algorithm.Recurssion;

public class PrintNumbersNTo1 {

	public static void main(String[] args) {
		int n = 10;
		print(n);
	}
	
	static void print(int n) {
		if(n < 1)
			return;
		System.out.println(n);
		print(--n);
	}

}

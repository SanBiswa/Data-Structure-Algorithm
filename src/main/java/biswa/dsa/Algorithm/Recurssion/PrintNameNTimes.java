package biswa.dsa.Algorithm.Recurssion;

/*Write a program to print your name N times without using any ready made loops*/
public class PrintNameNTimes {

	public static void main(String[] args) {
		int n = 5;
		print1(0, n);
		System.out.println("****************************");
		print2(0, n);
	}

	static void print1(int i, int n) {
		if(i==n)
			return;
		System.out.println("Biswa");
		print1(++i, n);
	}
	
	static void print2(int i, int n) {
		if (i > n)
			return;
		System.out.println("Biswa Ranjan Sahoo");
		print2(i + 1, n);
	}

}

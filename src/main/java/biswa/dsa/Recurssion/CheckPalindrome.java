package biswa.dsa.Recurssion;

public class CheckPalindrome {

	public static void main(String[] args) {
		String s = "madaam";
		check(s, 0);
	}

	static void check(String s, int index) {
		if (index > s.length() / 2) {
			System.out.println("Palindrome");
			return;
		}
		if (s.charAt(index) != s.charAt(s.length() - 1 - index)) {
			System.out.println("Not Palindrome");
			return;
		}
		check(s, index + 1);
	}
}

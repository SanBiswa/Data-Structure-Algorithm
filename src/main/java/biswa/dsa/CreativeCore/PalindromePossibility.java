package biswa.dsa.CreativeCore;

import java.util.HashSet;
import java.util.Set;

/* You are given string, you need to find out all possible palindrome substrings.
 * Input1: "aaa"
 * Output1: a, aa, aaa
 * 
 * Input2: "abcddcba"
 * Output2: a, b, c, d, dd, cddc, bcddcb, abcddcba
 */

public class PalindromePossibility {

	public static void main(String[] args) {
		String str = "abcddba";
		usingDualForLoop(str);
		usingRecurssion(str);
	}

	static void usingDualForLoop(String str) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (set.add("" + ch))
				System.out.println(ch);
			String store = "" + ch;
			for (int j = i + 1; j < str.length(); j++) {
				store += str.charAt(j);
				StringBuilder sb = new StringBuilder(store);
				if (sb.reverse().toString().equals(store) && set.add(store))
					System.out.println(store);
			}

		}
	}
	
	static void usingRecurssion(String str) {
		int index = 0;
		Set<String> set = new HashSet<>();
		while(index < str.length()) {
			set = checkPalindrome(str, set, index, index);// odd numbers
			if(index+1 < str.length())
				set = checkPalindrome(str, set, index, index+1); // even numbers
			index++;
		}
		System.out.println(set);
	}
	
	static Set<String> checkPalindrome(String str, Set<String> set, int left, int right) {
		while(left>=0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			set.add(str.substring(left, right+1));
			left--;
			right++;
		}
		return set;
	}
}

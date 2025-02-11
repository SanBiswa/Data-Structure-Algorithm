package biswa.dsa.CreativeCore;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		String s = "abcabcd";
		usingTwoPointers(s);
	}

	static void usingTwoPointers(String s) {
		Set<Character> set = new HashSet<>();
		int left = 0, right = 0, max = 0, start = 0;
		while (right < s.length()) {
			char ch = s.charAt(right);

			while (set.contains(ch)) {
				set.remove(s.charAt(left));
				left++;
			}

			right++;
			set.add(ch);

			if (right - left > max) {
				start = left;
				max = right - left;
			}

		}
		System.out.println("Max Substring Length is: " + max);
		System.out.println("Max Substring is: " + s.substring(start, start + max));
	}
}

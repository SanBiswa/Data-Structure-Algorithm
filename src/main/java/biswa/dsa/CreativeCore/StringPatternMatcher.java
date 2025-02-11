package biswa.dsa.CreativeCore;

import java.util.HashMap;
import java.util.Map;

/* You are given two strings: pattern string s1 and text string s2.
 * Your task is to determine whether the text string s2 follows
 * the same pattern as described by the pattern string s1.
 * input: String s1 = "abba";  String s2 = "dog cat cat dog";
 * output : true;
 */

public class StringPatternMatcher {

	public static void main(String[] args) {
		String s1 = "acca";
		String s2 = "dog cat cat dog";
		usingCoreJava(s1, s2);
	}

	static void usingCoreJava(String s1, String s2) {
		String[] words = s2.split(" ");
		if (s1.length() != words.length) {
			System.out.println("Not matched");
			return;
		}
		Map<Character, String> charString = new HashMap<>();
		Map<String, Character> stringChar = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			String word = words[i];
			if (charString.containsKey(ch)) {
				if (!charString.get(ch).equals(word)) {
					System.out.println("Not Matched");
					return;
				}
			} else {
				if (stringChar.containsKey(word)) {
					System.out.println("Not Matched");
					return;
				}
				charString.put(ch, word);
				stringChar.put(word, ch);
			}
		}
		System.out.println("Matched");
	}
}

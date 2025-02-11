package biswa.dsa.CreativeCore;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// check string palindrome
		String s1 = "madam";
		usingTwoPointers(s1);
		usingStringBuffer(s1);

		// check integer palindrome
		Integer i = 121;
		usingCoreJava(i);

		// avoid all whitespace, special characters
		String s2 = "rac, 121 !@$# Car";
		usingCharacterClass(s2);
		usingPattern(s2);

		// find if a string is palindrome, given that one deletion is allowed
		String s3 = "aabcaa"; // aabcdeaa, aabaa
		usingStreamApi(s3);
		usingCollection(s3);
	}

	static void usingTwoPointers(String s) {
		int left = 0, right = s.length() - 1;
		boolean flag = true;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				flag = false;
				break;
			}
			left++;
			right--;
		}
		if (flag)
			System.out.println(s + " is a palindrome string");
		else
			System.out.println(s + " is not a palindrome string");
	}

	static void usingStringBuffer(String s) {
		StringBuffer sb = new StringBuffer(s);
		System.out.println(s.equals(sb.reverse().toString()));
	}

	static void usingCoreJava(Integer i) {
		int store = i, test = 0;
		while (i > 0) {
			test = (test * 10) + (i % 10);
			i /= 10;
		}
		System.out.println(test == store);
	}

	static void usingCharacterClass(String s) {
		s = s.toLowerCase();
		String str = "";
		for (char ch : s.toCharArray())
			if (Character.isLetterOrDigit(ch))
				str += ch;

		int left = 0, right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				System.out.println(s + ", is not a palindrome");
				return;
			}
			left++;
			right--;
		}

		System.out.println(s + ", is a palindrome");
	}

	static void usingPattern(String s) {
		s = s.toLowerCase();
		String str = "";
		for (Character ch : s.toCharArray())
			if (ch.toString().matches("[a-z0-9]"))
				str += ch;
		StringBuilder sb = new StringBuilder(str);
		if (str.equals(sb.reverse().toString()))
			System.out.println(s + ", is a palindrome");
		else
			System.out.println(s + ", is not a palindrome");
	}

	static void usingStreamApi(String str) {
		boolean flag = str.chars().mapToObj(m -> (char) m).collect(Collectors.groupingBy(g -> g, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() % 2 != 0).count() < 3;
		System.out.println(flag);
	}
	
	static void usingCollection(String str) {
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		for(char ch : str.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		for(int i : map.values())
			if(i % 2 != 0)
				count++;
		if(count < 3)
			System.out.println(true);
		else
			System.out.println(false);
	}
}

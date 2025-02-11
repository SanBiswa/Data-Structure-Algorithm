package biswa.dsa.CreativeCore;

import java.util.Stack;

/* Decode the given input String and expected output. You are given an encoded string where
 * certain patterns are repeated, and the string is compressed using a specific encoding rule. 
 * Your task is to decode the string according to the encoding rule and return the decoded string.
 * 
 * input = a3[b2[cd]];
 * output=abcdcdbcdcdbcdcd
 * 
 * input =ab2[c2[b]]e3[a]z
 * output=abcbbcbbeaaaz
 */
		
public class StringPatternMatcher2 {

	public static void main(String[] args) {
		String s = "ab2[c2[b]]e3[a]z";
		usingCoreJava(s);
	}
	
	static void usingCoreJava(String s) {
		
		String res = "";
		String store = "";
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			if(Character.isLetter(ch)) {
				store = ch + store;
				res = ch + res;
			}
			
			if(ch == ']') {
//				for(int k)
			}
			
			if(Character.isDigit(ch)) {
				for(int j=1; j<Character.getNumericValue(ch); j++)
					res = store + res;
				store = res;
			}
		}
		System.out.println(res);
	}
}

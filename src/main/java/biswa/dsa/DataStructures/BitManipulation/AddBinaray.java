package biswa.dsa.DataStructures.BitManipulation;

/*
 * Given two binary strings a and b, return their sum as a binary string.
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinaray {

	public static void main(String[] args) {
		String a = "1010", b = "1011";
		approach1(a, b); // 10101
		approach2(a, b);
		System.out.println(approach3(a, b));
	}

	public static String approach1(String a, String b) {
		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();
		String res = "";
		int index = 0, carray = 0;
		if (ch1.length > ch2.length) {
			index = ch2.length - 1;
			for (int i = ch1.length - 1; i >= 0; i--) {
				if (index >= 0) {
					int val = Character.getNumericValue(ch1[i]) + Character.getNumericValue(ch2[index--]) + carray;
					if (val == 3) {
						res = "1" + res;
						carray = 1;
					} else if (val == 2) {
						res = "0" + res;
						carray = 1;
					} else {
						res = val + res;
						carray = 0;
					}
				} else {
					int val = Character.getNumericValue(ch1[i]) + carray;
					if (val == 2) {
						res = "0" + res;
						carray = 1;
					} else {
						res = val + res;
						carray = 0;
					}
				}
			}
		} else {
			index = ch1.length - 1;
			for (int i = ch2.length - 1; i >= 0; i--) {
				if (index >= 0) {
					int val = Character.getNumericValue(ch2[i]) + Character.getNumericValue(ch1[index--]) + carray;
					if (val == 3) {
						res = "1" + res;
						carray = 1;
					} else if (val == 2) {
						res = "0" + res;
						carray = 1;
					} else {
						res = val + res;
						carray = 0;
					}
				} else {
					int val = Character.getNumericValue(ch2[i]) + carray;
					if (val == 2) {
						res = "0" + res;
						carray = 1;
					} else {
						res = val + res;
						carray = 0;
					}
				}
			}
		}

		if (carray == 1) {
			res = carray + res;
		}
		
		System.out.println(res);
		
		return res;
	}
	
	public static void approach2(String a, String b) {
		int carry = 0, aLength = a.length()-1, bLength = b.length()-1;
		String response = "";
		while(carry == 1 || aLength >= 0 || bLength >= 0) {
			if(aLength >= 0) {
				carry += a.charAt(aLength--) - '0';
			}
			if(bLength >= 0) {
				carry += b.charAt(bLength--) - '0';
			}
			response = (carry%2) + response;
			carry /=2;
		}
		System.out.println(response);
	}
	
	public static String approach3(String a, String b) {
		if(b.length() > a.length())
			return approach3(b, a);
		int carry = 0, aLength = a.length(), bLength = b.length()-1;
		char[] charArr = new char[aLength--];
		while(aLength >= 0) {
			carry += a.charAt(aLength) - '0';
			if(bLength >= 0)
				carry += b.charAt(bLength--) - '0';
			
			charArr[aLength--] = (char) ((char)carry%2);
			carry /=2;
		}
		if(carry == 1) {
			charArr[0] = 1;
			return new String(charArr);
		}
		return new String(charArr, 1, charArr.length);
	}
}

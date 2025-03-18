package biswa.dsa.Testing;

import java.util.Arrays;

public class Test1 {
	
	public static void main(String[] args) {
		String[] str = { "flower", "flag", "float", "flat" };

		Object strr = Arrays.stream(str).sorted()
				.reduce((v1, v2) -> v1 + "#" + v2).map(m -> {
			StringBuilder sb = new StringBuilder();
			String[] strArr = m.toString().split("#");
			String minStr = strArr[0];
			for (int i = 0; i < minStr.length(); i++) {
				char ch = minStr.charAt(i);
				for (String s : strArr) {
					if (s.charAt(i) != ch)
						return sb.toString();
				}
				sb.append(ch);
			}
			return sb.toString();
		}).get();
		System.out.println(strr);
	}

	public static void approach1(int[] arr) {
		int n = arr.length;
		int j = n - 1;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				if (i != j)
					arr[i] = 0;
				j--;
			}
		}
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}

	public static void approach2(int[] arr) {

	}
}


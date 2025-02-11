package biswa.dsa.Utill;

import java.util.Arrays;

public class IterationHelper {
	
	public static void iterateIntegerArray(int[] arr, String line) {
		if (line.equals("S")) {
			for (int i = 0; i < arr.length - 1; i++)
				System.out.print(arr[i] + ", ");
			System.out.println(arr[arr.length - 1]);
		} else
			Arrays.stream(arr).forEach(System.out::println);
	}
}

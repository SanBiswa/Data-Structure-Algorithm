package biswa.dsa.Testing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		int[] arr = {6, 8, 8, 7, 7, 10, 6, 10, 100};
        int unique = 0;
	for(int i : arr) {
		unique = unique ^ i;
	}
	System.out.println(unique); // 10
	}
}
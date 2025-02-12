package biswa.dsa.Random;

import java.util.stream.IntStream;

public class PrimeCheck {

	public static void main(String[] args) {
		int number = 32;

		approach1(number);
		approach2(number);
	}

	private static void approach1(int number) {
		int count = 0;
		for (int i = 2; i * i < number; i++) {
			if (number % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

	private static void approach2(int number) {
		long count = IntStream.rangeClosed(2, (int) Math.sqrt(number)).filter(f -> number % f == 0).count();
		if (count == 0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}

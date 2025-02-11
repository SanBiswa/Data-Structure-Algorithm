package biswa.dsa.CreativeCore;

import java.util.function.Function;

public class FunctionalInterface {

	// Dynamic function as functional interface
	public static <T, R> R function(T argument, Function<T, R> fn) {
		return fn.apply(argument);
	}

	public static void main(String[] args) {
		String str = "Biswa";
		System.out.println("Length of " + str + " is: " + function(str, rtn -> rtn.length()));

		Integer i = 5;
		System.out.println("Square of " + i + " is: " + function(i, sqr -> sqr * sqr));

		String lower = "sahoo";
		System.out.println("Upper case of " + lower + " is: " + function(lower, String::toUpperCase));
	}

}

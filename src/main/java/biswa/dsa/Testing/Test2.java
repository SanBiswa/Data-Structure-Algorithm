package biswa.dsa.Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {

	}

	 public static Integer sumOfPrimes(Integer input) {
	        int sum = 0;
	        for (int i = 2; i <= input; i++) {
	            if (isPrime(i)) {
	                sum += i; // Add prime numbers to the sum
	            }
	        }
	        return sum;
	    }

	    // Helper method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num < 2) return false; // Numbers less than 2 are not prime
	        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to sqrt(num)
	            if (num % i == 0) return false; // Not a prime number
	        }
	        return true;
	    }

    /**
     * Convert a string to title case (capitalizing the first letter of each word).
     * @see <a href="https://en.wikipedia.org/wiki/Title_case">Title_case</a>
     */
    public static String convertToTitleCase(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Return the input if null or empty
        }

        // Split the string into words
        String[] words = input.split("\\s+");
        StringBuilder titleCaseResult = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Convert to title case
                String titleCaseWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                titleCaseResult.append(titleCaseWord).append(" ");
            }
        }

        // Trim trailing spaces and return
        return titleCaseResult.toString().trim();
    }

    // Group anagrams from the given array of strings
    public static List<List<String>> groupAnagrams(String[] arr) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : arr) {
            // Sort the characters of the string to find the key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            // Add to the appropriate group in the map
            anagramMap.putIfAbsent(sortedKey, new ArrayList<>());
            anagramMap.get(sortedKey).add(str);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(anagramMap.values());
    }

}
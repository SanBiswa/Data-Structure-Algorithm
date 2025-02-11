package biswa.dsa.CreativeCore;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* You have a stream of integers, some of which may cause an exception 
 * during processing (e.g., dividing by zero). Write a program that processes 
 * the stream, handles the exceptions, and collects valid results into a list.
 */
public class StreamExceptionHandling {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(10, 20, 0, 30, 5, 0);
		usingStreamApi(stream);
	}

	public static void usingStreamApi(Stream<Integer> stream) {
		List<Integer> list = stream.map(m -> {
			try {
				return 10 / m;
			} catch (Exception e) {
				System.err.println("Error dividing by " + m + ": " + e.getMessage());
			}
			return null;
		}).filter(Objects::nonNull).collect(Collectors.toList());
		
		System.out.println(list);
	}
}

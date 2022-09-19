package ch16.book.exercise.p5;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expression",
				"Java8 supports lambda expressions"
				);
		list.stream()
		.filter(a -> a.toUpperCase().contains("java".toUpperCase()))
		.forEach(a -> System.out.println(a));
	}
}

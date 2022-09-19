package ch16.book.s1604;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		names.stream()
			.distinct() // 중복제거
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("신")) //필터링 "신"으로 시작하는지
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.distinct() // 중복제거
			.filter(n -> n.startsWith("신")) // 필터링
			.forEach(n -> System.out.println(n));
	}
}

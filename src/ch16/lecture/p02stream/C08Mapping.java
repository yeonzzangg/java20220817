package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C08Mapping {
	public static void main(String[] args) {
		// IntStream (primitive type stream) -> Stream<Integer>
		IntStream.of(3, 5, 9, 1, 0) //int
		.boxed() //integer로 변환
		.sorted((a, b) -> b - a)
		.forEach(e -> System.out.println(e));
		
		
		String res = IntStream.of(3, 5, 9, 1, 0)
				.boxed() //참조타입으로 변환
				.sorted((a, b) -> b - a) // 거꾸로 정렬
				.map(e -> "" + e)
				.reduce((s1, s2) -> s1 + ", " + s2)
				.get();
		System.out.println(res);
	}
}

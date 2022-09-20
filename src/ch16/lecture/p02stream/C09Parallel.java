package ch16.lecture.p02stream;

import java.util.List;

public class C09Parallel {
	public static void main(String[] args) {
		List<String> list1 = List.of("java", "spring", "css", "jsp", "html");
		list1.parallelStream() // 병렬스트림은 순서가 보장되지 않을 수 있음
			.forEach(e -> System.out.println(e));
		
		list1.parallelStream() 
			.forEachOrdered(e -> System.out.println(e)); //순서 보장 메소드
	}
}

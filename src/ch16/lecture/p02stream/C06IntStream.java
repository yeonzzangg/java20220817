package ch16.lecture.p02stream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C06IntStream {
	public static void main(String[] args) {
		// 1~10 까지 출력
		IntStream.rangeClosed(1, 10)
			.forEach(e -> System.out.println(e));
				
		// 1~100 까지 합 출력
		int r2 = IntStream.rangeClosed(1, 100)
				.sum();
		System.out.println(r2);
		
		// 1~100 까지 수 중 홀수의 합 출력
		int r3 = IntStream.rangeClosed(1, 100)
				.filter(e -> e % 2 != 0)
				.sum();
		System.out.println(r3);
		
		// [5, 10,20,1,6]의 평균 구하기
		// OptionalDouble 더블값을 갖고 있거나 없거나~
		OptionalDouble r4 = Arrays.stream(new int[] { 5, 10, 20, 1, 6 })
				.average();
		System.out.println(r4);
		
		// 주사위(1~6) 5번 던진 결과 출력
		System.out.println("<<주사위>>");
		IntStream.generate(() -> (int)(Math.random()*6) + 1)
			.limit(5)
			.forEach(e -> System.out.println(e));
		
		// 로또번호(1~45) 6개 작은 수부터 출력(중복없이)
		System.out.println("<<로또>>");
		IntStream.generate(() -> (int)(Math.random()*45) + 1)
		.distinct() // 중복없이
		.limit(6) //6개만
		.sorted() // 작은수부터
		.forEach(e -> System.out.println(e));
	}
}

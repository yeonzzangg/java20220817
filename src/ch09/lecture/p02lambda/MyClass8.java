package ch09.lecture.p02lambda;

import java.util.Arrays;

public class MyClass8 {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		System.out.println(Arrays.toString(a1));
		
		// setAll : 배열채우기 (함수형객체나 람다식을 매개변수로 받음)
		Arrays.setAll(a1, i -> i);
		System.out.println(Arrays.toString(a1)); //문자열로 출력
		
		Arrays.setAll(a1, i -> i + 1);
		System.out.println(Arrays.toString(a1));
		
		// a1 : [0, 2, 4, 6, 8, 10, ...] index * 2;
		Arrays.setAll(a1, i -> i * 2);
		System.out.println(Arrays.toString(a1));
		
		Arrays.setAll(a1, p -> a1.length - p);
		System.out.println(Arrays.toString(a1));
	}
}







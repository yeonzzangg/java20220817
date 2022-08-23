package ch04.lecture.p01control;

import java.util.Scanner;

public class C16For {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("첫번쩨 정수 입력");
		
		System.out.println("첫번쩨 정수 입력(1보다 큰 수)");
		int start = scanner.nextInt();
		System.out.println("마지막 정수 입력(" + start + "보다 큰 수)");
		int last = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = start; i <= last; i++) {
			sum += i;
		}
		
		System.out.println("1부터" + last + "까지 합 : " + sum);
	}
}

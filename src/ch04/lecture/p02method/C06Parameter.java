package ch04.lecture.p02method;

public class C06Parameter {
	public static void main(String[] args) {
		
		sum(1, 10);
		sum(50, 100);
		sum(50, 200);
	}
	
	public static void sum(int start, int end) {
		long sum = 0;
		
		for(int i = start; i < end; i++) {
			sum += i;
		}
		System.out.println(start + "와" + end + "사이의 정수의 합은 " + sum + "입니다.");
	}
}

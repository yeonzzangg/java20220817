package ch04.lecture.p02method;

public class C09Return {
	public static void main(String[] args) {
		long a = sum(1, 10);
		System.out.println(a); //1~10 사이 정수의 합
		
		long b = sum(1, 100);
		System.out.println(b); //1~100 사이 정수의 합
		
		long c = sum(50, 200);
		System.out.println(c); //50~200 사이 정수의 합
	}
	
	public static long sum(int start, int end) {
		long total = 0;
		
		for (int i = start; i <= end; i++) {
			total += i;
		}
		return total;
	}
}

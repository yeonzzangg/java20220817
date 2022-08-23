package ch04.lecture.p02method;

public class C12Overloding {
	public static void main(String[] args) {
		double a = half(5.0);
		System.out.println(a); //2.5
		
		int b = half(5);
		System.out.println(b); //2
	}

	private static double half(double i) {
		return i/2;
	}
	
	private static int half(int j) {
		return j/2;
	}
}

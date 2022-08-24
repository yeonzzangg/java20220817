package ch05.lecture.p01array;

public class C09Array {
	public static void main(String[] args) {
		int [][] a = {{3,4}, {7,8}, {99,98}};
		int [][] b = {{1,2,3}, {4,5,6}};
		
		System.out.println(a.length);
		System.out.println(b.length);
		
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		
		System.out.println(b[0].length);
		System.out.println(b[1].length);
		
		int[] c = new int[3];
		int[][] d = new int[2][3];
		System.out.println();
	}
}

package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] a = {9,8};
		changeItem(a); //9
		
		System.out.println(a[0]); // 9
	}

	private static void changeItem(int[] arr) {
		System.out.println(arr[0]);
		arr = new int[] {3, 4};
	}
}

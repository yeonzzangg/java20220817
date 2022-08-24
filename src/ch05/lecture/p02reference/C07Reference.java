package ch05.lecture.p02reference;

public class C07Reference {
	public static void main(String[] args) {
		int[] a = {9,8,7};
		System.out.println(a[0]); // 9
		
		a = changeItem(a); // a = arr(리턴받은값!!)
		
		System.out.println(a[0]); // arr[0] = 3
	}

	private static int[] changeItem(int[] arr) {
		System.out.println(arr[0]); // 9
		arr = new int[] {3, 4, 5}; // 새로운 주소
		return arr;
	}
}

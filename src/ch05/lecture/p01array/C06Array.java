package ch05.lecture.p01array;

public class C06Array {
	public static void main(String[] args) {
		int[] arr1 = {9,8};
		int[] arr2 = {100,50};
		int[] arr3 = {99,100,101};
		
		printFirstItem(arr1); 
		printFirstItem(arr2); 
		printFirstItem(arr3);
		printFirstItem(new int[] {1000});
		
		System.out.println();
		
		printLastItem(arr1); 
		printLastItem(arr2); 
		printLastItem(arr3); 
		printLastItem(new int[] {-1}); 
		
		System.out.println();
		
		printMiddleItem(arr1); 
		printMiddleItem(arr2); 
		printMiddleItem(arr3); 
		printMiddleItem(new int[] {5,6,7,8,9} ); 
		printMiddleItem(new int[] {100,200,300,400} ); 
	}
	
	public static void printFirstItem(int[] first) {
		System.out.println(first[0]);
	}
	
	public static void printLastItem(int[] last) {
		System.out.println(last[last.length - 1]);
	}
	
	public static void printMiddleItem(int[] middle) {
		System.out.println(middle[middle.length / 2]);
	}
}

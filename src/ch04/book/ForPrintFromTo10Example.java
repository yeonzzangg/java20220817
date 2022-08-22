package ch04.book;

public class ForPrintFromTo10Example {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}
		
//		1-5
		for(int i = 1; i <= 5; i++){
			System.out.println(i);
		}

//	5-10
		for(int i = 5; i <= 10; i++){
			System.out.println(i);
		}
		
//		5-1
		for(int i = 5; i > 0; i--){
			System.out.println(i);
		}
		
//		10-5
		for(int i = 10; i >= 5; i--){
			System.out.println(i);
		}
	}
	
}

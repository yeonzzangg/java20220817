package ch04.lecture.p01control;

public class C09For {
	public static void main(String[] args) {
//		System.out.println("=====================");
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//		
//		System.out.println("=======================");
//		for(int a = 0; a < 5; a++) {
//			for(int b = 1; b < 6; b++) {
//				System.out.print(b);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("=========================");
//		for(int m = 0; m < 5; m++) {
//			for(int n = 5; n > 0; n--) {
//				System.out.print(n);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("=========================");
//		for(int k = 0; k < 5; k++) {
//			for(int l = 4; l >= 0; l--) {
//				System.out.print(l);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("=========================");
//		for(int p = 0; p < 5; p++) {
//			for(int q = 0; q <= p; q++) {
//				System.out.print(q);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("=========================");
//		for(int s = 0; s < 5; s++) {
//			for(int t = 1; t <= s+1; t++) {
//				System.out.print(t);
//			}
//			System.out.println();
//		}
//		
		System.out.println("=====================");
		int o = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(o);
				o++;
			}
			System.out.println();
		}
		
		
		System.out.println("=====================");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		for(int a = 0; a < 5; a++) {
			for(int b = 0; b < 5-a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for(int k = 0; k < 5; k++) {
			for(int s = 0; s < 4-k; s++) {
				System.out.print(" ");
			}
			
			for(int l = 0; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("======================");
		for(int x = 0; x < 5; x++) {
			for(int c = 0; c < x; c++) {
				System.out.print(" ");
			}
			for(int y = 0; y < 5-x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		int f = 0;
		for(int a = 0; a < 5; a++) {
			for(int b = 0; b <= a; b++) {
				System.out.print(f % 10);
				f++;
			}
			System.out.println();
		}

		
		
		
	}
}

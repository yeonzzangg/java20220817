package ch10.book.s100201;

public class ArrayIndexOutBoundsExceptionExample {
	public static void main(String[] args) {
		if(args.length == 3) {
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];
			
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
			System.out.println("args[2]: " + data3);
		}else {
			System.out.println("[실행방법]");
			System.out.println(" java ArrayIndexOutBoundsExceptionExample ");
			System.out.println("값1 값2");
		}
	}
}

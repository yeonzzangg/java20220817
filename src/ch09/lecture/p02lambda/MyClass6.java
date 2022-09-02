package ch09.lecture.p02lambda;

public class MyClass6 {
	public static void main(String[] args) {
		MyInterface6 o1 = () -> {
			int d = (int) (Math.random() * 6) + 1; 
			return d;
		};
		
		//결과
		int n1 = o1.method();
		System.out.println(n1);
		//결과 한줄로 줄이기
		System.out.println(o1.method());
		
		
		//한줄로 줄이기
		MyInterface6 o2 = () -> {
			return (int) (Math.random() * 6) + 1;
		};
		System.out.println(o2.method());
		
		
		// 중괄호 생략할때는 리턴도 생략해야됨!
		MyInterface6 o3 = () -> (int) (Math.random() * 6) + 1;
		System.out.println(o3.method());
		
	}
}

interface MyInterface6 {
	int method();
}







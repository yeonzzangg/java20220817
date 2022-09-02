package ch09.lecture.p02lambda;

public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 o1 = (String s) -> System.out.println(s);
		
		o1.method("hello");
		o1.method("java");
		
		
		
		// 타입생략
		MyInterface3 o2 = (s) -> System.out.println(s.repeat(2));
		
		o2.method("top");
		o2.method("gun");
		
		
		// 파라미터 하나면 소괄호 생략가능
		MyInterface3 o3 = s -> System.out.println(s.repeat(3));
		
		o3.method("coyote");
		o3.method("bob");
	}
}

interface MyInterface3 {
	void method(String s);
}





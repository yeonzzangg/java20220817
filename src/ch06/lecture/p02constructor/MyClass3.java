package ch06.lecture.p02constructor;

public class MyClass3 {
	String name;
	int age;
	
	
	// 생성자를 작성하면
	// 기본생성자(파라미터 없는 생성자)가 자동으로 삽입되지 않음
	public MyClass3(String n, int a) {
		name = n;
		age = a;
	}
}

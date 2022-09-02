package ch08.lecture.p03others;

public class MyClass12 implements MyInterface1 {
	@Override
	public void method() {
		
	}
	
	// defulat 메소드도 원하면 override 가능
	@Override
	public void method2() {
		MyInterface1.super.method2();
	}
}

package ch07.book.exercise.s06;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동"); //다른 생성자 호출?
		System.out.println("Child() call");
	}
	
	public Child(String name) {
//		super() <- 이게 생략되어 있음
		this.name = name;
		System.out.println("Child(String name) call");
	}
}

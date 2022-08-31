package ch07.book.exercise.s05;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); // 생성자 만들어서 기본생성자 만들어지지 않음. 부모클래스의 생성자 추가
		this.studentNo = studentNo;
	}
}

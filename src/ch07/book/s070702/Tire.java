package ch07.book.s070702;

public class Tire {
	// 필드
	public int maxRotation;
	public int accumulateRotation;
	public String location;
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {
		++accumulateRotation
	}
}

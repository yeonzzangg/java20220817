package ch09.book.s090502;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.TurnOn();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명객체 매개값 사용
		anony.method2(new RemoteControl() {
			@Override
			public void TurnOn() {
				System.out.println("smart tv를 켭니다");
			}

			@Override
			public void TurnOff() {
				System.out.println("smart tv를 끕니다");
			}
		});
	}
}

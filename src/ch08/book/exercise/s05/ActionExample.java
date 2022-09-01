package ch08.book.exercise.s05;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다");
			}
		};
		
//		기존 방법 : 구현 클래스 만들기
//		Action action = new Class1();
		
		action.work();
	}
}



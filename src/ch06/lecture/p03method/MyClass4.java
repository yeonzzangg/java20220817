package ch06.lecture.p03method;

public class MyClass4 {
	
	// 메소드리턴 타입 : 메소드 내에서 반환하는 값의 타입
	// 단, void는 리턴값이 없음
	
	// 리턴타입과 메소드 앞의 타입이 같도록 작성해야함
	// void는 리턴값없음. 메소드 종료의 기능만을 함
	// 리턴값을 썼으면 꼭 반환되도록
	
	void method1() {
		
		return;
		// return : 메소드 종료, 값 반환
	}
	
	int method2() {
		
		return 3;
	}
	
	int method3() {
		return 5;
	}
	
	int method4() {
		int a = 3;
		if (a == 3) {
			return 10;
		}
	
		return 9;
	}
}









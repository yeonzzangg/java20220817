package ch10.lecture.p04throws;

import java.io.FileReader;
import java.io.IOException;

public class C06Throws {
	public static void main(String[] args) throws Exception { // IOException의 상위클래스로 받음
		method1();
	}

	private static void method1() throws IOException {
		// 다형성에 의해 같거나 혹은 상위클래스의 타입으로 받을 수 있음
		FileReader a = new FileReader("a");
	}
}

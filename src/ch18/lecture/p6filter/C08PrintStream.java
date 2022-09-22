package ch18.lecture.p6filter;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class C08PrintStream {
	public static void main(String[] args) {
		String name = "C:\\Users\\user\\Desktop\\output\\output14.txt";

		try (
				FileOutputStream fis = new FileOutputStream(name);
				PrintStream ps = new PrintStream(fis);) {
			
			ps.write(97);//유니코드라서 a로 입력
			ps.print(97);//97
			
			ps.println(3.14);
			ps.println('가');
			ps.println(true);
			
			System.out.println("hello world");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}





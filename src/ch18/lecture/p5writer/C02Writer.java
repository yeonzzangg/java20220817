package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C02Writer {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\output\\output6.txt";
		Writer wr = new FileWriter(fileName);
		
		wr.write("hello\n"); // \n : enter
		wr.write("!!!!!!");
		wr.write("@@@@\t@@@@@@"); // \t : tap
		
		wr.close();
	}
}

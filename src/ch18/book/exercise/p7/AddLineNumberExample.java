package ch18.book.exercise.p7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		
		String filePath = "src/ch18/book/exercise/p7/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		int num = 0;
		while((line = br.readLine()) != null) {
			System.out.println(num + "." + line);
			num++;
		}
	}
}

package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C06Filter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		
		InputStream is = new FileInputStream(name);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String line = null;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
		isr.close();
		is.close();
	}
}

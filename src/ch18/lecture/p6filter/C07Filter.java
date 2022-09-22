package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C07Filter {
	public static void main(String[] args) throws Exception {
		String inFile = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		String outFile = "C:\\Users\\user\\Desktop\\output\\output13.txt";
		
		InputStream is = new FileInputStream(inFile);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream(outFile);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		char[] buf = new char[100];
		int len = 0;
		
		while ((len = br.read(buf)) != -1) {
			bw.write(buf, 0, len);
		}
		
		System.out.println("복사완료");
		
		bw.close();
		osw.close();
		os.close();
		
		br.close();
		isr.close();
		is.close();
	}
}

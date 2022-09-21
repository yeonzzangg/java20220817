package ch18.book.s180403;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:\\Users\\user\\Desktop\\output\\cat.jpg";
		String tagetFileName = "C:\\Users\\user\\Desktop\\output\\cat2.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName); 
		FileOutputStream fos = new FileOutputStream(tagetFileName);
		
		byte[] readBytes = new byte[100];
		int readByteNo;
		
		while( (readByteNo = fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}

package ch18.book.exercise.p11;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost", 5001));

		System.out.println("[서버 시작]");

		try {
			Socket socket = serverSocket.accept();

			InputStream is = socket.getInputStream();

			byte[] bytes = new byte[100];
			int readByteCount = -1;

			is.read(bytes);
			String fileName = new String(bytes);
			fileName = fileName.trim();

			System.out.println("[파일 받기 시작] " + fileName);

			FileOutputStream fos = new FileOutputStream("C:/Temp/" + fileName);

			while ((readByteCount = is.read(bytes)) != -1) {
				fos.write(bytes, 0, readByteCount);
			}

			System.out.println("[파일 받기 완료]");

			fos.close();
			is.close();
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

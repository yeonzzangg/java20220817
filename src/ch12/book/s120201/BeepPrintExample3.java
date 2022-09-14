package ch12.book.s120201;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				}
				catch(Exception e)}{}
			}
		})
}}

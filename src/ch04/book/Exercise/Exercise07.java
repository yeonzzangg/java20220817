package ch04.book.Exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;
		int money = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");

			balance = scanner.nextInt();

			if(balance == 1) {
				System.out.print("예금액> ");
				money += scanner.nextInt();
				System.out.println();
				
			}else if(balance == 2) {
				System.out.print("출금액> ");
				money -= scanner.nextInt();
				System.out.println();
				
			}else if(balance == 3) {
				System.out.print("잔고> " + money);
				System.out.println();
				
			}else if(balance == 4) {
				System.out.println();
				break;
			}
		}

		System.out.println("프로그램 종료");
	}
}

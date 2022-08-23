package ch04.lecture.p01control;

import java.util.Scanner;
// ctrl + shift + o : import 추가

public class C18GuessNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//컴퓨터 1~100 random
		
		System.out.println("1~100사이의 숫자를 입력하세요");
		int pc = (int)(Math.random()*100) + 1;
		
		while(true) {
			
			int user = scanner.nextInt();
			
			if(user == pc) {
				System.out.println("정답!!!!!");
				break;
			}else if(user < pc){
				System.out.println("더 큰 수를 입력하세요");
			}else {
				System.out.println("더 작은 수를 입력하세요");
			}
			
			
		}
		
	}
}

package ch06.book.s060804;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//결과출력
		System.out.println(result1);
		System.out.println(result2);
	}
}

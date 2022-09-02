package ch09.lecture.p02lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1 = a -> System.out.println(a * a);
		
		o1.accept(3); //9
		o1.accept(4);//16
		o1.accept(10);//100
		
		DoubleConsumer o2 = b -> System.out.println(b / 2);
		
		o2.accept(5);
		o2.accept(10);
		o2.accept(7);
	}
}

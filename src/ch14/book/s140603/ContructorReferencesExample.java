package ch14.book.s140603;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ContructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;
		Member member1 = function1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("신천사", "angel");
	}
}

package ch13.book.exercise.p04;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childpair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childpair, "홍삼순");
		System.out.println(childAge);
		
//		Otherpair<String, Integer> otherpair = new OtherPair<>("홍삼원", 20);
//		int otherAge = Util.getValue(otherpair, "홍삼원");
//		System.out.println(otherAge);
	}
}

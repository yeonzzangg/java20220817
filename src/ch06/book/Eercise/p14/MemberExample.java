package ch06.book.Eercise.p14;

public class MemberExample {
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("김자바", "java");
		
		System.out.println("user1.name : " + user1.name);
		System.out.println("user1.id : " + user1.id);
		
		System.out.println("user2.name : " + user2.name);
		System.out.println("user2.id : " + user2.id);
		System.out.println("user2.age : " + user2.age);
	}
}

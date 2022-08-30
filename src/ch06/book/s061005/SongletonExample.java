package ch06.book.s061005;

public class SongletonExample {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton;
//		Singleton obj2 = new Singleton;
	
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
	
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체");
		}else {
			System.out.println("다른 싱클톤 객체");
		}
	}
}

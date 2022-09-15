package ch15.book.s150301;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복이라 안들어감
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
				
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		System.out.println("향상된 for문");
		for(String element : set) {
			System.out.println(element);
		}
		
		System.out.println("Iterator 사용");
		Iterator<String> iterator1 = set.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		System.out.println("forEach 메소드 사용");
		set.forEach((e) -> System.out.println(e));
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		iterator1 = set.iterator();
		while(iterator1.hasNext()) {
			String element = iterator1.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}

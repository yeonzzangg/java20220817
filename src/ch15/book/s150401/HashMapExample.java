package ch15.book.s150401;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Map컬렉션 생성
		Map<String, Integer> map = new HashMap<>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 중복 덮어쓰기
		System.out.println("총 Entry 수: " + map.size());

		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();

		// 객체 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// EntrySet 이용
		System.out.println("EntrySet 이용");
		Set<Entry<String, Integer>> entries = map.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println();

		// forEach 메소드 사용
		System.out.println("forEach 메소드 사용");
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println();

		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());

		// 객체 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());

	}
}

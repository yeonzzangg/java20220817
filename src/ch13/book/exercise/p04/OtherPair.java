package ch13.book.exercise.p04;

public class OtherPair<K, V> {
	private K key;
	private V value;
	
	public void Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}

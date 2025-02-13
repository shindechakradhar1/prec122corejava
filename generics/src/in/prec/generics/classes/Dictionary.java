package in.prec.generics.classes;

public class Dictionary<K,V> {
	private K key;
	private V value;
	
	public void setKey(K key) {
		this.key=key;
	}
	
	public void setValue(V value) {
		this.value=value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Key: " + key + " Value:" + value;
	}
}

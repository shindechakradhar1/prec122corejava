package in.prec.collection.set.hashset;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> intSet = new HashSet<>();
//		duplicate not allowed | insertion order not preserved | only single null value allowed
		intSet.add(20);
		intSet.add(10);
		intSet.add(10);
		intSet.add(null);
		intSet.add(null);
		System.out.println(intSet);
		
		intSet.remove(null);
		intSet.remove(10);
		System.out.println(intSet);
		
		System.out.println(intSet.contains(10));
		
		System.out.println(intSet.size());
	}
}

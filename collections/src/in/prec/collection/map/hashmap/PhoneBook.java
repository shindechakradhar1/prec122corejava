package in.prec.collection.map.hashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PhoneBook {

	public static void main(String[] args) {
		LinkedHashMap<Long, String> phoneRecord = new LinkedHashMap<>();
		phoneRecord.put(9090909090L, "Ganesh");
		phoneRecord.put(9191919191L, "Gokul");
		phoneRecord.put(9696969696L, "Gokul");
		phoneRecord.put(9292929292L, "Rushikesh");
		phoneRecord.put(9393939393L, "Ashish");
		phoneRecord.put(9494949494L, "Komal");
		phoneRecord.put(9595959595L, "Sakshi");
		
//		String name=phoneRecord.get(9696969696L);
//		System.out.println(name);
//		System.out.println(phoneRecord.containsValue("Gokul"));
		
//		using advanced for loop
//		for(Long number:phoneRecord.keySet())
//			System.out.println(number);
//		
//		for(String name:phoneRecord.values())
//			System.out.println(name);
//		
//		for(Map.Entry<Long, String> phoneEntries:phoneRecord.entrySet())
//			System.out.println(phoneEntries.getKey() + ": " + phoneEntries.getValue());
		
//		forEach method
//		phoneRecord.keySet().forEach(System.out::println);
//		
//		phoneRecord.values().forEach(System.out::println);
//		
//		phoneRecord.entrySet().forEach(e->System.out.println(e.getKey() + "-> " + e.getValue()));
		
//		Iterators
		Iterator<Long> numberIterator= phoneRecord.keySet().iterator();
		while(numberIterator.hasNext())
			System.out.println(numberIterator.next());
		
		Iterator<String> nameIterator=phoneRecord.values().iterator();
		while(nameIterator.hasNext())
			System.out.println(nameIterator.next());
		
		Iterator<Entry<Long, String>> recordIterator= phoneRecord.entrySet().iterator();
		while(recordIterator.hasNext()) {
			Entry<Long, String> temp=recordIterator.next();
			System.out.println(temp.getKey() 
					+ "-> " + temp.getValue());
		}
	}
}

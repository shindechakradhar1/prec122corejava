package in.prec.collection.queue.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class StringQueue {
	public static void main(String[] args) {
		PriorityQueue<String> stringQueue = new PriorityQueue<>();
		stringQueue.add("Krushna");
		stringQueue.add("Shreyas");
		stringQueue.add("Ashish");
		stringQueue.add("Rushikesh");
		System.out.println(stringQueue);
		System.out.println(stringQueue.contains("Krushna"));
		System.out.println(stringQueue.poll());
		System.out.println(stringQueue.peek());
		System.out.println(stringQueue.peek());
		System.out.println(stringQueue.peek());
		System.out.println(stringQueue.peek());
//		System.out.println(stringQueue.poll());
//		System.out.println(stringQueue.poll());
//		System.out.println(stringQueue.poll());
//		System.out.println(stringQueue.poll());
//		System.out.println(stringQueue.remove());
		
		for(String stringVar:stringQueue)
			System.out.println(stringVar);
		
		stringQueue.forEach(e->System.out.println(e));
		stringQueue.forEach(System.out::println);
		
		Iterator<String> stringIterator=stringQueue.iterator();
		while(stringIterator.hasNext())
			System.out.println(stringIterator.next());
		
		Stream<String> stringStream=stringQueue.stream();
		stringStream.filter(str->str.length()%2==0).forEach(System.out::println);
		stringStream.close();
	}
}

package in.prec.collection.list.arraylist.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Stream;

import in.prec.collection.list.arraylist.entities.Tickets;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> bookTickets =  new ArrayList<>();
//		inserting Element add(index, element) | add(element) | set(index, element)
		bookTickets.add("A1");
		bookTickets.add("A2");
		bookTickets.add("A3");
		bookTickets.add(null);
		bookTickets.add(null);
		bookTickets.add("A6");
		bookTickets.add("A2");
		
		
		
		bookTickets.add(6, "A8");
		
		bookTickets.set(6, "A7");
		
		System.out.println(bookTickets);
//		remove Element: remove(index) | remove(element) | clear()
		bookTickets.remove(0);
		bookTickets.remove("A3");
		System.out.println(bookTickets);
//		bookTickets.clear();
//		System.out.println(bookTickets);
		
//		fetching element: get(index)
		String ticket=bookTickets.get(2);
		System.out.println(ticket);
		
		for(int i=0;i<bookTickets.size();i++)
			System.out.println(bookTickets.get(i));
		
//		fetching: contains(element) | indexOf(element) | lastIndexOf(element)
		if(bookTickets.contains("A1"))
			System.out.println("A1 record is present");
		
		int a2Index=bookTickets.lastIndexOf("A2");
		System.out.println(a2Index);
		
//		iterations using advanced for loop
		for(String tickets:bookTickets){
			System.out.println(tickets);
		}
		
//		iteration using forEach() method
//		bookTickets.forEach(e->System.out.println(e));
		bookTickets.forEach(System.out::println);
		
//		iteration using iterator()
//		Iterator<String> ticketsIterator=bookTickets.iterator();
//		while(ticketsIterator.hasNext())
//			System.out.println(ticketsIterator.next());
		ListIterator<String> ticketsIterator=bookTickets.listIterator();
		System.out.println("forward direction");
		while(ticketsIterator.hasNext())
			System.out.println(ticketsIterator.next());
		System.out.println("reverse direction");
//		revese iteration
		while(ticketsIterator.hasPrevious())
			ticketsIterator.previous();
		
//		String[] tArray=bookTickets.toArray(new String[] {});
		String[] tArray1=bookTickets.toArray(new String[0]);
		String[] tArray2=bookTickets.toArray(new String[7]);
		System.out.println(Arrays.toString(tArray1));
		
		try(Stream<String> strStream=bookTickets.stream()){
			strStream.filter(e->e!=null).forEach(System.out::println);
		}
		
//		Tickets ticket1 = new Tickets("A1", 100);
//		Tickets ticket2 = new Tickets("A1", 100);
//		if(ticket1.equals(ticket2))
//			System.out.println("Both are equal");
		
		
	}
}

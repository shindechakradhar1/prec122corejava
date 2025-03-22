package in.prec.collection.collections.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import in.prec.collection.collections.example.entities.Book;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("DBC");
		nameList.add("BBC");
		nameList.add("ABC");
		nameList.add("CBC");
		Collections.sort(nameList);
//		nameList.forEach(System.out::println);
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("Psycology of Money", 400));
		bookList.add(new Book("Head First", 300));
		bookList.add(new Book("Who Move My Cheese", 150));
//		Collections.sort(bookList, (b1,b2)->b1.getName().compareTo(b2.getName()));
		int result=Collections.binarySearch(bookList, new Book("Who Move My Cheese", 150), (b1,b2)->b1.getName().compareTo(b2.getName()));
		System.out.println(result);
//		bookList.forEach(System.out::println);
		
		List<Book> unModifiableBookList=Collections.unmodifiableList(bookList);
		unModifiableBookList.forEach(System.out::println);
		System.out.println(Collections.min(unModifiableBookList, (b1,b2)->Float.compare(b2.getPrice(), b1.getPrice())));
	}
}

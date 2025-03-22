package in.prec.collection.set.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

import in.prec.collection.set.treeset.entities.Student;

public class StudentTreeSetMain {
	public static void main(String[] args) {
		NavigableSet<Student> studentSet = new TreeSet<>();
		studentSet.add(new Student(1,"ABC", 20));
		studentSet.add(new Student(5,"BBC", 21));
		studentSet.add(new Student(3,"CBC", 22));
		studentSet.add(new Student(2,"DBC", 19));
//		studentSet.forEach(System.out::println);
		
//		System.out.println(studentSet.first());
//		System.out.println(studentSet.last());
		
//		SortedSet<Student> firstSet=studentSet.headSet(new Student(5,"",0));
		
//		firstSet.forEach(System.out::println);
		
		NavigableSet<Student> studentSetByAge = new TreeSet<>((e1,e2)->e1.getAge()-e2.getAge());
		studentSetByAge.add(new Student(0,"ABC", 18));
		studentSetByAge.add(new Student(1,"ABC", 24));
		studentSetByAge.add(new Student(5,"BBC", 22));
		studentSetByAge.add(new Student(3,"CBC", 23));
		studentSetByAge.add(new Student(2,"DBC", 19));
//		studentSetByAge.forEach(System.out::println);
		
//		System.out.println(studentSetByAge.first());
//		System.out.println(studentSetByAge.last());
		
//		SortedSet<Student> lastSet=studentSetByAge.tailSet(new Student(0,"",20));
//		lastSet.forEach(System.out::println);
		
//		studentSetByAge
//			.subSet(new Student(0,"",20),new Student(0,"",24))
//			.forEach(System.out::println);
		
//		System.out.println(studentSetByAge.pollFirst());
//		System.out.println(studentSetByAge.pollLast());
		
		
//		System.out.println(studentSet.floor(new Student(4,"BBC", 21)));
		System.out.println(studentSet.ceiling(new Student(0,"BBC", 21)));
		
	}
}

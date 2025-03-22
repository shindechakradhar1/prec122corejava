package in.prec.collection.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

import in.prec.collection.map.hashmap.entities.Student;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, Float> studentRecord = 
				new TreeMap<>();
		
		studentRecord.put("Vivek", 70000F);
		studentRecord.put("Ashish", 70000F);
//		Comparator<Student> rollNoComparator = (s1,s2)->s1.getRollNo()-s2.getRollNo();
//		studentRecord.forEach((k,v)->System.out.println(k + " -> " + v));
		NavigableMap<Student, Float> studentRecord1=new TreeMap<>((s1,s2)->s1.getRollNo()-s2.getRollNo());
		studentRecord1.put(new Student(1,"Vivek"), 70000F);
		studentRecord1.put(new Student(3,"Ashish"), 75000F);
		SortedMap<Student, Float> subStudentRecord=studentRecord1.headMap(new Student(3,"Ashish"));
//		subStudentRecord.put(new Student(2, "Rushikesh"), null);
//		studentRecord1.forEach((k,v)->System.out.println(k + " -> " + v));
		Entry<Student, Float> ceilingEntry=studentRecord1.floorEntry(new Student(2, "Rushikesh"));
		System.out.println(ceilingEntry);
	}
}

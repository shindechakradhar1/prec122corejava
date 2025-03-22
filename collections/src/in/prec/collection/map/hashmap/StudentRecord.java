package in.prec.collection.map.hashmap;

import java.util.HashMap;

import in.prec.collection.map.hashmap.entities.Student;

public class StudentRecord {
	public static void main(String[] args) {
		StudentRecord demo = new StudentRecord();
		HashMap<Student, Float> studentRecords = new HashMap<>();
		studentRecords.put(new Student(1,"Rushikesh"), 60000F);
		studentRecords.put(new Student(1,"Rushikesh"), 80000F);
		studentRecords.put(new Student(2,"Kalyan"), 60000F);
		studentRecords.put(new Student(2,"Kalyan"), 70000F);
		
		studentRecords.forEach(demo::printRecord);
	}
	
	public void printRecord(Student student, Float fees) {
		System.out.println(student + " -> " + fees);
	}
}

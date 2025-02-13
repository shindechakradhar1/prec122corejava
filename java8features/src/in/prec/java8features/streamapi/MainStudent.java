package in.prec.java8features.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import in.prec.java8features.streamapi.entities.Student;

public class MainStudent {

	public static void main(String[] args) {
		Student[] studentArray = new Student[5];
		studentArray[0]=new Student("Rushikesh", 7, 18000, "Loni");
		studentArray[1]=new Student("Suyash", 10, 12000, "Loni");
		studentArray[2]=new Student("Navnath", 13, 16000, "Chandwad");
		studentArray[3]=new Student("Sakshi", 11, 19000, "Rahata");
		studentArray[4]=new Student("Komal", 17, 15000, "Sangamner");
		
		Stream<Student> studentStream=Arrays.stream(studentArray);
		
//		String[] names=studetnStream
//		.map(student->student.getName())
////		.toArray(size->new String[size]);
//		.sorted(Comparator.reverseOrder())
//		.toArray(String[]::new);
//		System.out.println(Arrays.toString(names));
		
//		***************************************************
		
//		String[] areas=studentStream
////				.map(obj->obj.getArea())
//				.map(Student::getArea)
//				.distinct()
//				.sorted()
//				.toArray(String[]::new);
//		
//		for(String area:areas)
//			System.out.println(area);
		
//		*************************************************
		
//		double feesFromLoni=studentStream
//		.filter(student->student.getArea().equals("Loni"))
//		.mapToDouble(Student::getFees)
//		.sum();
//		
//		System.out.println(feesFromLoni);
		
		OptionalDouble maxFees=studentStream
		.mapToDouble(Student::getFees)
		.max();
		
		maxFees.ifPresent(fees->System.out.println(fees));
		
		studentStream.close();
		
		
		
	}
}

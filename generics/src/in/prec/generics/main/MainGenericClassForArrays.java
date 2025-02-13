package in.prec.generics.main;

import in.prec.generics.classes.GenericClassForArrays;
import in.prec.generics.entities.Student;

public class MainGenericClassForArrays {

	public static void main(String[] args) {
		GenericClassForArrays<Integer> intArray = new GenericClassForArrays<>();
		Integer[] intArray1 = {1,2,3,4,5};
		intArray.setTArray(1,2,3,4,5,6);
		intArray.printArray();
		
		GenericClassForArrays<String> strArray = new GenericClassForArrays<>();
		String[] nameArray = {"Vivek","Sakshi","Komal"};
		
		strArray.setTArray(nameArray);
		strArray.printArray();
		
		GenericClassForArrays<Student> stdArray = new GenericClassForArrays<>();
		Student[] stdArray1 = {
				new Student(1,"Prajakta"), 
				new Student(2, "Durga"), 
				new Student(3, "Ashish")
			};
		stdArray.setTArray(new Student(4,"Vaibhav"), new Student(5, "Krushna"));
		stdArray.printArray();
	}
}

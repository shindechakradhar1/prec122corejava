package in.prec.exception.utility;

import java.util.Scanner;

import in.prec.exception.customexceptions.InvalidAgeException;
import in.prec.exception.customexceptions.InvalidNameException;
import in.prec.exception.entities.Student;
import in.prec.exception.service.StudentService;

public class StudentUitility {

	public void intsert(Scanner scanner) {
		System.out.println("Enter Student Details");
		System.out.println("Roll No: ");
		int rollNo = scanner.nextInt();
		System.out.println("Name: ");
		String name = scanner.next();
		System.out.println("Age: ");
		int age = scanner.nextInt();
		Student student = new Student(rollNo, name, age);
		StudentService studentService = new StudentService();
		try {
			System.out.println(studentService.intsert(student));
		} catch (InvalidNameException e) {
			System.err.println(e.getMessage());
		} catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

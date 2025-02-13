package in.prec.strings.demo;

import in.prec.strings.entities.Employee;
import in.prec.strings.entities.Student;

public class StringDemo {
	public static void main(StringClassDemo[] args) {
		String name1="ABC";
		String name2="ABC";
		String name3 = new String("ABC");
		String name4 = new String("ABC");
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name3==name4);
		
		Student student =new Student();
		Student student1=new Student();
		Student student3=student;
		
		System.out.println((student==student3) + " Student");
		
		student1.setCity("Loni");
		Employee employee = new Employee();
		student.setCity(new String("Loni"));
		
		employee.setArea("Loni");
		
		if(student.getCity()==employee.getArea())
			System.out.println("City and area is a same object in C.P");
	}
}

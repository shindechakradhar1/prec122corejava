package in.prec.arrays.objectarray.main;

import in.prec.arrays.objectarray.Student;

public class MainStudent {
	public static void main(String[] args) {
		Student[] studentArray ;//=new Student[] {new Student(),new Student(), new Student()};
		
		studentArray= new Student[]{new Student()};
//		studentArray[0]=new Student();
		studentArray[0].setName("ABC");
		System.out.println(studentArray[0].getName());
	}
}

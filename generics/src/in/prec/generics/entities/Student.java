package in.prec.generics.entities;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;

	public Student() {}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Student student) {
//		using Integer.compare
//		return Integer.compare(this.rollNo, student.rollNo);
//		using compareTo
//		Integer no1=this.rollNo;
//		Integer no2=student.rollNo;
//		return no1.compareTo(no2);
		
//		using if else 
//		if(this.rollNo>student.rollNo)
//			return 1;
//		else if(this.rollNo==student.rollNo)
//			return 0;
//		else
//			return -1;
//		using calculation
//		return this.rollNo-student.rollNo;
		
		return this.name.compareTo(student.name);
	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + ": name=" + name;
	}

}

package in.prec.arrays.objectarray;

public class Student {

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
	public String toString() {
		return "Roll NO: " + rollNo + ", Name: " + name;
	}
	
	public void toString1() {
		System.out.println("Roll NO: " + rollNo + ", Name: " + name);
	}

}

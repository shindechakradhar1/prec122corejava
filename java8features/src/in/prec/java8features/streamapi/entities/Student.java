package in.prec.java8features.streamapi.entities;

public class Student {
	private String name;
	private int rollNo;
	private float fees;
	private String area;

	public Student() {}

	public Student(String name, int rollNo, float fees, String area) {
		this.name = name;
		this.rollNo = rollNo;
		this.fees = fees;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", fees=" + fees + ", area=" + area + "]";
	}

}

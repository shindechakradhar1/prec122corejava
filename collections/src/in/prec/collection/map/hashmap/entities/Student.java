package in.prec.collection.map.hashmap.entities;

import java.util.Objects;

public class Student implements Comparable<Student>{
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
	public boolean equals(Object obj){
		if(obj==null & obj.getClass()!=this.getClass())
			return false;
		if(obj==this)
			return true;
		Student tmp = (Student)obj;
		return (tmp.rollNo==this.rollNo && tmp.name.equals(this.name));	
	}
	
	@Override
	public int hashCode() {
		int hash=17;
		hash = hash * 13 + rollNo;
		hash = hash *13 + name.hashCode();
		return hash;
//		return Objects.hash(rollNo, name);
	}
	
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	}
	
	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", name=" + name + "";
	}

}

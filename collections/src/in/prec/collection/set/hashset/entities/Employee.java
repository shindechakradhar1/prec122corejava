package in.prec.collection.set.hashset.entities;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private float salary;

	public Employee() {}

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
//	
	@Override
	public int hashCode() {
		int hash=17;
		hash = hash * 13 + id;
		hash = hash * 13 + name.hashCode();
		hash = hash * 13 + (int) salary;
		return hash;
	}
//	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || this.getClass()!=obj.getClass())
			return false;
		
		Employee temp = (Employee)obj;
		
		return (this.id==temp.id && this.name.equals(temp.name) && this.salary==temp.salary);
		
	}
	
	@Override
	public int compareTo(Employee emp) {
		return (int)(this.salary-emp.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

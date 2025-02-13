package in.prec.association.entities;

import java.util.Arrays;

public class Department {
	private String name;
	private String managerName;
	private Employee[] empArray;
	
	public Department() {}

	public Department(String name, String managerName) {
		this.name = name;
		this.managerName = managerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManagerName() {
		return managerName;
	}

	public Employee[] getEmpArray() {
		return empArray;
	}

	public void setEmpArray(Employee[] empArray) {
		this.empArray = empArray;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", managerName=" + managerName + " " + Arrays.toString(empArray) + "]";
	}

}

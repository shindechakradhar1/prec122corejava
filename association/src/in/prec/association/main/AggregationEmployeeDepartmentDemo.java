package in.prec.association.main;

import in.prec.association.entities.Department;
import in.prec.association.entities.Employee;

public class AggregationEmployeeDepartmentDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Department dept = new Department("Accounts", "Ayush");
		emp1.setName("EMP1");
		emp1.setEmpId(1);
		emp1.setSalary(10000.23F);
		emp1.setDept(dept);
		
		System.out.println(emp1);
	}
}

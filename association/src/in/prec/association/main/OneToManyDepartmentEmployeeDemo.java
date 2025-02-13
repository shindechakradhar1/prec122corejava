package in.prec.association.main;

import in.prec.association.entities.Department;
import in.prec.association.entities.Employee;

public class OneToManyDepartmentEmployeeDemo {
	public static void main(String[] args) {
		Department dept = new Department("HR", "Alia");
		System.out.println(dept);
		
		Employee[] empArray = { new Employee(), new Employee()};
		empArray[0].setName("Deepika");
		empArray[0].setEmpId(1);
		empArray[0].setSalary(5000);
		empArray[1].setName("Karishma");
		empArray[1].setEmpId(2);
		empArray[1].setSalary(1000);
		
		dept.setEmpArray(empArray);
		System.out.println(dept);
		
	}
}

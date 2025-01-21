package in.prec.staticandfinal.employeedemo.main;

import in.prec.staticandfinal.employeedemo.EmployeeDemo;

public class MainEmployeeDemo {
	public static void main(String[] args) {
		EmployeeDemo.setOrganizationName("Apple");
		
		EmployeeDemo employee1 = new EmployeeDemo("ABC", 30000F, 50);
		EmployeeDemo employee2 = new EmployeeDemo("BBC", 31000F, 51);
		EmployeeDemo employee3 = new EmployeeDemo("CBC", 32000F, 52);
		EmployeeDemo employee4 = new EmployeeDemo("DBC", 33000F, 53);
		EmployeeDemo employee5 = new EmployeeDemo("EBC", 34000F, 54);
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
		
		EmployeeDemo.setOrganizationName("Microsoft");
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
	}
}

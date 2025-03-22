package in.prec.collection.set.hashset;

import java.util.HashSet;

import in.prec.collection.set.hashset.entities.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		HashSet<Employee> employeeRecord = new HashSet<>();
		
		employeeRecord.add(new Employee(1,"ABC", 30000));
		employeeRecord.add(new Employee(2,"BBC", 40000));
		employeeRecord.add(new Employee(3,"CBC", 60000));
		
		System.out.println(employeeRecord);
		
//		System.out.println(employeeRecord.contains(new Employee(2,"BBC", 40000)));
//		
//		employeeRecord.remove(new Employee(2,"BBC", 40000));
//		
//		System.out.println(employeeRecord);
		
	}
}

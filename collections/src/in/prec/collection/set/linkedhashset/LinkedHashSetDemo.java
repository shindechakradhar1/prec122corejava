package in.prec.collection.set.linkedhashset;

import java.util.LinkedHashSet;

import in.prec.collection.set.hashset.entities.Employee;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
//		LinkedHashSet<String> stringSet = new LinkedHashSet<>();
//		
//		stringSet.add("DBC");
//		stringSet.add("BBC");
//		stringSet.add(null);
//		stringSet.add("ABC");
//		
//		stringSet.forEach(System.out::println);
//		
//		stringSet.remove(null);
//		
//		System.out.println(stringSet.size());
//		System.out.println(stringSet.contains("ABC"));
		LinkedHashSet<Employee> employeeRecord = new LinkedHashSet<>();
		
		employeeRecord.add(new Employee(1,"ABC", 30000));
		employeeRecord.add(new Employee(2,"BBC", 40000));
		employeeRecord.add(new Employee(1,"ABC", 30000));
//		
//		System.out.println(employeeRecord);
		
//		System.out.println(employeeRecord.contains(new Employee(2,"BBC", 40000)));
//		
//		employeeRecord.remove(new Employee(2,"BBC", 40000));
//		
		
//		for(Employee employee:employeeRecord)
//			System.out.println(employee);
//		
//		employeeRecord.forEach(System.out::println);
//
//		Iterator<Employee> empIterator= employeeRecord.iterator();
//		while(empIterator.hasNext())
//			System.out.println(empIterator.next());
//		
		employeeRecord.forEach(e->System.out.println(e.toString()));
//		employeeRecord.stream().filter(e->e.getSalary()>30000).forEach(System.out::println);
		
	}
}

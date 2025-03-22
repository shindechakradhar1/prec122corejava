package in.prec.collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

import in.prec.collection.set.hashset.entities.Employee;

public class TreeSetDemo {
	public static void main(String[] args) {
////		Null values are not allowed in Treeset
//		TreeSet<String> intTreeSet = new TreeSet<>();
//		
//		intTreeSet.add("BBC");
//		intTreeSet.add("DBC");
//		intTreeSet.add("ABC");
//		intTreeSet.add("DBC");
//		
//		System.out.println(intTreeSet);
		
		Comparator<Employee> empNameComparator = (e1,e2)->e1.getName().compareTo(e2.getName());
		
		TreeSet<Employee> employeeSalaryTreeSet = new TreeSet<>();
		
		employeeSalaryTreeSet.add(new Employee(1,"CBC", 54000));
		employeeSalaryTreeSet.add(new Employee(2,"BBC", 51000));
		employeeSalaryTreeSet.add(new Employee(3,"BBC", 52000));
		employeeSalaryTreeSet.add(new Employee(4,"ABC", 49000));
		System.out.println(employeeSalaryTreeSet);
		
		
		TreeSet<Employee> employeeTreeSet = new TreeSet<>(empNameComparator);
		
		employeeTreeSet.add(new Employee(1,"CBC", 54000));
		employeeTreeSet.add(new Employee(2,"BBC", 51000));
		employeeTreeSet.add(new Employee(3,"BBC", 52000));
		employeeTreeSet.add(new Employee(4,"ABC", 49000));
		System.out.println(employeeTreeSet);
	}

}
